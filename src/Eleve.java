package src;

import java.util.Date;

public class Eleve extends Component {

	private int numero_etudiant;
	private Filiere filiere;
	private String identifiant;
	private String mdp;
	private boolean connecter;
	private String nom;
	private String prenom;
	private Date date_de_naissance;
	private String num_etudiant;

	/**
	 * 
	 * @param identifiant
	 * @param mdp
	 */
	public void seConnecter(int identifiant, int mdp) {
		// TODO - implement Eleve.seConnecter
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param valeur
	 * @param devoir
	 */
	public void addNote(double valeur, Devoir devoir) {
		// TODO - implement Eleve.addNote
		throw new UnsupportedOperationException();
	}

}