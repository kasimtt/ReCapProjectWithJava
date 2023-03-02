package RentACar.business.responses.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarsResponse {

	private int id;
	private String plate;
	private double dailyPrice;
	private int modelYear;
	private int State;
	private String modelName;
	private String brandName;

}
