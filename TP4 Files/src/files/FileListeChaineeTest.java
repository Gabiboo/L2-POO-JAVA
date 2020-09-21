package files;

public class FileListeChaineeTest
{
	/**
	 * @author sam
	 *
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FileChainee file = new FileChainee();
		file.afficherFile();
		file.enfiler('A');
		file.enfiler('B');
		file.enfiler('C');
		file.enfiler('D');
		file.afficherFile();
		System.out.println("defiler(): " + file.defiler());
		file.afficherFile();
		System.out.println("lireDebut(): " + file.lireDebut());
		file.enfiler('E');
		file.enfiler('F');
		System.out.println("defiler(): " + file.defiler());
		file.afficherFile();
		System.out.println("taille(): " + file.taille());
	}
}
