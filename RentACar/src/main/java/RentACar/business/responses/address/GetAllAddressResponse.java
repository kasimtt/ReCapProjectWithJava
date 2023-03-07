package RentACar.business.responses.address;

import RentACar.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAddressResponse {

	private int id;
	private String ContactAddress;
	private String InvoiceAddress;
	private Customer customer;
   
}
