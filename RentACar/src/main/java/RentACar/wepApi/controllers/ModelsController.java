package RentACar.wepApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import RentACar.business.abstracts.ModelService;
import RentACar.business.requests.model.CreateModelRequest;
import RentACar.business.requests.model.UpdateModelRequest;
import RentACar.business.responses.model.GetAllModelsResponse;
import RentACar.business.responses.model.GetByIdModelResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
	private ModelService modelService;
	
	@GetMapping()
	public List<GetAllModelsResponse> getAll()
	{
		return modelService.getAll();
	}
	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void Add(@RequestBody @Valid CreateModelRequest createModelRequest) 
	{
		modelService.add(createModelRequest);
	}
	
	@GetMapping("/{id}")
	public GetByIdModelResponse GetById(@PathVariable int id)
	{
		return modelService.getModelById(id);
	}
	
    @PutMapping()
	public void Update(@RequestBody @Valid UpdateModelRequest updateModelRequest)
	{
		modelService.update(updateModelRequest);
	}
    @DeleteMapping()
    public void Delete(int id)
    {
    	modelService.delete(id);
    }
}
