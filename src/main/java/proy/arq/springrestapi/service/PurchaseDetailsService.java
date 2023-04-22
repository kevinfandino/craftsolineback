package proy.arq.springrestapi.service;

import java.util.List;

import proy.arq.springrestapi.model.PurchaseDetails;

public interface PurchaseDetailsService {
	
	List<PurchaseDetails> getPurchaseDetails();
	
	PurchaseDetails savePurchaseDetails(PurchaseDetails purchaseDetails);
	
	PurchaseDetails getSinglePurchaseDetails (Long id);
	
	void deletePurchaseDetails (Long id);
	
	PurchaseDetails updatePurchaseDetails (PurchaseDetails purchaseDetails);

}
