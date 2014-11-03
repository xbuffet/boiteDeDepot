public class Employe {
	private String nom;
	private int anciennete;
	private String grade;
	public Employe(String unNom, int uneAnciennete, String unGrade){
		this.nom = unNom;
		this.anciennete = uneAnciennete;
		this.grade = unGrade;
	}
	public String getNom(){
		return this.nom;
	}
	public int getAnciennete(){
		return this.anciennete;
	}
	public String getGrade(){
		return this.grade;
	}
	public int salaireMensuel(){
		int salaire;
		salaire = 0;
		if (this.grade.equals("apprenti"))
			salaire = 1000;
		else if(this.grade.equals("technicien"))
			salaire = 1800;
		else if(this.grade.equals("cadre"))
			salaire = 2800;
		return salaire + 50*this.anciennete;
	}
}