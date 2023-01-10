package src;

import java.util.ArrayList;

public class Projet extends Tuile implements Devoir {

	private ArrayList<Note> notes = new ArrayList<>();

	@Override
	public void addNote(Note note) {
		this.notes.add(note);
	}
}