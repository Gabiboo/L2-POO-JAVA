package Arbres;

//import files.FileChainee.Maillon;

public class fileLargeur {
	class Maillon
	{
		Sommet element; // element de donnee
		Maillon suivant; // prochain maillon dans la liste chainee
		Maillon( Sommet e ) // constructeur
		{
			element = e; // le prochain est automatiquement mis à null
		}
	}

	Maillon debut, fin;
	int nbElements;


	
	public void enfiler(Sommet ob) {
		// TODO Auto-generated method stub
		if(fileVide())
		{
			debut = new Maillon(ob);
			fin = null;
			debut.suivant = fin;
		}
		else
		{
			Maillon p = debut;
			fin = new Maillon(ob);
			
			while(p.suivant != null)
			{
				p = p.suivant;
			}
			p.suivant = fin;
		}
		nbElements++;
	}
	
	public Object defiler() {
		// TODO Auto-generated method stub

		Object item = debut.element;

		if(fileVide()) {
			System.out.println("La liste est vide ! Rien n'as été dépilé. ");
		}
		else{
			debut = debut.suivant;
		}
		nbElements--;
		return item;
	}
	
	
	public boolean fileVide() {
		// TODO Auto-generated method stub
		return debut == null;
	}
	
	public int taille() {
		// TODO Auto-generated method stub
		return nbElements;
	}
	

	public void afficherFile() {
		Maillon c = debut;
		System.out.println("");
		System.out.println("File Chainée : ");
		if(fileVide())
			System.out.println("la file est vide !");
		else {
			System.out.print("[ ");

			while(c != null)
			{
				System.out.print(c.element + " ");
				c = c.suivant;
			}
			System.out.println("]");
		}
	}

	public Sommet lireDebut() {
		
		return debut.element;
	}
	
}
