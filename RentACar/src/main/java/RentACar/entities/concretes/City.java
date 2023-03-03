package RentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cities")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name = "name")
	private String name;
	@OneToMany(mappedBy= "city")
	private List<Car> car;
	@OneToMany(mappedBy="puckUpCity")
	private List<Rental> pickUpCityRental;
	@OneToMany(mappedBy="returnCity")
	private List<Rental> returnCityRental;
	
}
