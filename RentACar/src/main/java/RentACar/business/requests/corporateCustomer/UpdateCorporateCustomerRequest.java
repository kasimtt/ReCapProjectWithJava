package RentACar.business.requests.corporateCustomer;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCorporateCustomerRequest {
	
	@NotNull
	@NotEmpty
	private int id;
	@NotNull
	@NotEmpty
	//@NotBlank
	private String password;
	@NotNull
	@NotEmpty
	private String email;
	@NotEmpty
	@NotNull
	private int taxtNumber;
	@NotEmpty
	@NotNull
	private String companyName;
}
