package proy.arq.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proy.arq.springrestapi.model.DeliveryAdd;
import proy.arq.springrestapi.repository.DeliveryAddRepository;

@Service
public class ServiceDeliveryAdd implements DeliveryAddService {
	
	@Autowired
	private DeliveryAddRepository eRepository;
	
	@Override
	public List<DeliveryAdd> getDeliveryAdd(){
		return eRepository.findAll();
	}
	
	@Override
	public DeliveryAdd saveDeliveryAdd(DeliveryAdd deliveryAdd) {
		return eRepository.save(deliveryAdd);
	}

	@Override
	public DeliveryAdd getSingleDeliveryAdd(Long id) {
		
		Optional<DeliveryAdd> deliveryAdd = eRepository.findById(id);
		if(deliveryAdd.isPresent()) {
			return deliveryAdd.get();
		}
		throw new RuntimeException("No se encuentra direccion de envio con el ID" +id);

	}

	@Override
	public void deleteDeliveryAdd(Long id) {
		eRepository.deleteById(id);
		
	}

	@Override
	public DeliveryAdd updateDeliveryAdd(DeliveryAdd deliveryAdd) {
		return eRepository.save(deliveryAdd);
	}

}
