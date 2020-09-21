package listeEtTab;

public class ListeTableauTest {
	
	public static void main(String[] args){
		
		ListeTableau listeTab = new ListeTableau(10);
		listeTab.initialiserListe();
		
		listeTab.creerListe(8);
		
		listeTab.afficher();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Inserer au debut 45");
		listeTab.insererDebut(45);
		listeTab.afficher();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Inserer 50 aprés 35");
		listeTab.insererApres(50, 35);
		listeTab.afficher();
		
		System.out.println("");
		System.out.println("");
		
		Object item =  listeTab.suprimerDebut();
		System.out.println("Maillon supprimer : "+item);
		listeTab.afficher();
		
		System.out.println("");
		System.out.println("");
		
		item =  listeTab.suprimerApres(25);
		System.out.println("Maillon supprimer : "+ item);
		listeTab.afficher();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("taille():"+listeTab.taille());
	}
}
