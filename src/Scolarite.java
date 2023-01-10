package src;
import java.util.*;


public class Scolarite {
	private static Scolarite instance_scolarite = null;

	private Scolarite() {
	}

	public static Scolarite getInstance() {
		if (instance_scolarite == null) {
			instance_scolarite = new Scolarite();
		}
		return instance_scolarite;
	}


	private List<Filiere> l_filiere;

	public void getDevoirs() {
		// TODO - implement Scolarite.getDevoirs
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param semestre
	 */
	public void getStudents(Semestre semestre) {
		// TODO - implement Scolarite.getStudents
		throw new UnsupportedOperationException();
	}

	public void addNotes() {
		// TODO - implement Scolarite.addNotes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom_filiere
	 */
	public void getFiliere(String nom_filiere) {
		// TODO - implement Scolarite.getFiliere
		throw new UnsupportedOperationException();
	}

}