import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Repertoire implements Composant{
	
	private Collection<Composant> fichiers;
	private String name;
	
	public Repertoire(String name) {
		fichiers = new ArrayList<Composant>();
		this.name = name;
	}
	
	public void add(Composant composant){
	     
        fichiers.add(composant);
    }

  
    public void remove(Composant composant){
        fichiers.remove(composant);
    }
    
    public Iterator<Composant> getFichier() {
        return fichiers.iterator();
    }
    
    @Override
    public int getTaille() {
        int result = 0;
        for (Iterator<Composant> i = fichiers.iterator(); i.hasNext(); ) {
            Object objet = i.next();
			
            Composant composant = (Composant)objet;

            result += composant.getTaille();
        }
        return result;
    }
    public String getName() {
		return this.name;
	}
    
    public static void afficher(Composant composant) {
		System.out.println("la taille de "+ composant.getName()+" est: " + composant.getTaille()+" octets");
	}


}
