package src;

import java.util.ArrayList;

public class Semestre {

	private String nom;
	private ArrayList<UE> ues = new ArrayList<>();

	public ArrayList<UE> getUEs(){
		return this.ues;
	}
}