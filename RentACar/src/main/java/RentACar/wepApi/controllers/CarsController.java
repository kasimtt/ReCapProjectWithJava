package RentACar.wepApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RentACar.business.abstracts.CarService;
import RentACar.business.requests.car.CreateCarRequest;
import RentACar.business.requests.car.UpdateCarRequest;
import RentACar.business.responses.car.GetAllCarsResponse;
import RentACar.business.responses.car.GetByIdCarResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarsController {

	private CarService carService;
	
	@GetMapping()
	public List<GetAllCarsResponse> GetAll()
	{
		return carService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdCarResponse Get(@PathVariable  int id)
	{
		return carService.getById(id);
	}
	
	@PostMapping()
	public void Add(@RequestBody CreateCarRequest createCarRequest)
	{
		carService.add(createCarRequest);
	}
	
	@PutMapping()
	public void Update(@RequestBody UpdateCarRequest updateCarRequest)
	{
		carService.update(updateCarRequest);
	}
	@DeleteMapping("/{id}")
	public void Delete(int id)
	{
		carService.delete(id);
	}
	
	
	
	
	
	
}
