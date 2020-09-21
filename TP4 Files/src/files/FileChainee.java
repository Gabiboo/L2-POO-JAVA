package files;

public class FileChainee implements File
{
	class Maillon
	{
		Object element; // element de donnee
		Maillon suivant; // prochain maillon dans la liste chainee
		Maillon( Object e ) // constructeur
		{
			element = e; // le prochain est automatiquement mis à null
		}
	}

	Maillon debut, fin;
	int nbElements;

	@Override
	public void enfiler(Object ob) {
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
			System.out.println(ob + " à été ajouté à la file ! ");
			while(p.suivant != null)
			{
				p = p.suivant;
			}
			p.suivant = fin;
		}
		nbElements++;
	}
	@Override
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
	@Override
	public Object lireDebut() {
		// TODO Auto-generated method stub
		return debut.element;
	}
	@Override
	public boolean fileVide() {
		// TODO Auto-generated method stub
		return debut == null;
	}
	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return nbElements;
	}
	@Override
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

}
