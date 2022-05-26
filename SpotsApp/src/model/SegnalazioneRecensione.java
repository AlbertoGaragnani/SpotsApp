package model;

public class SegnalazioneRecensione extends Segnalazione{
	
	private String idRecensione;
	
	public SegnalazioneRecensione(String idRecensione) {
		super();
		this.idRecensione = idRecensione;
	}

	public String getIdRecensione() {
		return idRecensione;
	}

	public void setIdRecensione(String idRecensione) {
		this.idRecensione = idRecensione;
	}

	//public getRecensione();
	
}
