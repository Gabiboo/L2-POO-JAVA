//************* TRI A INSERTION **************
package insertion;

public class triAInsertion {

	static int[] table = new int[10];  // le tableau à trier en attribut
	
	static void  Remplissage(){// remplissage aléatoire du tableau
	    int n = table.length - 1 ;
	   for(int i = 1;i <= n; i ++ )
	     table[i]=(int)(Math.random () * 100);
	  }
	
	static void Affiche(){ // Affichage le tableau 
	    int n = table.length-1;
	   for (int i = 1;i <= n; i ++ ) 
	     System.out.print(table[i] + " , ");
	    System.out.println ();
	  }
	
	static void TriInsertion() {
		int n = table.length - 1;
		for(int i = 0; i <= n; i++){
			int v = table[i];
			int j = i;

			while(table[j-1] > v) {
				table[j] = table[j - 1];
				j--;
			}
			table[j]=v;
		}
	}
	
	public static void  main (String[]args){
		Remplissage();
		System.out.println("************* TRI A INSERTION **************");
	    System.out.println("Tableau initial :");
	    Affiche ();
	    TriInsertion();
	    System.out.println("Tableau une fois trié :");
	    Affiche();
	  } 
}
