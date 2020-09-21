package Arbres;

public interface ArbreBinaireInterface {

	public void ajout(int valeur);
	public boolean estVide();
	public String taille();
	public boolean contientSommet(int valeur);
	public void suppression(int valeur);
	public void parcoursOrdre(Sommet sommet);
	public void parcoursPreOrdre(Sommet sommet);
	public void parcoursPostOrdre(Sommet sommet);
	public void parcoursLargeur();

}


class Sommet
{
	int valeur;
	Sommet gauche;
	Sommet droite;
	public Sommet(int valeur)
	{
		this.valeur = valeur;
		droite = null;
		gauche = null;
	}
}