package RentACar.business.requests.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {
	private int id;
	private String plate;
	private double dailyPrice;
	private int modelYear;
	private int State;
	private int modelId;
}
