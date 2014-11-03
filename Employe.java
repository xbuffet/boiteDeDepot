public class Employe {
	private String nom;
	private int anciennete;
	private Grade leGrade;
	public Employe(String unNom, int uneAnciennete, Grade unGrade){
		this.nom = unNom;
		this.anciennete = uneAnciennete;
		this.leGrade = unGrade;
	}
	public String getNom(){
		return this.nom;
	}
	public int getAnciennete(){
		return this.anciennete;
	}
	public Grade getSonGrade(){
		return this.leGrade;
	}
	public double salaireMensuel(){
		return this.leGrade.getSalaire() + 50*this.anciennete;
	}
}