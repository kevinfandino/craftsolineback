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

import proy.arq.springrestapi.model.PurchaseDetails;
import proy.arq.springrestapi.service.PurchaseDetailsService;

@RestController
public class PurchaseDetailsController {
	
	@Autowired
	private PurchaseDetailsService eService;

	@GetMapping("/purchaseDetails")
	public List<PurchaseDetails> getPurchasesDetails() {
		return eService.getPurchaseDetails();
	}

	@GetMapping("/purchaseDetails/{id}")
	public PurchaseDetails getPurchaseDetails(@PathVariable("id") Long id) {
		return eService.getSinglePurchaseDetails(id);
	}

	@PostMapping("/purchaseDetails")
	public PurchaseDetails savePurchaseDetails(@RequestBody PurchaseDetails purchaseDetails) {
		return eService.savePurchaseDetails(purchaseDetails);
	}

	@PutMapping("/purchaseDetails/{id}")
	public PurchaseDetails updatePurchaseDetails(@PathVariable Long id, @RequestBody PurchaseDetails purchaseDetails) {
		purchaseDetails.setDetails_id(id);
		return eService.updatePurchaseDetails(purchaseDetails);
	}

	@DeleteMapping("/purchaseDetails")
	public void deletePurchaseDetails(@RequestParam("id") Long id) {
		eService.deletePurchaseDetails(id);
	}

}
