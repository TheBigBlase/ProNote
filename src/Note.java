package src;

public class Note {

	public Note(double valeur, Devoir devoir) {
		this.valeur = valeur;
		this.devoir = devoir;
		this.devoir.addNote(this);
	}

	public double getValeur() {
		return valeur;
	}

	public Devoir getDevoir() {
		return devoir;
	}

	private double valeur;
	private Devoir devoir;

	@Override
	public String toString() {
		return "Note{" +
				"valeur=" + valeur +
				'}';
	}
}