package RentACar.business.requests.car;

import RentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateCarRequest {
	
	
	
	private String plate;
	private double dailyPrice;
	private int modelYear;
	private int State;
	private int modelId;
	
	
}
