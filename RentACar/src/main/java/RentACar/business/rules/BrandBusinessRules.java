package RentACar.business.rules;

import org.springframework.stereotype.Service;

import RentACar.core.utilities.exceptions.BusinessException;
import RentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class BrandBusinessRules {
	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExist(String name)
	{
		if(this.brandRepository.existsByName(name))
		{
			throw new BusinessException("Brand name already exists");// java exception types
		}
	}

	public void checkIfBrandIdExist(int id) {
		if(!this.brandRepository.existsById(id))
		{
			throw new BusinessException("Brand Id not exists");
		}
		
	}
}
