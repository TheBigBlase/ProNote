package src;

import java.util.ArrayList;

public class Filiere extends Groupe {
	public Filiere(String nom) {
		super(nom);
	}

	private String nom;

	@Override
	public void addChild(Component component) {
		if (component instanceof Annee) {
			this.children.add(component);
		} else {
			throw new IllegalArgumentException("Le component doit être de type année pour être ajouté à une filière.");
		}
	}
}