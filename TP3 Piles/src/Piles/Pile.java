package Piles;

public interface Pile {
	public void empiler(Object ob);
	public Object depiler();
	public Object lireSommet();
	public boolean pileVide();
	public int taille();
	public void afficherPile();
}
