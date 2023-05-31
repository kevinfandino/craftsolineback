package proy.arq.springrestapi.model;

import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="tbl_product")

public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Long product_id;
	
	
	@Column(name="product_name")
	private String product_name;
	
	@Column(name="ean_code")
	private Long product_ean_code;
	
	@Column(name="product_brand")
	private String product_brand;
	
	@Column(name="product_description")
	private String product_description;
	
	@Column(name="product_inventory")
	private Long product_inventory;
	
	@Column(name="product_price")
	private Long product_price;
	
	@UpdateTimestamp
	@Column(name="product_date")
	private Date product_date;
	

	
	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Long getProduct_ean_code() {
		return product_ean_code;
	}

	public void setProduct_ean_code(Long product_ean_code) {
		this.product_ean_code = product_ean_code;
	}

	public String getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public Long getProduct_inventory() {
		return product_inventory;
	}

	public void setProduct_inventory(Long product_inventory) {
		this.product_inventory = product_inventory;
	}

	public Long getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Long product_price) {
		this.product_price = product_price;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

}
