package exercice_1;

public class EmployeSalarie extends Employe {
	private double salaireMensuel;

	public EmployeSalarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.setSalaireMensuel(salaireMensuel);
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return getSalaireMensuel();
	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	

}
