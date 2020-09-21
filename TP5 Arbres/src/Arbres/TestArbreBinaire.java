package Arbres;

public class TestArbreBinaire {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbreBinaire ab = new ArbreBinaire();
		ab.ajout(6);
		ab.ajout(4);
		ab.ajout(8);
		ab.ajout(3);
		ab.ajout(5);
		ab.ajout(7);
		ab.ajout(9);
		
		
//(a) Inorder (Left, Root, Right)
//(b) Preorder (Root, Left, Right)
//(c) Postorder (Left, Right, Root)
//(d) Breadth First or Level Order Traversal
		

		
		
		System.out.println("Parcours en Ordre : ");
		ab.parcoursOrdre(ab.racine);
		System.out.println();
		
		System.out.println("Parcours en PreOrdre : ");
		ab.parcoursPreOrdre(ab.racine);
		System.out.println();
		
		System.out.println("Parcours en PostOrdre : ");
		ab.parcoursPostOrdre(ab.racine);
		System.out.println();
		
		System.out.println("Parcours en largeur : ");
		ab.parcoursLargeur();
		System.out.println();
		
		
		System.out.println(ab.contientSommet(6));
		System.out.println(ab.contientSommet(4));
		System.out.println(ab.contientSommet(1));
		
		
		System.out.println(ab.taille());
		
		System.out.println(ab.contientSommet(9));
		System.out.println("Supression du sommet 9");
		ab.suppression(9);
		System.out.println(ab.contientSommet(9));
	}
}
