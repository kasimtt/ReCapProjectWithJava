package RentACar.business.requests.address;

import RentACar.entities.concretes.Customer;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAddressRequest {

	
	private int id;
	private String ContactAddress;
	private String InvoiceAddress;
	private Customer customer;
}
