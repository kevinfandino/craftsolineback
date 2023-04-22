package proy.arq.springrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import proy.arq.springrestapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p WHERE LOWER(p.product_name) LIKE LOWER(CONCAT('%', ?1, '%'))")
	  List<Product> findByProductName(String word);
}
