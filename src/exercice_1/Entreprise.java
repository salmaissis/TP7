package exercice_1;

public class Entreprise {
	private Employe[] employes;
	private int nb;

	public Entreprise() {
		this.employes = new Employe[4];
		this.nb = 0;
	}

	public void ajouterEmploye(Employe e) {
		if (nb == employes.length) {
			Employe[] tmp = new Employe[employes.length * 2];
			System.arraycopy(employes, 0, tmp, 0, employes.length);
			employes = tmp;
		}
		employes[nb++] = e;
	}

	public void afficherPaie() {
		for (Employe e : employes) {
			System.out.println("l'employé " + e.nom + " " + e.prenom + " a le salaire : " + e.calculerSalaire());
		}
		System.out.println("Masse salariale totale : " 
	            + String.format("%.2f", masseSalariale()) + "€");

	}
	
	public double masseSalariale() {
		int somme = 0;
		for (Employe e : employes) {
			somme += e.calculerSalaire();
		}
		return somme;
	}
}
