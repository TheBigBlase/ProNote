package src;

import java.util.ArrayList;

public class TD extends Groupe {
	public TD(String nom) {
		super(nom);
	}

	@Override
	public void addChild(Component component) {
		if (component instanceof TP) {
			this.children.add(component);
		} else {
			throw new IllegalArgumentException("Le component doit être de type TP pour être ajouté à un TD.");
		}
	}
}