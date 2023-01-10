package src;

import java.util.Date;
import java.util.ArrayList;

public class DevoirMaison extends Tuile implements Devoir{

	private String nom;

	public DevoirMaison(String nom,Date date_debut, Date date_fin){
		super(date_debut, date_fin);
		this.nom = nom;
	}

	private ArrayList<Note> notes = new ArrayList<>();

	@Override
	public void addNote(Note note) {
		this.notes.add(note);
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public Double getMoyenne() {
		Double moyenne = 0.0;
		for(Note note: this.notes){
			moyenne += note.getValeur();
		}
		moyenne = moyenne / this.notes.size();
		return moyenne;
	}

}