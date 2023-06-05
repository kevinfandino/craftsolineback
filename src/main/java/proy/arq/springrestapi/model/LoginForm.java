package proy.arq.springrestapi.model;

public class LoginForm {
	private String cuenta;
	private String password;
	
	
	public String getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(String Cuenta) {
		this.cuenta = Cuenta;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
