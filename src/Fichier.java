import java.util.Iterator;
import java.util.NoSuchElementException;

public class Fichier implements AbstractFile
{
    private final String nom;
    private final Retrait retrait;
    public Fichier(String nom, Retrait retrait) {
        this.nom = nom;
        this.retrait = retrait;
    }
    public void afficher() {
        System.out.println(retrait.getRetrait() + nom);
    }
}
