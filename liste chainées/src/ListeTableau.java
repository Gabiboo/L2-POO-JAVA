package listeEtTab;

public class ListeTableau implements Liste {
	
	class Maillon{
		Object info;
		int suivant;
		
		Maillon(Object ob, int i){
			info = ob;
			suivant = i;
		}
	}
	
	int MAXTAILLE;
	Maillon liste[];
	int tete, nbrElement;
	
	public ListeTableau(int s) {
		//complexité : O(1)
		MAXTAILLE = s;
		liste = new Maillon[MAXTAILLE];
	}
	
	@Override
	public void initialiserListe() {
		//complexité : O(1)
		tete = 0;
		nbrElement = 0;
	}

	@Override
	public void creerListe(int n) {
		//complexité : O(n)
		tete = 0;
		nbrElement = n;
		for(int i = 0; i<=n; i++){
			liste[i] = new Maillon(5*(i+1), i+1);
		}
		liste[nbrElement-1].suivant = -1;
	}

	@Override
	public void insererDebut(Object ob) {
		//complexité : O(1)
		liste[nbrElement] = new Maillon(ob,tete);
		tete = nbrElement;
		nbrElement++;
	}

	@Override
	public void insererApres(Object ob,  Object pos) {
		//complexité : O(n)
		nbrElement++;
		int i = tete;
		while(liste[i].info!=pos && liste[i].suivant!=-1){
			i = liste[i].suivant;
		}
		if(liste[i].info == pos){
			liste[nbrElement-1]=new Maillon(ob, liste[i].suivant);
			liste[i].suivant = nbrElement-1;
		}
	}

	@Override
	public Object suprimerDebut() {
		//complexité : O(n)
		nbrElement--;
		Object ret = liste[tete].info;
		tete = liste[tete].suivant;
		return(ret);
	}

	@Override
	public Object suprimerApres(Object pos) {
		//complexité : O(n)
		int i = tete;
		Object ret = null;
		while(liste[i].info!=pos && liste[i].suivant!=-1){
			i = liste[i].suivant;
		}
		if(liste[i].info == pos){
			ret = liste[liste[i].suivant].info;
			liste[i].suivant = liste[liste[i].suivant].suivant;
		}
		nbrElement--;
		return ret;
	}

	@Override
	public boolean listeVide() {
		//complexité : O(1)
		return liste[0].info == null ;
	}

	@Override
	public int taille() {
		//complexité : O(1)
		return nbrElement;
	}

	@Override
	public void afficher() {
		//complexité : O(n)
		System.out.print("liste : [ ");
		int i = tete;
		while(liste[i].suivant!=-1){
			System.out.print(liste[i].info+" ");
			i = liste[i].suivant;
		}
		System.out.print(liste[i].info+" ");
		System.out.print("]");

	}

}
