package RentACar.entities.concretes;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Invoices")
public class Invoice {

	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="invoice_number")
	private int invoiceNumber; 
	@Column(name="current_date")
	private LocalDate currentDate;
	@Column(name="total_price")
	private double TotalPrice;
	@ManyToOne()
	@JoinColumn(name="rental_id")
	private Rental rental;
	@Column(name="state")
	private int state;
}
