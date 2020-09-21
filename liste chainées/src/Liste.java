package listeEtTab;

public interface Liste {
	
	public void initialiserListe();
	public void creerListe(int n);
	public void insererDebut(Object ob);
	public void insererApres(Object ob, Object pos);
	public Object suprimerDebut();
	public Object suprimerApres(Object pos);
	public boolean listeVide();
	public int taille();
	public void afficher();

}
