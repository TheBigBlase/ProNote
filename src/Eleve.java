package src;

import java.util.ArrayList;
import java.util.Date;

public class Eleve extends Component {
	private String nom;
	private String prenom;
	private Date date_de_naissance;
	private String num_etudiant;

	private ArrayList<Note> notes = new ArrayList<>();

	public Eleve(String nom, String prenom, Date date_de_naissance, String num_etudiant) {
		this.nom = nom;
		this.prenom = prenom;
		this.date_de_naissance = date_de_naissance;
		this.num_etudiant = num_etudiant;
	}

	/**
	 * Ajoute une note à l'élève
	 * @param valeur
	 * @param devoir
	 */
	public void addNote(double valeur, Devoir devoir) {
		Note note = new Note(valeur, devoir);
		this.notes.add(note);
	}

	@Override
	public String toString() {
		return "Eleve{" +
				"nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", date_de_naissance=" + date_de_naissance +
				", num_etudiant='" + num_etudiant + '\'' +
				", notes=" + notes +
				'}';
	}
}