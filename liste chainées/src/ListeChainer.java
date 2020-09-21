package listeEtTab;

import listeEtTab.ListeTableau.Maillon;

public class ListeChainer implements Liste {
	
	class Maillon{
		Object info;
		Maillon suivant;
		
		Maillon(Object ob){
			info = ob;
			suivant = null;
		}
		
		
	}
	
	Maillon tete;
	Maillon courant;
	int nbrElement;
	
	public ListeChainer() {
		//complexit� : O(1)
		tete = null;
		courant = null;
		nbrElement = 0;
	}

	@Override
	public void initialiserListe() {
		//complexit� : O(1)
		tete = null;
		courant = null;
		nbrElement = 0;
	}

	@Override
	public void creerListe(int n) {
		//complexit� : O(n)
		nbrElement = n;
		tete = new Maillon(5);
		courant = tete;
		for(int i = 1; i<n; i++){
			courant.suivant = new Maillon((int) courant.info + 5);
			courant = courant.suivant;
		}	
	}

	@Override
	public void insererDebut(Object ob) {
		//complexit� : O(1)
		courant = new Maillon(ob);
		courant.suivant = tete;
		tete = courant;
		nbrElement++;
	}

	@Override
	public void insererApres(Object ob, Object pos) {
		//complexit� : O(n)
		Maillon tampon;
		courant = tete;
		while(courant.info != pos && courant.suivant != null){
			courant = courant.suivant;
		}
		if(courant.info == pos){
			tampon = new Maillon(ob);
			tampon.suivant = courant.suivant;
			courant.suivant = tampon;
		}
		nbrElement++;
	}

	@Override
	public Object suprimerDebut() {
		//complexit� : O(1)
		Maillon ret = tete;
		tete = tete.suivant;
		nbrElement--;
		return ret.info;
	}

	@Override
	public Object suprimerApres(Object pos) {
		//complexit� : O(n)
		Object ret = null;
		courant = tete;
		while(courant.info != pos && courant.suivant != null){
			courant = courant.suivant;
		}
		if(courant.info == pos){
			ret = courant.suivant.info;
			courant.suivant = courant.suivant.suivant;
		}
		nbrElement--;
		return ret;
	}

	@Override
	public boolean listeVide() {
		//complexit� : O(1)
		return tete == null;
	}

	@Override
	public int taille() {
		//complexit� : O(1)
		return nbrElement;
	}

	@Override
	public void afficher() {
		//complexit� : O(n)
		courant  = tete;
		System.out.print("liste chain�e : ");
		while(courant.suivant != null){
			System.out.print(courant.info+" -> ");
			courant = courant.suivant;
		}
		System.out.print(courant.info+" -> "+"null");
	}
}
