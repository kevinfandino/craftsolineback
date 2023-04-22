package proy.arq.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proy.arq.springrestapi.model.PurchaseDetails;
import proy.arq.springrestapi.repository.PurchaseDetailsRepository;

@Service
public class ServicePurchaseDetails implements PurchaseDetailsService {
	
	@Autowired
	private PurchaseDetailsRepository eRepository;
	
	@Override
	public List<PurchaseDetails> getPurchaseDetails(){
		return eRepository.findAll();
	}
	
	@Override
	public PurchaseDetails savePurchaseDetails(PurchaseDetails purchaseDetails) {
		return eRepository.save(purchaseDetails);
	}

	@Override
	public PurchaseDetails getSinglePurchaseDetails(Long id) {
		Optional<PurchaseDetails> purchaseDetails = eRepository.findById(id);
		if(purchaseDetails.isPresent()) {
			return purchaseDetails.get();
		}
		throw new RuntimeException("No se encuentran detalles de la orden con ID" +id);

	}

	@Override
	public void deletePurchaseDetails(Long id) {
		eRepository.deleteById(id);
		
	}

	@Override
	public PurchaseDetails updatePurchaseDetails(PurchaseDetails purchaseDetails) {
		return eRepository.save(purchaseDetails);
	}
	
}
