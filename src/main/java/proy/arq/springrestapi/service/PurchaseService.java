package proy.arq.springrestapi.service;

import java.util.List;

import proy.arq.springrestapi.model.Purchase;

public interface PurchaseService {

	List<Purchase> getPurchases();
	
	Purchase savePurchase(Purchase purchase);
	
	Purchase getSinglePurchase (Long id);
	
	void deletePurchase(Long id);
	
	Purchase updatePurchase (Purchase purchase);
}
