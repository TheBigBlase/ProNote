package src;

import java.util.Date;
public class Seance extends Tuile {

	private String nom;
	private int numero = -1;

	public Seance(Date date_debut, Date date_fin){
		super(date_debut, date_fin);
	}

	public Seance(Date date_debut, Date date_fin, String nom){
		super(date_debut, date_fin);
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Seance(Date date_debut, Date date_fin, String nom, int numero){
		super(date_debut, date_fin);
		this.nom = nom;
		this.numero = numero;
	}

}