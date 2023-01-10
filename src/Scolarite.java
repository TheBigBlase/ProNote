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


	private ArrayList<Filiere> l_filiere = new ArrayList<>();

	public HashMap<Devoir, Semestre> getDevoirs() {
		HashMap<Devoir, Semestre> hashMap = new HashMap<>();
		ArrayList<Annee> annees = new ArrayList<>();
		for(Filiere filiere: this.l_filiere){

			for(Component c : filiere.getChildren()){
				annees.add((Annee) c);
			}
		}

		for (Annee annee: annees){
			for(Semestre semestre : annee.getSemestres()){
				for(UE ue: semestre.getUEs()){
					for(Module module: ue.getListe_module())
					{
						for(Devoir devoir : module.getDevoirs()){
							hashMap.put(devoir, semestre);
						}
					}
				}
			}
		}

		return hashMap ;
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

	public void addFiliere(Filiere f){
		this.l_filiere.add(f);
	}
}