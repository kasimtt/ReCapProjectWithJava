package RentACar;

import java.util.HashMap;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import RentACar.core.utilities.exceptions.BusinessException;
import RentACar.core.utilities.exceptions.ProblemDetails;
import RentACar.core.utilities.exceptions.ValidationProblemDetails;
import jakarta.validation.UnexpectedTypeException;
import jakarta.validation.ValidationException;

@SpringBootApplication
@RestControllerAdvice
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}
	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public ProblemDetails handleBusinessException(BusinessException businessException)
	{
		ProblemDetails problemDetail = new ProblemDetails();
		problemDetail.setMessage(businessException.getMessage());
		return problemDetail;
	}
	
	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)	
	public ProblemDetails handleValidationException(MethodArgumentNotValidException methodArgumentNotValidException)
	{
		ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
		validationProblemDetails.setMessage("validation exception");
		validationProblemDetails.setValidationErrors(new HashMap<String, String>());
		
		for (FieldError fieldError : methodArgumentNotValidException.getBindingResult().getFieldErrors()) {
			
			validationProblemDetails.getValidationErrors().put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		return validationProblemDetails;
	}
	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)	
	public ProblemDetails handleUnexpectedTypeException(UnexpectedTypeException unexpectedTypeException)
	{
		ProblemDetails problemDetail = new ProblemDetails();
		problemDetail.setMessage(unexpectedTypeException.getMessage());
		return problemDetail;
	}
	
	
	@Bean
	public ModelMapper getModelMapper()
	{
		return new ModelMapper();
	}
}
