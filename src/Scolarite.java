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

	public HashMap<Devoir, Annee> getDevoirs() {
		HashMap<Devoir, Annee> hashMap = new HashMap<>();
		for(Filiere filiere: this.l_filiere){
			for(Component c : filiere.getChildren()){
				Annee annee = (Annee) c;
				for(Semestre semestre : annee.getSemestres()){
					for(UE ue: semestre.getUEs()){
						for(Module module: ue.getListe_module())
						{
							for(Devoir devoir : module.getDevoirs()){
								hashMap.put(devoir, annee);
							}
						}
					}
				}
			}
		}

		return hashMap ;
	}

	/**
	 * 
	 * @param annee
	 */
	public ArrayList<Eleve> getStudents(Annee annee) {
		return annee.getStudents();
	}

	public void addNotes(HashMap<Eleve, Double> attributionNotes, Devoir devoir) {

		Set<Eleve> ensembleEleve = attributionNotes.keySet();
		for(Eleve e : ensembleEleve){
			e.addNote(attributionNotes.get(e), devoir);
		}
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