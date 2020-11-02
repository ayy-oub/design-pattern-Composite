
public class Composite {

	public static void main(String[] args) {
		
		//afichage des fichiers
		
		Fichier fichier1 = new Fichier("file1", 20);
		Fichier fichier2 = new Fichier("file2", 40);
		Fichier fichier3 = new Fichier("file3", 80);
		
		Fichier.afficher(fichier1);
		Fichier.afficher(fichier2);
		Fichier.afficher(fichier3);
		
		//cr�ation du r�pertoire
		
		Repertoire repertoire1 = new Repertoire("directory1");
		
		//ajouter des fichers au rep�rtoire
		
		repertoire1.add(fichier1);
		repertoire1.add(fichier2);
		repertoire1.add(fichier3);
		
		Repertoire.afficher(repertoire1);
		
		//suprimer une fichier du r�pertoire
		
		repertoire1.remove(fichier2);
		
		Repertoire.afficher(repertoire1);
		
		//mettre une r�pertoire et des fichiers dans un r�pertoire
		
		Repertoire repertoire2 = new Repertoire("directory2");
		
		repertoire2.add(fichier1);
		repertoire2.add(fichier2);
		repertoire2.add(repertoire1);
		
		Repertoire.afficher(repertoire2);
			
		
		

	}

}
