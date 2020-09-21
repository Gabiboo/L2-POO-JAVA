package Piles;

public class PileTableau implements Pile{
	private Object t[];
	private int sommet; // sommet de la pile
	public PileTableau(int n) // constructeur
	{
		t = new Object[n]; // creer le tableau qui contiendra la pile
		sommet = -1; // pas d'éléments dans la pile
	}
	@Override
	public void empiler(Object ob) {
		if (sommet == t.length - 1){
			System.out.println("La pile est pleine impossible d'empiler");
		}
		else {
			sommet++;
			t[sommet] = ob;
		}
	}
	@Override
	public Object depiler() {
		// TODO Auto-generated method stub

		Object ancienSommet = t[sommet];

		t[sommet]= null;
		sommet--;

		return ancienSommet;
	}
	@Override
	public Object lireSommet() {
		// TODO Auto-generated method stub
		return t[sommet];
	}
	@Override
	public boolean pileVide() {
		if(sommet == -1) {
			return true;
		}
		else
			return false;
	}
	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return sommet+1;
	}
	@Override
	public void afficherPile() {
		// TODO Auto-generated method stub
		System.out.print("Pile : ");
		for (int i = 0; i <= t.length-1; i++) {
			System.out.print(t[i]+ " ");
		}
		System.out.println("");
		
	}
}
/*
package Pile;

public class PileTableau implements Pile
{
	private Object t[];
	private int sommet; // sommet de la pile


	public PileTableau(int n) // constructeur
	{
		t = new Object[n]; // creer le tableau qui contiendra la pile
		sommet = -1; // pas d'éléments dans la pile
	}


	@Override
	public void empiler(Object ob)
	{
		if(sommet == t.length -1)
		{
			System.out.println("La pile est pleine");
		}

		else
		{
			sommet++;
			t[sommet] = ob;

		}

	}


	@Override
	public Object depiler() {

		Object ancienSommet = t[sommet];

		t[sommet]= null;
		sommet--;

		return ancienSommet;
	}


	@Override
	public Object lireSommet() {

		return t[sommet];
	}


	@Override
	public boolean pileVide() {

		boolean resu = true;

		if(sommet == -1)
		{
			resu = true;
			System.out.println("La pile est vide");
		}
		return resu;
	}


	@Override
	public int taille() {

		return sommet+1;
	}


	@Override
	public void afficherPile() {

		System.out.print("Pile : ");
		for (int i = 0; i <= t.length-1; i++) {
			System.out.print(t[i]+ " ");
		}
		System.out.println("");

	}

} */