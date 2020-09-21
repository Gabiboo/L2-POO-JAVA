package files ;

public class FileTableau implements File
{
	private int tailleMax; // taille maximale de la filee
	private Object[] file; // la file est un tableau
	private int debut;
	private int fin;
	private int nbElements; // taille de la file

	public FileTableau(int s) // constructeur
	{
		tailleMax = s;
		file = new Object[tailleMax];
		debut = fin = -1;
		nbElements = 0;
	}


	@Override
	public void enfiler(Object ob) // insère un élément, passé en paramètre, en fin de la file
	{	
		debut = 0;
		fin = nbElements - 1;
		//int courant = debut + nbElements;

		if(fileVide() )
		{
			file[debut] = ob;
		}

		else
		{
			for (int i = 1 ; i <= tailleMax-1; i++)
			{
				file[fin+1] = ob;
			}

		}

		nbElements++;
	}


	@Override
	public Object defiler() //supprime puis renvoie l'élément se situant au début de la file
	{

		Object anciendebut = file[debut];

		for (int i = 0 ; i <= tailleMax -1; i++)
		{
			file[debut] = null;

		}

		nbElements--;
		debut = debut +1;

		return anciendebut;
	}


	@Override
	public Object lireDebut() // renvoie, sans supprimer, l'élément se situant au début de la file
	{

		return file[debut];
	}


	@Override
	public boolean fileVide() // renvoie un boolean indiquant si la file est vide
	{
		boolean resu = false;

		if(nbElements <= 0 || debut == -1 || fin == -1 ) {
			resu = true;
			//System.out.println("La file est vide");
		}
		else {
			resu = false;
			//System.out.println("La file n'est pas vide, il y a : "+nbElements+" elements");
		}
		return resu;
	}


	@Override
	public int taille() // renvoie le nombre d'éléments de la file
	{
		return nbElements;
	}



	@Override
	public void afficherFile() // affiche les éléments d'une file
	{


		System.out.print("File : ");

		for (int i = 0; i <= tailleMax -1; i++) 
		{
			System.out.print(file[i]+" ");
		}
		System.out.println("");

	}

}