package RentACar.business.abstracts;

import java.util.List;

import RentACar.business.requests.city.CreateCityRequest;
import RentACar.business.requests.city.UpdateCityRequest;
import RentACar.business.responses.city.GetAllCityResponse;
import RentACar.business.responses.city.GetByIdCityResponse;

public interface CityService {
	
	List<GetAllCityResponse> getAll();
	GetByIdCityResponse getById(int id);
	void add(CreateCityRequest createCityResponse);
	void update(UpdateCityRequest updateCityRequest);
	void delete(int id);
}
