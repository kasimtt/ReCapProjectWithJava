package RentACar.business.abstracts;

import java.util.List;

import RentACar.business.requests.model.CreateModelRequest;
import RentACar.business.requests.model.UpdateModelRequest;
import RentACar.business.responses.model.GetAllModelsResponse;
import RentACar.business.responses.model.GetByIdModelResponse;

public interface ModelService {

	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);
	void update(UpdateModelRequest updateModelRequest);
	void delete(int id);
	GetByIdModelResponse getModelById(int id);
}
