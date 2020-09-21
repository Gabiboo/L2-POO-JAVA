package Piles;

public class PileListeChainée implements Pile {

	class Maillon
	{
		Object element; // element de donnee
		Maillon suivant; // prochain maillon dans la liste chainee
		Maillon( Object e ) // constructeur
		{
			element = e; // le prochain est automatiquement mis à null
			suivant = null;
		}
	}


	Maillon sommet; // sommet de la pile
	Maillon p; // maillon courant


	/**
	 * @param Objet ob 
	 * Prend en parametre l'objet à empiler
	 */
	public void empiler(Object ob) {

		if (pileVide() == true)
		{
			sommet = new Maillon(ob);
			//System.out.println("sommet empilé "+ ob);
		}

		else
		{
			
			p = new Maillon(ob);
			p.suivant = sommet;
			sommet = p;
			//System.out.println("maillon empilé "+ ob);
		}
	}
	
	
	/**
	 * Supprimer le dernier element
	 * le sommet devient l'elementsuivant 
	 */
	public Object depiler() {

		Object element = sommet.element;
		

		if(pileVide())
		{
			System.out.println("La pile est vide, aucun élément à dépiler");
		}

		else
		{		
			
			sommet = sommet.suivant;
			
		}
		
		return element;
	}
	
	


	/**
	 * Affiche le sommet courant
	 */
	public Object lireSommet() {

		return sommet.element;
	}


	/**
	 * Verifie si la Pile est vide
	 * Pour cela verifier que le sommet est Null
	 */
	public boolean pileVide() {

		return sommet == null;
	}


	/**
	 * Renvoi la taille de la Pile
	 * Tanqt qu'il y a un suivant on increment de 1 le nbElements
	 */
	public int taille() {

		int nbElements = 0;

		Maillon c = sommet;
		if(pileVide())
		{
			System.out.println("La pile est vide");
			return nbElements;
		}

		else
		{
			while(c != null)
			{
				nbElements++;
				c = c.suivant;
			}
		}

		return nbElements;

	}


	/**
	 * Affichage en partant du sommet vers les elements suivants
	 */
	public void afficherPile() {

		Maillon c = sommet;

		System.out.print("Contenu de la pile : [ ");
		while(c != null)
		{
			System.out.print(c.element +" ");
			c = c.suivant;
		}
		System.out.print("]\n");

	}

}