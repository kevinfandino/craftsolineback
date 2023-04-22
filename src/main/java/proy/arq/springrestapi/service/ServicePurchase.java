package proy.arq.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proy.arq.springrestapi.model.Purchase;
import proy.arq.springrestapi.repository.PurchaseRepository;

@Service
public class ServicePurchase implements PurchaseService  {
	
	@Autowired
	private PurchaseRepository eRepository;
	
	
	@Override
	public List<Purchase> getPurchases(){
		return eRepository.findAll();
	}
	
	@Override
	public Purchase savePurchase(Purchase purchase) {
		return eRepository.save(purchase);
	}

	@Override
	public Purchase getSinglePurchase(Long id) {
		Optional<Purchase> purchase = eRepository.findById(id);
		if(purchase.isPresent()) {
			return purchase.get();
		}
		throw new RuntimeException("No se encontro compra con el ID "+id);

	}

	@Override
	public void deletePurchase(Long id) {
		eRepository.deleteById(id);
		
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {

		return eRepository.save(purchase);

		
		
	}

}
