package exercice_1;

public class Vendeur extends EmployeSalarie {
	private double commission;

	public Vendeur(String nom, String prenom, double salaireMensuel, double commission) {
		super(nom, prenom, salaireMensuel);
		this.commission = commission;
	}
	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return getSalaireMensuel() + commission;
	}
}
