package Ex4;

public class CalcRécParité {

	public static void main(String[] args) {
		CalcRécParité exo4 = new CalcRécParité();
		System.out.println(exo4.pair(5));	
	}
	
	//4.1
	
	public boolean parite(int n) {
		if (n==0) return true;
		if (n==1) return false;
		else return parite(n-2);
	}
	
	//4.2
	public boolean pair(int n) {
		if(n==0)
			return true;
		else
			return impair(n-1);
	}
	
	public boolean impair(int n) {
		if(n==0) {
			return false;
		}
		else 
			return pair(n-1);
	}
}
