package RentACar.business.rules;

import org.springframework.stereotype.Service;

import RentACar.core.utilities.exceptions.BusinessException;
import RentACar.dataAccess.abstracts.CityRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CityBusinessRules {
	
	private CityRepository cityRepository;
	
	public void CheckIfNameExists(String name)
	{
		if(cityRepository.existsByName(name))
		{
		   throw new BusinessException("the name already exists");
		}
	}
	
	public void CheckIfIdExists(int id)
	{
		if(!cityRepository.existsById(id))
		{
			throw new BusinessException("the id not exists");
		}
	}

	
}
