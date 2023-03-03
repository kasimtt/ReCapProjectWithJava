package RentACar.entities.concretes;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Address {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "contact_address")
	private String ContactAddress;
	@Column(name = "invoiceAddress")
	private String InvoiceAddress;
	@ManyToOne()
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
