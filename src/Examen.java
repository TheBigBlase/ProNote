package src;

import java.util.ArrayList;

public class Examen implements Devoir {
	private Double coeficient;
	private String description;
	private Seance seance;


	private ArrayList<Note> notes = new ArrayList<>();

	@Override
	public void addNote(Note note) {
		this.notes.add(note);
	}

}