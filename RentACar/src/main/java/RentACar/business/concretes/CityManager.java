package RentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import RentACar.business.abstracts.CityService;
import RentACar.business.requests.city.CreateCityRequest;
import RentACar.business.requests.city.UpdateCityRequest;
import RentACar.business.responses.city.GetAllCityResponse;
import RentACar.business.responses.city.GetByIdCityResponse;
import RentACar.business.rules.CityBusinessRules;
import RentACar.core.utilities.mappers.ModelMapperService;
import RentACar.dataAccess.abstracts.CityRepository;
import RentACar.entities.concretes.City;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CityManager implements CityService{

	private CityRepository cityRepository;
	private ModelMapperService modelMapperService;
	private CityBusinessRules cityBusinessRules;
	
	@Override
	public List<GetAllCityResponse> getAll() {
		
		List<City> cities = cityRepository.findAll();
		List<GetAllCityResponse> cityResponses = cities.stream().map(city->this.modelMapperService.forResponse()
				.map(city, GetAllCityResponse.class)).collect(Collectors.toList());
		return cityResponses;
	}

	@Override
	public GetByIdCityResponse getById(int id) {
		cityBusinessRules.CheckIfIdExists(id);
		City city = cityRepository.findById(id).orElseThrow();
		GetByIdCityResponse cityResponse = this.modelMapperService.forRequest().map(city, GetByIdCityResponse.class);
		return cityResponse;
	}

	@Override
	public void add(CreateCityRequest createCityResponse) {
		cityBusinessRules.CheckIfNameExists(createCityResponse.getName());
		City city = this.modelMapperService.forRequest().map(createCityResponse, City.class);
		cityRepository.save(city);
		
	}

	@Override
	public void update(UpdateCityRequest updateCityRequest) {
		cityBusinessRules.CheckIfIdExists(updateCityRequest.getId());
		cityBusinessRules.CheckIfNameExists(updateCityRequest.getName());
		City city = this.modelMapperService.forRequest().map(updateCityRequest, City.class);
		cityRepository.save(city);
		
	}

	@Override
	public void delete(int id) {
		cityBusinessRules.CheckIfIdExists(id);
		cityRepository.deleteById(id);
		
	}

}
