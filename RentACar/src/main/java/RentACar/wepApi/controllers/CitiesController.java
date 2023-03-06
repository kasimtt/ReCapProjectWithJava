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

import RentACar.business.abstracts.CityService;
import RentACar.business.requests.city.CreateCityRequest;
import RentACar.business.requests.city.UpdateCityRequest;
import RentACar.business.responses.city.GetAllCityResponse;
import RentACar.business.responses.city.GetByIdCityResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cities")
@AllArgsConstructor
public class CitiesController {

	private CityService cityService;
	
	@GetMapping()
	public List<GetAllCityResponse> getAll()
	{
		return cityService.getAll();
	}
	@GetMapping("/{id}")
	public GetByIdCityResponse getById(@PathVariable int id)
	{
		return cityService.getById(id);
	}
	
 	@PostMapping()
	public void Add(@RequestBody CreateCityRequest createCityRequest)
	{
 		 cityService.add(createCityRequest);
	}
 	
 	@PutMapping()
 	public void Update(@RequestBody UpdateCityRequest updateCityRequest)
 	{
 		cityService.update(updateCityRequest);
 	}
 	
 	@DeleteMapping("/{id}")
 	public void Delete(@PathVariable int id)
 	{
 		cityService.delete(id);
 	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
}
