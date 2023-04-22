package proy.arq.springrestapi.model;

import java.util.Date;

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
@Table(name="tbl_purchase")

public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="purchase_id")
	private Long purchase_id;
	
	@Column(name="user_id")
	private Long user_id;
	
	@Column(name="payment_id")
	private Long payment_id;
	
	@Column(name="purchase_date")
	private Date purchase_date;
	
	@Column(name="shipment_date")
	private Date shipment_date;
	
	@Column(name="purchase_total")
	private Long purchase_total;
	
	@Column(name="cx_address")
	private String customer_address;

	public Long getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(Long purchase_id) {
		this.purchase_id = purchase_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Long payment_id) {
		this.payment_id = payment_id;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	public Date getShipment_date() {
		return shipment_date;
	}

	public void setShipment_date(Date shipment_date) {
		this.shipment_date = shipment_date;
	}

	public Long getPurchase_total() {
		return purchase_total;
	}

	public void setPurchase_total(Long purchase_total) {
		this.purchase_total = purchase_total;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

}
