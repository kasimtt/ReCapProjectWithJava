package RentACar.business.abstracts;

import java.util.List;

import RentACar.business.requests.CreateBrandRequest;
import RentACar.business.requests.UpdateBrandRequest;
import RentACar.business.responses.GetAllBrandsResponse;
import RentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> GetAll();
	GetByIdBrandResponse getById(int id);
	void Add(CreateBrandRequest createBrandRequest);
	void Update(UpdateBrandRequest updateBrandRequest);
	void Delete(int id);
}
