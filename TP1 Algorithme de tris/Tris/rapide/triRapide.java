//****************** TRI RAPIDE *********************
package rapide;

public class triRapide {
	static int[] table = new int[12];

	static void  Remplissage(){// remplissage aléatoire du tableau
		int n = table.length - 2 ;
		for(int i = 1;i <= n;i++) {
			table[i]=(int)(Math.random() * 100);
		}
		table[0] = -Integer.MAX_VALUE;
		//table1[n+1] = Integer.MAX_VALUE;

	}

	static void Affiche() {
		System.out.print("[");
		for(int i = 1;i <= table.length - 1;i ++)
		{
			System.out.print(table[i]);
			if(i!=table.length-1)
				System.out.print(" , ");
		}
		System.out.print("]");
		System.out.println();
	}

	static  int  repartition (int L, int R){ 
		int i,j,piv,temp;
		piv = table[R] ;
		i = L - 1;
		j = R;
		do{
			do
				i++ ;  
			while(table[i]<piv);
			do
				j--;  
			while (table[j]>piv);
			temp = table[i] ;
			table[i] = table[j];
			table[j] = temp;
		}while(j>i);
		
		table[j] = table[i] ;
		table[i] = table[R] ;
		table[R] = temp ;
		return i;
	}



	static void RecRap (int L, int R)// Récursif
	{  
		int  i ;
		if(R>L)
		{
			i  =  repartition (L,R);
			RecRap (L,i - 1);
			RecRap (i + 1,R);
		}
	}

	public static void  main (String[]args){
		Remplissage();
		System.out.println("************* TRI A INSERTION **************");
		System.out.println("Tableau non trié");
		Affiche();
		RecRap(0, table.length-1);
		System.out.println("Tableau trié");
		Affiche();
	} 
}
