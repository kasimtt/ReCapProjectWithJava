package RentACar.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Id;

public class Rental {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name="pick_Up_Date")
	private LocalDate pickUpDate;
	@Column(name="return_date")
	private LocalDate returnDate;
	@Column(name="total_day")
	private int TotalDay;
	@Column(name="total_price")
	private int TotalPrice;
	@OneToOne()
	@JoinColumn(name="car_id")
	private Car car;
	@OneToOne()
	@JoinColumn(name="pick_up_city_id") 
	private City pickUpCity;
	@OneToOne()
	@JoinColumn(name="return_city_id")
	private City returnCity;
	@ManyToOne()
	@JoinColumn(name="customerId")
	private Customer customer;  
	@OneToMany
	@JoinColumn(name="invoice_id")
	private List<Invoice> invoices;
	
}
