package src;

import java.util.ArrayList;

public class Semestre {



	private String nom;
	private ArrayList<UE> ues = new ArrayList<>();

	public Semestre(String nom) {
		this.nom = nom;
	}

	public ArrayList<UE> getUEs(){
		return this.ues;
	}
	public void addUE(UE ue){
		this.ues.add(ue);
	}

	@Override
	public String toString() {
		return "Semestre{" +
				"nom='" + nom + '\'' +
				'}';
	}
}