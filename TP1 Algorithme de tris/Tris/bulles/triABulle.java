//************* TRI A BULLE **************
package bulles;

public class triABulle {

	static  int [] table  =  new  int [10]  ;  // le tableau à trier en attribut
	  
	   static void  TriBulle  ( )    {
	    int  n  =  table.length - 1 ;
	   for(int i = n;i >= 1;i--)
	    for(int j = 2 ;  j <= i ;  j ++ ) 
	     if(table[j - 1] > table[j] )
	     {
	       int temp = table[j - 1];
	       table[j-1] = table[j];
	       table[j] = temp;
	     }
	  }
	  
	  static void Affiche(){ 
	    int n = table.length - 1 ;
	   for(int i = 1;i <= n ;i ++ ) 
	     System.out.print (table[i] + " , ");
	    System.out.println ();
	  }
	  
	  static void Remplissage(){
	    // remplissage aléatoire du tableau 
	    int n = table.length - 1 ;
	   for(int i = 1; i <= n;i ++ ) 
	     table[i]= (int)(Math.random() * 100);
	  }
	  
	  public static void  main ( String [ ] args )    {
	    System.out.println("************* TRI A BULLE **************");
		Remplissage();
	    System.out.println ("Tableau initial :");
	    Affiche();
	    TriBulle  ( );
	    System.out.println ("Tableau une fois trié :");
	    Affiche();
	  } 
}
