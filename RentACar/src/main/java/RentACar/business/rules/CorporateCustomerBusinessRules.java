package RentACar.business.rules;

import org.springframework.stereotype.Service;

import RentACar.core.utilities.exceptions.BusinessException;
import RentACar.dataAccess.abstracts.CorporateCustomerRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CorporateCustomerBusinessRules {

	private CorporateCustomerRepository corporateCustomerRepository;
	
	public void CheckIfCompanyNameExists(String name)
	{
		if(corporateCustomerRepository.existsByName(name))
		{
			throw new BusinessException("the company already exists");
		}
	}
	public void CheckIfIdExists(int id)
	{
		if(!corporateCustomerRepository.existsById(id))
		{
			throw new BusinessException("the id not exists");
		}
	}
	
}
