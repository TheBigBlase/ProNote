package src;

import java.util.Date;
import java.util.ArrayList;

public class DevoirMaison extends Tuile implements Devoir{

	public DevoirMaison(Date date_debut, Date date_fin){
		super(date_debut, date_fin);
	}



	private ArrayList<Note> notes = new ArrayList<>();

	@Override
	public void addNote(Note note) {
		this.notes.add(note);
	}
}