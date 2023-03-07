package RentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
public class Customer extends User {
	
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int Id;
	@OneToMany(mappedBy = "customer")
	private List<Rental> rentals;
	@OneToMany(mappedBy = "customer")
	private List<Address> addresses;
}
