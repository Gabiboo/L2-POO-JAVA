package liste;

public class ListeChainee implements ListeInterface{
	class Maillon
	{
		Object info; // élément, item de donnée
		Maillon suivant; // fait reference au Maillon suivant dans la liste
		Maillon( Object ob ) // constructeur
		{
			info = ob;
			suivant = null;
		}
	}
	Maillon tete; // tete fait reference au premier Maillon
	Maillon courant; // courant fait reference au maillon courant
	int nbrElements; // fait reference au nombre de maillon à un moment donne

	public void initialiserListe() //complexity : 0(1)
	{
		tete = null;
		courant = null;
		nbrElements = 0;
	}
	@Override
	public void creerListe(int n) {//complexity : 0(n)
		nbrElements = n;
		tete = new Maillon(5);
		Maillon nouv = tete;
		for(int i = 1; i <= n; i++) 
		{
			courant = new Maillon(5*(i+1));
			nouv.suivant = courant;
			nouv = courant;
		}
		

	}
	@Override
	public void insererDebut(Object ob) {//complexity : 0(1)
		courant = new Maillon(ob);
		courant.suivant = tete;
		tete = courant;
		nbrElements++;

	}
	@Override
	public void insererApres(Object ob, Object pos) {//complexity : 0(n)
		new Maillon(ob);
		courant = tete;
		while(courant.info != pos && courant.suivant != null) 
		{
			courant = courant.suivant;
		}

	}
	@Override
	public Object supprimerDebut() {//complexity : 0(1)
		Maillon sup = tete;
		tete = tete.suivant;
		nbrElements--;
		return sup.info;
	}
	@Override
	public Object supprimerApres(Object pos) {//complexity : 0(n)
		Object sup = null;
		courant = tete;
		while(courant.info != pos && courant.suivant != null) {
			courant = courant.suivant;
		}
		if(courant.info == pos) {
			sup = courant.suivant.info;
			courant.suivant = courant.suivant.suivant;
		}
		nbrElements--;
		return sup;
	}
	@Override
	public boolean listeVide() {//complexity : 0(n)
		// TODO Auto-generated method stub
		return tete == null;
	}
	@Override
	public int taille() {//complexity : 0(1)
		// TODO Auto-generated method stub
		return nbrElements;
	}
	@Override

	public void afficher() {//complexity : 0(n)
		Maillon lire = tete;
		System.out.println("");
		System.out.print("Liste chainée : ");
		//courant = lire;
		if(lire != null) 
		{
			
			while(lire.suivant != null)
			{
				
				System.out.print(lire.info + " -> ");
				lire = lire.suivant;
				//courant = lire.suivant;
				
			}
			System.out.print("null");
		}
		else 
		{
			System.out.println("Liste null");
		}

		

	}
}
