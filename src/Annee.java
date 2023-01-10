package src;

import java.util.ArrayList;
import java.util.List;

public class Annee extends Groupe {
	public Annee(String nom) {
		super(nom);
	}

	private List<Semestre> semestres = new ArrayList<>();

	public void addSemestre(Semestre semestre){
		this.semestres.add(semestre);
	}

	public List<Semestre> getSemestres(){
		return this.semestres;
	}

	@Override
	public void addChild(Component component) {
		if (component instanceof TD) {
			this.children.add(component);
		} else {
			throw new IllegalArgumentException("Le component doit être de type TD pour être ajouté à une Annee.");
		}
	}
}