package liste;

public class main {

	public static void main(String[] args) {
		System.out.println(" *************** Liste Tableau ***************");
		ListeTableau ListeTableau = new ListeTableau(15);
		ListeTableau.initialiserListe();
		
		System.out.println("Creation liste de 10 éléments !");
		ListeTableau.creerListe(10);
		ListeTableau.afficher();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Insertion au debut : 10");
		ListeTableau.insererDebut(10);
		ListeTableau.afficher();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Inserer 11 après 5");
		ListeTableau.insererApres(11, 5);
		ListeTableau.afficher();
		System.out.println("");
		System.out.println("");
		
		Object item =  ListeTableau.supprimerDebut();
		System.out.println("Maillon supprimé : "+item);
		ListeTableau.afficher();
		System.out.println("");
		System.out.println("");
		
		item =  ListeTableau.supprimerApres(8);
		System.out.println("Maillon supprimé : "+ item);
		ListeTableau.afficher();
		System.out.println("");
		System.out.println("");
		
		System.out.println("taille :" + ListeTableau.taille() );
	}

}
