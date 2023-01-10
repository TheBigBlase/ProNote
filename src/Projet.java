package src;

import java.util.Date;
import java.util.ArrayList;

public class Projet extends Tuile implements Devoir {
	private ArrayList<Note> notes = new ArrayList<>();

	public Projet(Date date_debut, Date date_fin){
		super(date_debut, date_fin);
	}

	@Override
	public void addNote(Note note) {
		this.notes.add(note);
	}
}