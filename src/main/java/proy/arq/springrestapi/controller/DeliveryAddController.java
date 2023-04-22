package proy.arq.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proy.arq.springrestapi.model.DeliveryAdd;
import proy.arq.springrestapi.service.DeliveryAddService;

@RestController
public class DeliveryAddController {

	@Autowired
	private DeliveryAddService eService;
	
	@GetMapping("/Delivery")
	public List<DeliveryAdd> getDeliveryAdds() {
		return eService.getDeliveryAdd();
	}

	@GetMapping("/Delivery/{id}")
	public DeliveryAdd getDelivery_add(@PathVariable("id") Long id) {
		return eService.getSingleDeliveryAdd(id);
	}

	@PostMapping("/Delivery")
	public DeliveryAdd saveDelivery_add (@RequestBody DeliveryAdd deliveryAdd) {
		return eService.saveDeliveryAdd(deliveryAdd);
	}

	@PutMapping("/Delivery/{id}")
	public DeliveryAdd updateDeliveryAdd(@PathVariable Long id, @RequestBody DeliveryAdd deliveryAdd) {
		
		deliveryAdd.setAdd_id(id);
		return eService.saveDeliveryAdd(deliveryAdd);
	}

	@DeleteMapping("/Delivery")
	public void deleteDeliveryAdd(@RequestParam("id") Long id) {
		eService.deleteDeliveryAdd(id);
	}

}
