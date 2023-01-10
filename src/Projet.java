package src;

import java.util.Date;
public class Projet extends Tuile implements Devoir {
	private Note note;

	public Projet(Date date_debut, Date date_fin){
		super(date_debut, date_fin);
		this.note = new Note();//TODO after note class is implemented
	}

	public Projet(Date date_debut, Date date_fin, Note note){
		super(date_debut, date_fin);
		this.note = note;
	}

	public void addNote(Note note){

	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

}