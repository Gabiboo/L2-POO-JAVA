package liste;

import java.util.ArrayList;



public class ListeTableau implements ListeInterface{
	class Maillon
	{
		Object info;
		int suivant;

		Maillon(Object ob, int i) // constructeur
		{
			info = ob;
			suivant = i;
		}
	}
	int MAXTAILLE; // nbr maximum de Maillons dabs la liste
	Maillon liste[]; // creer une liste sous forme de tableau
	int tete, nbrElements; // nbrElements: nombre de maillons
	//à un moment donné dans la liste


	ListeTableau( int s) // constructeur
	{
		MAXTAILLE = s;
		liste = new Maillon[MAXTAILLE];
	}

	public void initialiserListe()
	{
		nbrElements = 0;
		tete = 0;
		
	}


	/**
	 * Méthode qui crée une liste de n elements
	 * complexité : O(n)
	 */
	public void creerListe(int n) {

		tete = 0;
		nbrElements = n;
		for(int i = 0; i<=n; i++){
			liste[i] = new Maillon((i+1), i+1);//liste[i] = new Maillon(5*(i+1), i+1);
		}
		liste[nbrElements-1].suivant = - 1;
	}


	/**
	 * Méthode permite to insert an element in head of the list
	 * complexity : 0(n)
	 * paramètres : ob
	 */
	public void insererDebut(Object ob) {

		if(nbrElements == MAXTAILLE) { //si la tete est nul on peut ajouter une tete
			System.out.println("*** Liste pleine ***");
			return;
		}

		else{ //sinon on l'insère après
			liste[nbrElements] = new Maillon(ob,tete);
			tete = nbrElements;
			nbrElements++;
			System.out.println("L'élément " + ob +" à été ajouté en tete de liste.");
			
		}
	}

	/**
	 * Permite to insert object after a position
	 * complexity : 0(n)
	 * parameters : ob, pos
	 */
	public void insererApres(Object ob, Object pos) {
		nbrElements++;
		int i = this.tete;
		while(liste[i].info != pos && liste[i].suivant != -1){
			i = liste[i].suivant;
		}
		if(liste[i].info == pos){
			liste[nbrElements - 1] = new Maillon(ob, liste[i].suivant);
			liste[i].suivant = nbrElements-1;
		}
	}

	/**
	 * Delete head of the list
	 * comlexity : 0(1)
	 */
	public Object supprimerDebut() {
		Object sup = liste[tete].info;
		tete = liste[tete].suivant;
		nbrElements--;
		return sup;
	}

	/**
	 * delete ob after pos
	 * complexity : 0(n)
	 * parameters : pos
	 */
	public Object supprimerApres(Object pos) {
		int j = tete;
		Object sup = null;
		while(liste[j].info!=pos && liste[j].suivant!=-1){
			j = liste[j].suivant;
		}
		if(liste[j].info == pos){
			sup = liste[liste[j].suivant].info;
			liste[j].suivant = liste[liste[j].suivant].suivant;
		}
		nbrElements--;
		return sup;
	}

	/**
	 * return boolean if the list is empty
	 * complexity : 0(n)
	 */
	public boolean listeVide() {
		return liste[0].info == null;
	}

	/**
	 * return number of elements in list
	 * complexity : 0(1)
	 */
	public int taille() {
		// TODO Auto-generated method stub
		return nbrElements;
	}

	/**
	 * pin up the list
	 * complexity : 0(n)
	 */
	public void afficher() {
		// TODO Auto-generated method stub
		
		System.out.print("liste : [ ");
		int i = tete;
		while(liste[i].suivant != -1){
			System.out.print(liste[i].info + " ");
			i = liste[i].suivant;
		}
		System.out.print(liste[i].info + " ]" );
		
	}
}
