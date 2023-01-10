package src;

import java.util.ArrayList;

public class Module {
	private String nomDescriptif; //ie Maths531
	private String nomComplet;// ie statistics
	private ArrayList<Prof> liste_prof;
	private String couleur;//????
	private ArrayList<Seance> liste_seance;

	public Module(String nomDescriptif, String nomComplet, Prof prof){
		this.nomDescriptif = nomDescriptif;
		this.nomComplet = nomComplet;
		liste_prof.add(prof);
	}

	public Module(String nomDescriptif, Prof prof){
		this.nomDescriptif = nomDescriptif;
		liste_prof.add(prof);
	}

	public String getNomDescriptif() {
		return nomDescriptif;
	}

	public void setNomDescriptif(String nomDescriptif) {
		this.nomDescriptif = nomDescriptif;
	}

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public void addProf(Prof prof) {
		this.liste_prof.add(prof);
	}
	public ArrayList<Prof> getListe_prof() {
		return liste_prof;
	}

	public void setListe_prof(ArrayList<Prof> liste_prof) {
		this.liste_prof = liste_prof;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void addSeance(Seance seance) {
		this.liste_seance.add(seance);
	}

	public ArrayList<Seance> getListe_seance() {
		return liste_seance;
	}

	public void setListe_seance(ArrayList<Seance> liste_seance) {
		this.liste_seance = liste_seance;
	}
}