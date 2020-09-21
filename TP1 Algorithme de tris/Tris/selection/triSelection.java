//****************** TRI PAR SELECTION *********************
package selection;

public class triSelection {

	static int[] table = new int[10];  // le tableau à trier en attribut

	static void Remplissage(){// remplissage aléatoire du tableau
		int n = table.length - 1 ;
		for(int i = 1;i <= n ;i ++ ) 
			table[i]=(int)(Math.random() * 100);
	}

	static void Affiche (){ // Affichage du tableau 
		int n = table.length - 1 ;
		for(int i = 1;i <= n;i ++ ) 
			System.out.print(table[i] + " , ");
		System.out.println();
	}

	static void TriSelection(){
		int n = table.length - 1;
		for(int i = 0; i <= n - 1; i++)  
		{// recommence une sous-suite 
			int  m  =  i ;  // élément frontière ai = table[ i ]
			for(int j = i + 1;j <= n ; j++)  // (ai+1, a2, ... , an) 
				if(table[j] < table[m]) // aj = nouveau minimum partiel
					m = j;  // indice mémorisé
			int temp = table[ m ] ;
			table[m] = table[ i ] ;
			table[i] = temp ; 

		}

	}

	public static void main (String[]args){
		Remplissage();
		System.out.println("************* TRI SELECTION **************");
		System.out.println("Tableau initial :");
		Affiche ();
		TriSelection();
		System.out.println("Tableau une fois trié :");
		Affiche();
	} 
}


