package RentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import RentACar.business.abstracts.BrandService;
import RentACar.business.requests.brand.CreateBrandRequest;
import RentACar.business.requests.brand.UpdateBrandRequest;
import RentACar.business.responses.brand.GetAllBrandsResponse;
import RentACar.business.responses.brand.GetByIdBrandResponse;
import RentACar.business.rules.BrandBusinessRules;
import RentACar.core.utilities.mappers.ModelMapperService;
import RentACar.dataAccess.abstracts.BrandRepository;
import RentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
@Service 
@AllArgsConstructor
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;
	private BrandBusinessRules brandBusinessRules;
	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponses = brands.stream().map(brand->this.modelMapperService.forResponse()
				.map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
		return brandsResponses;
	}


	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		brandBusinessRules.checkIfBrandNameExist(createBrandRequest.getName());
		this.brandBusinessRules.checkIfBrandNameExist(createBrandRequest.getName());
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		brandRepository.save(brand);
 	}


	@Override
	public GetByIdBrandResponse getById(int id){
		brandBusinessRules.checkIfBrandIdExist(id);
		Brand brand = brandRepository.findById(id).orElseThrow();
		GetByIdBrandResponse brandResponse = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		
		return brandResponse;
	}


	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		brandBusinessRules.checkIfBrandIdExist(updateBrandRequest.getId());
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		brandRepository.save(brand);
		
	}


	@Override
	public void delete(int id) {
		brandBusinessRules.checkIfBrandIdExist(id);
		brandRepository.deleteById(id);
		
	}           

}
