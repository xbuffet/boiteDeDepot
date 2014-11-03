public class Employe {
	/**
	 * Une chaîne de caractères représentant le nom de l'employé
	 */
	private String nom;
	/**
	 * Un entier représentant le nombre d'années depuis l'embauche de l'employé
	 */
	private int anciennete;
	/**
	 * Une chaîne de caractères représentant le grade de l'employé
	 * Peut être "apprenti", "technicien", ou "cadre"
	 */
	private String grade;
	/**
	 * constructeur de la classe Employe
	 * @param unNom le nom du nouvel employé
	 * @param uneAnciennete l'ancienneté du nouvel employé
	 * @param unGrade le grade du nouvel employé ("apprenti", "technicien", ou "cadre")
	 */
	public Employe(String unNom, int uneAnciennete, String unGrade){
		this.nom = unNom;
		this.anciennete = uneAnciennete;
		this.grade = unGrade;
	}
	/**
	 * Accesseur en lecture sur l'attribut nom
	 * @return le nom de l'employé
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * Accesseur en lecture sur l'attribut anciennete
	 * @return l'ancienneté de l'employé
	 */
	public int getAnciennete(){
		return this.anciennete;
	}
	/**
	 * Accesseur en lecture sur l'attribut grade
	 * @return le grade de l'employé
	 */
	public String getGrade(){
		return this.grade;
	}
	/**
	 * méthode qui calcule et retourne le salaire mensuel de l'employé
	 * @return le salaire mensuel en euros
	 */
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