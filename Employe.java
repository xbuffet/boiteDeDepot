public class Employe {
	/**
	 * Une cha�ne de caract�res repr�sentant le nom de l'employ�
	 */
	private String nom;
	/**
	 * Un entier repr�sentant le nombre d'ann�es depuis l'embauche de l'employ�
	 */
	private int anciennete;
	/**
	 * Une cha�ne de caract�res repr�sentant le grade de l'employ�
	 * Peut �tre "apprenti", "technicien", ou "cadre"
	 */
	private String grade;
	/**
	 * constructeur de la classe Employe
	 * @param unNom le nom du nouvel employ�
	 * @param uneAnciennete l'anciennet� du nouvel employ�
	 * @param unGrade le grade du nouvel employ� ("apprenti", "technicien", ou "cadre")
	 */
	public Employe(String unNom, int uneAnciennete, String unGrade){
		this.nom = unNom;
		this.anciennete = uneAnciennete;
		this.grade = unGrade;
	}
	/**
	 * Accesseur en lecture sur l'attribut nom
	 * @return le nom de l'employ�
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * Accesseur en lecture sur l'attribut anciennete
	 * @return l'anciennet� de l'employ�
	 */
	public int getAnciennete(){
		return this.anciennete;
	}
	/**
	 * Accesseur en lecture sur l'attribut grade
	 * @return le grade de l'employ�
	 */
	public String getGrade(){
		return this.grade;
	}
	/**
	 * m�thode qui calcule et retourne le salaire mensuel de l'employ�
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