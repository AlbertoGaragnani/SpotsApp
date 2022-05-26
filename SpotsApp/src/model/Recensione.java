package model;

import java.util.List;
import java.util.Optional;

public class Recensione {
	
	private String id;
	private int valutazione;
	private Optional<String> titolo;
	private Optional<String> descrizione;
	private Optional<List<Permanenza>> permanenza;
	
	public Recensione() {
		
	}
	
	public Recensione(String id, int valutazione, Optional<String> titolo, Optional<String> descrizione,
			Optional<List<Permanenza>> permanenza) {
		this.id = id;
		this.valutazione = valutazione;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.permanenza = permanenza;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getValutazione() {
		return valutazione;
	}
	
	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}
	
	public Optional<String> getTitolo() {
		return titolo;
	}
	
	public void setTitolo(Optional<String> titolo) {
		this.titolo = titolo;
	}
	
	public Optional<String> getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(Optional<String> descrizione) {
		this.descrizione = descrizione;
	}
	
	public Optional<List<Permanenza>> getPermanenza() {
		return permanenza;
	}
	
	public void setPermanenza(Optional<List<Permanenza>> permanenza) {
		this.permanenza = permanenza;
	}
	
	
}
