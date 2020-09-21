package listeEtTab;

public class ListeChainerTest {

	public static void main(String[] args) {
		
		ListeChainer listeChaine = new ListeChainer();
		listeChaine.initialiserListe();
		
		listeChaine.creerListe(8);
		
		listeChaine.afficher();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Inserer au debut 45");
		listeChaine.insererDebut(45);
		listeChaine.afficher();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Inserer 50 aprés 35");
		listeChaine.insererApres(50, 35);
		listeChaine.afficher();
		
		System.out.println("");
		System.out.println("");
		
		Object item =  listeChaine.suprimerDebut();
		System.out.println("Maillon supprimer : "+item);
		listeChaine.afficher();
		
		System.out.println("");
		System.out.println("");
		
		item =  listeChaine.suprimerApres(25);
		System.out.println("Maillon supprimer : "+ item);
		listeChaine.afficher();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("taille():"+listeChaine.taille());
	}

}
