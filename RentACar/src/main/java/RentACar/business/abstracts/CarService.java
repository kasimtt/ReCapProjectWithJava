package RentACar.business.abstracts;

import java.util.List;

import RentACar.business.requests.car.CreateCarRequest;
import RentACar.business.requests.car.UpdateCarRequest;
import RentACar.business.responses.car.GetAllCarsResponse;
import RentACar.business.responses.car.GetByIdCarResponse;

public interface CarService {
	
	List<GetAllCarsResponse> getAll();
	void add(CreateCarRequest createCarRequest);
	void update(UpdateCarRequest updateCarRequest);
	void delete(int id);
	GetByIdCarResponse getById(int id);

}
