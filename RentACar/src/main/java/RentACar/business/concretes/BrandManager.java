package RentACar.business.concretes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import RentACar.business.abstracts.BrandService;
import RentACar.business.requests.CreateBrandRequest;
import RentACar.business.requests.UpdateBrandRequest;
import RentACar.business.responses.GetAllBrandsResponse;
import RentACar.business.responses.GetByIdBrandResponse;
import RentACar.core.utilities.mappers.ModelMapperService;
import RentACar.dataAccess.abstracts.BrandRepository;
import RentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
@Service 
@AllArgsConstructor
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllBrandsResponse> GetAll() {
		List<Brand> brands = brandRepository.findAll();
		/*
		 * List<GetAllBrandsResponse> brandsResponses = new
		 * ArrayList<GetAllBrandsResponse>(); for (Brand brand : brands) {
		 * GetAllBrandsResponse brandsResponse = new GetAllBrandsResponse();
		 * brandsResponse.setId(brand.id); brandsResponse.setName(brand.name);
		 * brandsResponses.add(brandsResponse); }
		 */
		 
		
		List<GetAllBrandsResponse> brandsResponses = brands.stream().map(brand->this.modelMapperService.forResponse()
				.map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
		
		
		return brandsResponses;
	}


	@Override
	public void Add(CreateBrandRequest createBrandRequest) {
		
		//Brand brand = new Brand();
		//brand.setName(createBrandRequest.getName());
		
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		brandRepository.save(brand);
 	}


	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = brandRepository.findById(id).orElseThrow();
		GetByIdBrandResponse brandResponse = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		
		return brandResponse;
	}


	@Override
	public void Update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		brandRepository.save(brand);
		
	}


	@Override
	public void Delete(int id) {
		brandRepository.deleteById(id);
	}           

}
