package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Eleve extends Component {
	private String nom;
	private String prenom;
	private Date date_de_naissance;
	private String num_etudiant;

	public Eleve(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * 
	 * @param identifiant
	 * @param mdp
	 */
	public void seConnecter(int identifiant, int mdp) {
		// TODO - implement Eleve.seConnecter
		throw new UnsupportedOperationException();
	}

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
	public List<Eleve> getStudents() {
		ArrayList<Eleve> res = new ArrayList<>();
		res.add(this);
		return res;
	}

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