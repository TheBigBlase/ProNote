package src;

public class Prof {

	public Prof(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	private String nom;
	private String prenom;

	@Override
	public String toString() {
		return "Prof{" +
				"nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				'}';
	}
}