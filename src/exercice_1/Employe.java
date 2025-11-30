package exercice_1;

public abstract class Employe {
	protected String nom;
	protected String prenom;
	
	public Employe(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public abstract double calculerSalaire();
	
	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
