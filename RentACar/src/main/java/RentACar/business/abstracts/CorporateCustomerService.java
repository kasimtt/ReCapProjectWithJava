package RentACar.business.abstracts;

import java.util.List;

import RentACar.business.requests.corporateCustomer.CreateCorporateCustomerRequest;
import RentACar.business.requests.corporateCustomer.UpdateCorporateCustomerRequest;
import RentACar.business.responses.corporateCustomer.GetAllCorporateCustomerResponse;
import RentACar.business.responses.corporateCustomer.GetByIdCorporateCustomerResponse;

public interface CorporateCustomerService {
	
	void add(CreateCorporateCustomerRequest createCorporateCustomerRequest);
	void update(UpdateCorporateCustomerRequest updateCorporateCustomerRequest);
	void delete(int id);
	List<GetAllCorporateCustomerResponse> getAll();
	GetByIdCorporateCustomerResponse getById(int id);

}
