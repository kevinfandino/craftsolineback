package proy.arq.springrestapi.model;

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
@Table(name="tbl_purchase_details")

public class PurchaseDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="details_id")
	private Long details_id;
	
	@Column(name="purchase_product_id")
	private Long purchase_product_id;
	
	@Column(name="product_id")
	private Long product_id;
	
	@Column(name="purchase_unit_amount")
	private Long purchase_unit_amount;
	
	@Column(name="purchase_sub_total")
	private Long purchase_sub_total;
	
	@Column(name="unit_price")
	private Long unit_price;
	
	
	

	public Long getPurchase_id() {
		return details_id;
	}

	public Long getDetails_id() {
		return details_id;
	}

	public void setDetails_id(Long details_id) {
		this.details_id = details_id;
	}

	public Long getPurchase_product_id() {
		return purchase_product_id;
	}

	public void setPurchase_product_id(Long purchase_product_id) {
		this.purchase_product_id = purchase_product_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getPurchase_unit_amount() {
		return purchase_unit_amount;
	}

	public void setPurchase_unit_amount(Long purchase_unit_amount) {
		this.purchase_unit_amount = purchase_unit_amount;
	}

	public Long getPurchase_sub_total() {
		return purchase_sub_total;
	}

	public void setPurchase_sub_total(Long purchase_sub_total) {
		this.purchase_sub_total = purchase_sub_total;
	}

	public Long getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Long unit_price) {
		this.unit_price = unit_price;
	}

	

}
