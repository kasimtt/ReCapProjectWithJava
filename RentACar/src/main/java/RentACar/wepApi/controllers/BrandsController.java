package RentACar.wepApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import RentACar.business.abstracts.BrandService;
import RentACar.business.requests.CreateBrandRequest;
import RentACar.business.requests.UpdateBrandRequest;
import RentACar.business.responses.GetAllBrandsResponse;
import RentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	
	private BrandService brandService;
	
	
	@GetMapping()
	public List<GetAllBrandsResponse> getAll()
	{ 
		return brandService.GetAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdBrandResponse getById(@PathVariable int id)
	{
		return brandService.getById(id);
	}
	
	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void Add(@RequestBody CreateBrandRequest createBrandRequest)
	{
		brandService.Add(createBrandRequest);
	}
	
	@PutMapping()
	public void Update(@RequestBody UpdateBrandRequest updateBrandRequest)
	{
		brandService.Update(updateBrandRequest);
		
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable int id)
	{
		brandService.Delete(id);
	}
}
