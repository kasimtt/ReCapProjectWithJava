package RentACar.business.responses.address;

import RentACar.entities.concretes.Customer;
import lombok.Data;
@Data

public class GetByIdResponse {
	
	private int id;
	private String ContactAddress;
	private String InvoiceAddress;
	private Customer customer;
}
