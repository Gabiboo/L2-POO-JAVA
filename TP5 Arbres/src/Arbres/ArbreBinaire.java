package Arbres;

public class ArbreBinaire implements ArbreBinaireInterface{
	int taille = 0;
	Sommet racine;
	Sommet courant;
	private boolean isEmpty = true;
	
	@Override
	public void ajout(int valeur) {
		
		Sommet newSommet = new Sommet(valeur);
		
		if(racine == null)
		{
			racine = newSommet;
			taille++;
		}
		else
		{
			courant = racine;
			Sommet parent;
			
			while(true)
			{
				parent = courant;
				
				if(valeur < courant.valeur)
				{
					courant = courant.gauche;
					if(courant == null)
					{
						parent.gauche = new Sommet(valeur);
						taille++;
						return;
					}
				}else{
					courant = courant.droite;
					if(courant == null)
					{
						parent.droite = new Sommet(valeur);
						taille++;
						return;
					}
				}
			}
		}
		
	}

	
	public int getValeurRacine()
	{
		return racine.valeur;
		
	}
	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return this.isEmpty;
	}

	@Override
	public String taille() {
		// TODO Auto-generated method stub
		return "L'arbre binaire de recherche contient " + taille + " éléments.";
	}

	@Override
	public boolean contientSommet(int valeur) {
		courant = racine;
		
		while(courant.valeur != valeur) //la boucle tourne tant qu'on arrive pas au sommet recherchée
		{
			
			if(valeur < courant.valeur) {
				
				courant = courant.gauche;
				
			} else {
				
				courant = courant.droite;
				
			}
			
			if(courant == null) {
				break; //on sort car on est arrivé au bout et le sommet recherchée n'existe pas.
			}
		}
		
		if(courant == null) {
			
			return false;
			
		} else {
			
			return true;
		
		}
		
	}

	@Override
	public void suppression(int valeur) {
		courant = racine;
		Sommet parent = racine;
		
		boolean estAGauche = true;
		
		while(courant.valeur != valeur)
		{
			parent = courant;
			
			if(valeur < courant.valeur) {
				
				estAGauche = true;
				
				courant = courant.gauche;
				
			}else {
				
				estAGauche = false;
				
				courant = courant.droite;
				
			}
			
			if(courant.gauche == null && courant.droite == null) {
				
				if(courant == racine) 
					racine = null;
				
				else if(estAGauche) 
					parent.gauche = null;
				
				else 
					parent.droite = null;
				
			}else if(courant.droite == null) {

				if(courant == racine) 
					racine = courant.gauche;
				
				else if(estAGauche) 
					parent.gauche = courant.gauche;
				
				else 
					parent.droite = courant.gauche;
				
			}else if(courant.gauche == null) {

				if(courant == racine) 
					racine = courant.droite;
				
				else if(estAGauche) 
					parent.gauche = courant.droite;
				
				else 
					parent.droite = courant.gauche;
				
			}
		}
		
	}

	@Override
	public void parcoursOrdre(Sommet sommet) {
		if(sommet != null) {
			parcoursOrdre(sommet.gauche);
			System.out.println(sommet.valeur);
			parcoursOrdre(sommet.droite);
		}
		
	}

	@Override
	public void parcoursPreOrdre(Sommet sommet) {
		if(sommet != null) {
			System.out.println(sommet.valeur);
			parcoursOrdre(sommet.gauche);
			parcoursOrdre(sommet.droite);
		}
		
	}

	@Override
	public void parcoursPostOrdre(Sommet sommet) {
		if(sommet != null) {
			parcoursOrdre(sommet.gauche);
			parcoursOrdre(sommet.droite);
			System.out.println(sommet.valeur);
		}
		
	}

	@Override
	public void parcoursLargeur() { //ici nous devont créer une file de type fifo (first in first out) 
									// Pour se faire j'ai repris l'algorithme de liste chainée classe "listeLargeur"
		
		fileLargeur file = new fileLargeur(); // création d'une file
		courant = racine;
		
		file.enfiler(racine);
		
		while(!file.fileVide())
		{
			courant = file.lireDebut();
			file.defiler();
			//a chaque tours on explore les sommet du premier element de la file
			if(courant.gauche != null && courant.droite != null)
			{
				
				file.enfiler(courant.gauche);
				file.enfiler(courant.droite);
	
			}
			
			System.out.println(courant.valeur);
			
		
		
		}
	}

}






