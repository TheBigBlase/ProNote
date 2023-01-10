package src;

import java.util.ArrayList;

public class Examen implements Devoir {
	private Double coeficient;
	private String description;
	private Seance seance;
	private ArrayList<Note> notes = new ArrayList<>();
	private String nom;


	public Examen(String nom, String description, Double coeficient, Seance seance){
		this.nom = nom;
		this.description = description;
		this.coeficient = coeficient;
		this.seance = seance;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	public double getCoeficient() {
		return coeficient;
	}

	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Examen{" +
				"coeficient=" + coeficient +
				", description='" + description + '\'' +
				", notes=" + notes +
				", nom='" + nom + '\'' +
				'}';
	}
}