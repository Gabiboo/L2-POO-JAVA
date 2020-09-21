//****************** TRI PAR FUSION *********************
package fusion;

public class Trifusion {
	static int[] table1 = new int[25];
	
	public static void triFusion (int [] tab, int begin, int end)
	{
		int mid;
		if(begin < end)
		{
			mid = (begin+end) / 2;
			triFusion(tab, begin, mid);
			triFusion(tab, mid + 1, end);
			fusionner (tab, begin, mid, end);
		}
	}

	public static void fusionner (int tab[], int begin, int mid, int end)
	{
		int [] aTab = (int[]) tab.clone(); //aTab est crée et importe les données de Tab

		int i1 = begin; 
		int i2 = mid + 1; 
		int i = begin; 

		while (i1 <= mid && i2 <= end){
			
			if(aTab[i1] <= aTab[i2]){
				tab[i] = aTab[i1];
				i1++;
			}
			else{
				tab[i] = aTab[i2];
				i2++;
			}
			i++;
		}
		if (i <= end){
			while(i1 <= mid){
				tab[i] = aTab[i1];
				i1++;
				i++;
			}
			while(i2 <= end){
				tab[i] = aTab[i2];
				i2++;
				i++;
			}
		}
	}
	
	static void  Remplissage(){// remplissage aléatoire du tableau
		int n = table1.length - 1 ;
		for(int i = 1;i <= n;i++) {
			table1[i]=(int)(Math.random() * 100);
		}

	}
	
	static void Affiche() {
		System.out.print("[");
		for(int i = 1;i <= table1.length - 1;i ++)
		{
			System.out.print(table1[i]);
			if(i!=table1.length-1)
				System.out.print(" , ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void  main (String[]args){
		Remplissage();
		System.out.println("************* TRI FUSION **************");
		System.out.println("Tableau non trié");
		Affiche();
		triFusion(table1, 0, table1.length -1);
		System.out.println("Tableau trié");
		Affiche();
	} 
}
