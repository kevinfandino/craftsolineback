package proy.arq.springrestapi.service;

import java.util.List;

import proy.arq.springrestapi.model.DeliveryAdd;

public interface DeliveryAddService {
	
	List<DeliveryAdd> getDeliveryAdd();
	
	DeliveryAdd saveDeliveryAdd(DeliveryAdd deliveryAdd);
	
	DeliveryAdd getSingleDeliveryAdd(Long id);
	
	void deleteDeliveryAdd(Long id);
	
	DeliveryAdd updateDeliveryAdd (DeliveryAdd deliveryAdd);
}
