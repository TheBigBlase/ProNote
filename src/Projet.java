package src;

import java.util.Date;
import java.util.ArrayList;

public class Projet extends Tuile implements Devoir {
	private ArrayList<Note> notes = new ArrayList<>();
	private String nom;

	public Projet(String nom, Date date_debut, Date date_fin){
		super(date_debut, date_fin);
		this.nom = nom;
	}

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