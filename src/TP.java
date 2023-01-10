package src;

import java.util.ArrayList;

public class TP extends Groupe {
    private EDT edt;

    public TP(String nom) {
        super(nom);
    }

    public EDT getEdt() {
        return edt;
    }

    public void setEdt(EDT edt) {
        this.edt = edt;
    }

    @Override
    public void addChild(Component component) {
        if (component instanceof Eleve) {
            this.children.add(component);
        } else {
            throw new IllegalArgumentException("Le component doit être de type Eleve pour être ajouté à un TP.");
        }
    }
}