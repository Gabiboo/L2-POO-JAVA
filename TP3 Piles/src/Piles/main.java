package Piles;

public class main {

	public static void main(String[] args) {

		System.out.println("*********************** PILE LISTE CHAINÉE ***************************");
		// TODO Auto-generated method stub
		PileListeChainée pile = new PileListeChainée(); // creer un objet pile
		Object e; // stocker l element depile
		pile.empiler(20); // ajouter 20, 35, 40 a la pile
		pile.empiler(35);
		pile.empiler(40);

		System.out.println("AFFICHE LA PILE");
		pile.afficherPile(); // afficher le contenu de la pile
		System.out.println("");


		System.out.println("DEPILE UN ELEMENT \n");
		e = pile.depiler(); // depiler un element du sommet de la pile et l afficher
		if( e != null )
		{
			System.out.println("element depilé : " + e);
			pile.afficherPile();
		}
		pile.empiler(65); // empiler 65, 70, 75
		pile.empiler(70);
		pile.empiler(75);
		pile.afficherPile(); // afficher le contenu de la pile
		e = pile.depiler(); // depiler un element du sommet de la pile et l afficher
		if( e != null )
		{
			System.out.println("element depile : " + e);
			pile.afficherPile();
		}
		System.out.println("lireSommet(): " + pile.lireSommet());// recuperer l element du sommet
		pile.empiler(90); // inserer 90
		pile.afficherPile();


		//*********************** PILE TABLEAU ***************************
/*
		System.out.println("*********************** PILE TABLEAU ***************************");
		PileTableau pileT = new PileTableau(4); // créer une pile de taille 4
		Object element;
		System.out.println("Ajout de 3 éléments");
		pileT.empiler('A'); // empiler 3 elements
		pileT.empiler('B');
		pileT.empiler('C');
		System.out.println("taille(): "+ pileT.taille());
		element = pileT.depiler(); // supprimer element
		System.out.println(element + " est supprimé");
		System.out.println("taille(): "+ pileT.taille());
		System.out.println("Ajout de 3 éléments");
		pileT.empiler('D'); // ajouter 3 éléments à la pile
		pileT.empiler('E');
		pileT.empiler('F');
		System.out.println(pileT.depiler() + " est supprimé");
		pileT.afficherPile();
		System.out.println("Ajout d'un élément");
		pileT.empiler('G'); // empiler un element
		element = pileT.lireSommet(); // récupérer l'élément sommet de la pile
		System.out.println(element + " est au sommet de la pile");
*/
	}

}
