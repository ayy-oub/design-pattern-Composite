
public class Fichier implements Composant {
	
	private int taille;
	private String name;
	
	public Fichier( String name, int taille) {
		this.taille = taille;
		this.name=name;
	}
	
	@Override
	public int getTaille() {
		return this.taille;
	}
	public String getName() {
		return this.name;
	}
	
	
	public static void afficher(Composant composant) {
		System.out.println("la taille de "+ composant.getName()+" est: " + composant.getTaille()+" octets");
	}
}
