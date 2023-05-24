package proy.arq.springrestapi.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="tbl_employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	// Cambia el nombre de la propiedad, en este caso, el name al momento de mandar
	// el request
	// @JsonProperty("full_name")
	
	@NotNull(message ="Name should not be null")
	private String name;

	// Hace que la propiedad no aparezca al momento de hacer el request
	// @JsonIgnore
	
	private Long age = 0L;
	
	private String location;
	
	@jakarta.validation.constraints.Email(message ="please enter a valid email address") 
	private String Email;
	
	@NotNull(message ="Department should not be null")
	private String department;
	
	@CreationTimestamp
	@Column(name="created_at", nullable = false, updatable = false)
	private Date created_at;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Date update_at;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	public Date getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(Date createdAt) {
		this.created_at = createdAt;
	}

	public Date getUpdateAt() {
		return update_at;
	}

	public void setUpdateAt(Date updateAt) {
		this.update_at = updateAt;
	}

	
		
}

	


