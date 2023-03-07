package RentACar.business.requests.address;

import RentACar.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAddressRequest {

	private String ContactAddress;
	private String InvoiceAddress;
	private Customer customer;

}
