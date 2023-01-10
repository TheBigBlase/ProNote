package src;

import java.util.ArrayList;
public class EDT {

	public EDT(){

	}
	private ArrayList<Tuile> liste_tuile = new ArrayList<>();

	public void modif_tuile(Tuile old, Tuile newT) {
		if(this.exist_tuile(old)){
			int index = this.liste_tuile.indexOf(old);
			this.liste_tuile.set(index, newT);
		}
		else {
			this.liste_tuile.add(newT);
		}
	}

	public boolean exist_tuile(Tuile t) {
		if(liste_tuile.contains(t)){
			return true;
		}
		return false;
	}

	public void addTuile(Tuile t) {
		liste_tuile.add(t);
	}

	public ArrayList<Tuile> getAllTuiles(){
		return this.liste_tuile;
	}
}