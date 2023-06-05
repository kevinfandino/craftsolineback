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
@Table(name="tbl_user")

public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long user_id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="cuenta")
	private String cuenta;
	
	@Column(name="first_name")
	private String first_name;
	
	
	@Column(name="user_email")
	private String user_email;
	
	@Column(name="phone_number")
	private Long phone_number;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setContraseña(String password) {
		this.password = password;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}
	
	
	
	
	
}
