package liste;

public interface ListeInterface {

	public void initialiserListe();
	public void creerListe(int n);
	public void insererDebut(Object ob);
	public void insererApres(Object ob, Object pos);
	public Object supprimerDebut();
	public Object supprimerApres(Object pos);
	public boolean listeVide();
	public int taille();
	public void afficher();
}
