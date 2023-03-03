package RentACar.business.rules;

import org.springframework.stereotype.Service;

import RentACar.core.utilities.exceptions.BusinessException;
import RentACar.dataAccess.abstracts.CarRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CarBusinessRules {
	private CarRepository carRepository;
	
	public void CheckIfCarPlateExists(String plate)
	{
		if(carRepository.existsByPlate(plate))
		{
			throw new BusinessException("the name already exists");
		}
	}
	
	public void CheckIfCarIdExists(int id)
	{
		if(!carRepository.existsById(id))
		{
			throw new BusinessException("the id not exists");
		}
	}

}
