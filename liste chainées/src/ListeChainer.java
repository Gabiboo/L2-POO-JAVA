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
		//complexité : O(1)
		tete = null;
		courant = null;
		nbrElement = 0;
	}

	@Override
	public void initialiserListe() {
		//complexité : O(1)
		tete = null;
		courant = null;
		nbrElement = 0;
	}

	@Override
	public void creerListe(int n) {
		//complexité : O(n)
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
		//complexité : O(1)
		courant = new Maillon(ob);
		courant.suivant = tete;
		tete = courant;
		nbrElement++;
	}

	@Override
	public void insererApres(Object ob, Object pos) {
		//complexité : O(n)
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
		//complexité : O(1)
		Maillon ret = tete;
		tete = tete.suivant;
		nbrElement--;
		return ret.info;
	}

	@Override
	public Object suprimerApres(Object pos) {
		//complexité : O(n)
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
		//complexité : O(1)
		return tete == null;
	}

	@Override
	public int taille() {
		//complexité : O(1)
		return nbrElement;
	}

	@Override
	public void afficher() {
		//complexité : O(n)
		courant  = tete;
		System.out.print("liste chainée : ");
		while(courant.suivant != null){
			System.out.print(courant.info+" -> ");
			courant = courant.suivant;
		}
		System.out.print(courant.info+" -> "+"null");
	}
}
