package src;

import java.util.ArrayList;

public class DevoirMaison extends Tuile implements Devoir {

	private ArrayList<Note> notes = new ArrayList<>();

	@Override
	public void addNote(Note note) {
		this.notes.add(note);
	}
}