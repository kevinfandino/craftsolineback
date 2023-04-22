package proy.arq.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Column;
import proy.arq.springrestapi.model.Product;
import proy.arq.springrestapi.repository.ProductRepository;

@Service
public class ServiceProduct implements ProductService {
	
	@Autowired
	private ProductRepository eRepository;
	
	
	@Override
	public List<Product> getProduct(){
		return eRepository.findAll();
	}
	
	@Override
	public Product saveProduct(Product product) {
		return eRepository.save(product);
	}

	@Override
	public Product getSingleProduct(Long id) {
		Optional<Product> product =eRepository.findById(id);
		if (product.isPresent()) {
			return product.get();
		}
		throw new RuntimeException("Producto no encontrado con el ID " +id);
	}

	@Override
	public void deleteProduct(Long id) {
		eRepository.deleteById(id);
		
	}

	@Override
	public Product updateProduct(Product product) {

		return eRepository.save(product);

	}

	@Override
	public List<Product> searchProduct(String name) {
		/*
		 * @Column(name="product_name")
		 private String product_name;
		 */
		return eRepository.findByProductName(name);
	}

}
