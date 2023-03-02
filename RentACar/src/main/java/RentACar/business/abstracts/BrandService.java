package RentACar.business.abstracts;

import java.util.List;

import RentACar.business.requests.brand.CreateBrandRequest;
import RentACar.business.requests.brand.UpdateBrandRequest;
import RentACar.business.responses.brand.GetAllBrandsResponse;
import RentACar.business.responses.brand.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
}
