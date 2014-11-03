public class Grade {
	//ATTRIBUTS--------------------------------------------
	private String libelle;
	private double salaire;
	//CONSTRUCTEUR-----------------------------------------
	public Grade(String libelle, double salaire) {
		this.libelle = libelle;
		this.salaire = salaire;
	}
	//ACCESSEURS-------------------------------------------
	public String getLibelle() {
		return libelle;
	}
	//---------
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	//---------
	public double getSalaire() {
		return salaire;
	}
	//---------
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}
