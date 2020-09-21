package Ex1;

public class SuiteRécu {

	public static void main(String[] args) {
		SuiteRécu ex1 = new SuiteRécu();
		System.out.println(ex1.Un(4));
		
		}
	

	public int Un(int n) {
		if(n==1)
			return 1;
		else 
			return 3*Un(n-1)+2;
		}

}
