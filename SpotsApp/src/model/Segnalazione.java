package model;

public abstract class Segnalazione {
	
	private String id;
	private String usernameSegnalante;
	private String descrizione;
	
	public Segnalazione() {
		
	}
	
	public Segnalazione(String id, String usernameSegnalante, String descrizione) {
		this.id = id;
		this.usernameSegnalante = usernameSegnalante;
		this.descrizione = descrizione;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsernameSegnalante() {
		return usernameSegnalante;
	}
	public void setUsernameSegnalante(String usernameSegnalante) {
		this.usernameSegnalante = usernameSegnalante;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}
