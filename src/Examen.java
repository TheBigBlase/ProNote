package src;

import java.util.Date;

public class Examen {
	private Seance seance;
	private float coeficient;
	private String description;
	private Note note;

	public Examen(){
		this.note = new Note();//TODO after note class is implemented
	}

	public Examen(Date date_debut, Date date_fin, Note note){
		this.note = note;
	}

	public void addNote(Note note){// FIXME REMOVE IF OTHER CLASS DO NOTE USE IT
		setNote(note);
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	public float getCoeficient() {
		return coeficient;
	}

	public void setCoeficient(float coeficient) {
		this.coeficient = coeficient;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

}