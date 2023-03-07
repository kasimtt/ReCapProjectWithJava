package RentACar.business.responses.corporateCustomer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCorporateCustomerResponse {

	private int customerId;
	private String email;
	private String password;
	private String companyName;
	private String taxtNumber;

}
