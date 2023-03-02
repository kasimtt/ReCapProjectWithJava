package RentACar.business.responses.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllModelsResponse {
	
	private int id;
	private String name;
	private String brandName;
}
