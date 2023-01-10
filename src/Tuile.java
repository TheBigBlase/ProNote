package src;

import java.util.Date;
public class Tuile {

	private Date date_debut;
	private Date date_fin;

	public Tuile(Date date_debut, Date date_fin){
		this.date_debut	= date_debut;
		this.date_fin = date_fin;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
}