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

import proy.arq.springrestapi.model.Product;
import proy.arq.springrestapi.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService eService;
	
	@GetMapping("/product")
	public List<Product> getProducts() {
		return eService.getProduct();
	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		return eService.getSingleProduct(id);
	}
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return eService.saveProduct(product);
	}
	
	@PutMapping("/product/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
		product.setProduct_id(id);
		return eService.saveProduct(product);
	}
	
	
	@DeleteMapping("/product")
	public void deleteProduct(@RequestParam("id") Long id) {
		eService.deleteProduct(id);
	}
	
}
