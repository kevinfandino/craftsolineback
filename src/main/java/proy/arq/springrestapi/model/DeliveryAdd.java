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
@Table(name="tbl_delivery_add")
public class DeliveryAdd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="add_id")
	private Long add_id;
	
	@Column(name="user_id")
	private Long user_id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="address")
	private String address;
	
	@Column(name="delivery_price")
	private Long delivery_price;


	public Long getAdd_id() {
		return add_id;
	}


	public void setAdd_id(Long add_id) {
		this.add_id = add_id;
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Long getDelivery_price() {
		return delivery_price;
	}


	public void setDelivery_price(Long delivery_price) {
		this.delivery_price = delivery_price;
	}

}
