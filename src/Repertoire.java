import java.util.ArrayList;
import java.util.Iterator;

public class Repertoire implements AbstractFile {
    private String nom;
    private ArrayList<AbstractFile> fichiers = new ArrayList<>();
    private Retrait retrait;

    public Repertoire(String nom, Retrait retrait) {
        this.nom = nom;
        this.retrait = retrait;
    }

    public void ajouter(AbstractFile fichier) {
        fichiers.add(fichier);
    }

    public void afficher() {
        System.out.println(retrait.getRetrait() + nom);
        retrait.augmenterRetrait();
        Iterator<AbstractFile> it = this.iterator();

        while (it.hasNext()) {
            AbstractFile fichier = it.next();
            fichier.afficher();
        }
        retrait.diminuerRetrait();
    }

    public Iterator<AbstractFile> iterator() {
        return this.fichiers.iterator();
    }
}
