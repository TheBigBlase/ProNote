package src;

import java.util.ArrayList;

public class Examen implements Devoir {
	private Double coeficient;
	private String description;
	private Seance seance;
	private ArrayList<Note> notes = new ArrayList<>();


	public Examen(){

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

}