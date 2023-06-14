public class CompteBancaire {
    private final int numero;
    private double solde;

    public CompteBancaire(int numero) {
        this.numero = numero;
        this.solde = 0.0;
    }

    public void deposerArgent(double depot) {
        if (depot > 0.0) {
            solde += depot;
            Journalisation.getInstance().ajouterLog("Dépôt de " + depot + "Euros sur le compte" + numero + ".");
        } else {
            Journalisation.getInstance().ajouterLog("/!\\ Dépôt d'une valeur négative impossible (" + numero + ").");
        }
    }

    public void retirerArgent(double retrait) {
        if (retrait > 0.0) {
            if (solde >= retrait) {
                solde -= retrait;
                Journalisation.getInstance().ajouterLog("Retrait de " + retrait + "Euros sur le compte" + numero + ".");
            } else {
                Journalisation.getInstance().ajouterLog("/!\\ La banque n'autorise pas de découvert (" + numero + ").");
            }
        } else {
            Journalisation.getInstance().ajouterLog("/!\\ Rerait d'une valeur négative impossible (" + numero + ").");
        }
    }
}
