package Ex6;

public class asterisque {

	public static void main(String[] args) {
		asterisque ex6 = new asterisque();
		//ex6.affiche(3);
		//ex6.recAffiche(10);
		//ex6.carré(3);
		//ex6.recTangle(3, 4);
		//ex6.recTriso(4);
		//ex6.reverseRecTriso(4);
		ex6.RecTrisoEntier(4);
	}

	//6.1
	
	public void affiche(int n) {
		for(int i = 0; i<n; i++) {
			System.out.print('*');
		}
	}
	
	
	public void recAffiche(int n) {
		if(n>0) {
			System.out.print("*");
			recAffiche(n-1);
		}
		else
			return;
	}
	
	//6.2
	
	public void carré(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	//6.3
	
	public void recTangle(int h, int n) {
		if(h>0) {
			recAffiche(n);
			System.out.println();
			recTangle(h-1, n);
			
		}
		else
			return;
	}
	
	//6.4
	
	public void recTriso(int n) {
		if(n>0) {
			recAffiche(n);
			System.out.println();
			recTriso(n-1);
		}
	}
	
	public void reverseRecTriso(int n) {
		for(int i = 0; i <= n; i++) {
			recAffiche(i);
			System.out.println();
		}
	}
	
	//6.5
	public void RecTrisoEntier(int n) {
		
			if(0 < n) {
				recAffiche(n);
				System.out.println();
				RecTrisoEntier(n-1);
			}
			else if(){
				recAffiche(n);
				System.out.println();
			}
		
		
		
	}
	
	
	
}
