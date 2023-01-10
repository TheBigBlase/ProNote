package src;

import java.util.ArrayList;

public class UE {

	private String nom;
	private ArrayList<Module> liste_module = new ArrayList<>();

	public UE(String nom){
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void addModule(Module module) {
		this.liste_module.add(module);
	}
	public ArrayList<Module> getListe_module() {
		return liste_module;
	}

	public void setListe_module(ArrayList<Module> liste_module) {
		this.liste_module = liste_module;
	}
}