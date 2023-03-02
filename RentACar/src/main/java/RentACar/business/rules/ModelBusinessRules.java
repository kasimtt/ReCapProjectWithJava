package RentACar.business.rules;

import org.springframework.stereotype.Service;

import RentACar.business.requests.model.UpdateModelRequest;
import RentACar.core.utilities.exceptions.BusinessException;
import RentACar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ModelBusinessRules {
	private ModelRepository modelRepository;

	public void checkIfModelNameExists(String name)
	{
		if(this.modelRepository.existsByName(name))
		{
			throw new BusinessException("Model AlReady Exists");
		}
		
	}

	public void checkIfModelIdExists(int id) {
		// TODO Auto-generated method stub
		if(!this.modelRepository.existsById(id))
		{
			throw new BusinessException("Model id not exists");
		}
	}
}
