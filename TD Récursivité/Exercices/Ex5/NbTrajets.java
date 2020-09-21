package Ex5;

public class NbTrajets {

	public static void main(String[] args) {
		NbTrajets ex5 = new NbTrajets();
		System.out.println(ex5.trajets(4, 1, 1));
	}

	public static int  trajets(int n, int x, int y) {
		if(n==y || n==x)
			return 1;
		else
			return trajets(n,x+1,y) + trajets(n,x,y+1);
	}
}
