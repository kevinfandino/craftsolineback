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

import proy.arq.springrestapi.model.Purchase;
import proy.arq.springrestapi.service.PurchaseService;


@RestController
public class PurchaseCrontoller {
	
	@Autowired
	private PurchaseService eService;
	
	@GetMapping("/purchase")
	public List<Purchase> getPurchases() {
		return eService.getPurchases();
	}
	
	
	@GetMapping("/purchase/{id}")
	public Purchase getPurchase(@PathVariable("id") Long id) {
		return eService.getSinglePurchase(id);
	}
	
	@PostMapping("/purchase")
	public Purchase savePurchase(@RequestBody Purchase purchase) {
		return eService.savePurchase(purchase);
	}
	
	@PutMapping("/purchase/{id}")
	public Purchase updatePurchase(@PathVariable Long id, @RequestBody Purchase purchase) {

		purchase.setPurchase_id(id);
		return eService.updatePurchase(purchase);

	}
	
	
	@DeleteMapping("/purchase")
	public void deletePurchase(@RequestParam("id")Long id) {
		eService.deletePurchase(id);
	}

}
