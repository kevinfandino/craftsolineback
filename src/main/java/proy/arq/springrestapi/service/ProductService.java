package proy.arq.springrestapi.service;

import java.util.List;

import proy.arq.springrestapi.model.Product;

public interface ProductService {
	
	List<Product> getProduct();
	
	Product saveProduct(Product product);
	
	Product getSingleProduct(Long id);

	void deleteProduct (Long id);
	
	Product updateProduct (Product product);
	
	List<Product> searchProduct(String word);
}
