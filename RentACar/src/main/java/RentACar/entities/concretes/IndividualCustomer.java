package RentACar.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class IndividualCustomer extends Customer{
	
	public int indvidualCustomerId;
	public String firstName;
	public String lastName;
	public String birthDay;
}
