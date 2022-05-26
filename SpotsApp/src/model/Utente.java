package model;

public class Utente {
	
	private String username;
	private String email;
	private Privilegio privilegio;
	public Utente() {
		
	}
	
	public Utente(String username, String email, Privilegio privilegio) {
		this.username = username;
		this.email = email;
		this.privilegio = privilegio;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Privilegio getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(Privilegio privilegio) {
		this.privilegio = privilegio;
	}
	
	
}
