package exercice_1;

public class Main {
	public static void main(String[] args) {
		Entreprise ent = new Entreprise();

		ent.ajouterEmploye(new EmployeHoraire("Issis", "Salma", 20.0, 100));
		ent.ajouterEmploye(new EmployeSalarie("Elfaizani", "Aya", 4000.0));
		ent.ajouterEmploye(new Vendeur("Chouaib", "Youssef", 2000.0, 500.0));
		ent.ajouterEmploye(new EmployeHoraire("Lahlou", "Salma", 12.0, 120));

		ent.afficherPaie();
	}
}
