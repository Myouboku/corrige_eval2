public class Main {
    public static void main(String[] args) {
        // Gestion des documents HTML et PDF
        Document document1, document2;
        document1 = new DocumentHTML();
        document1.setContenu("Hello HTML");
        document1.dessine();

        System.out.println("----------------------------");

        document2 = new DocumentPDF();
        document2.setContenu("Hello PDF");
        document2.dessine();

        // Gestion des répertoires
        Retrait retrait = new Retrait();
        Repertoire repertoire1 = new Repertoire("repertoire1", retrait);
        Repertoire repertoire2 = new Repertoire("repertoire2", retrait);
        Repertoire repertoire3 = new Repertoire("repertoire3", retrait);
        Fichier fichier1 = new Fichier("fichier1", retrait);
        Fichier fichier2 = new Fichier("fichier2", retrait);
        Fichier fichier3 = new Fichier("fichier3", retrait);
        Fichier fichier4 = new Fichier("fichier4", retrait);
        Fichier fichier5 = new Fichier("fichier5", retrait);

        repertoire1.ajouter(fichier1);
        repertoire2.ajouter(fichier2);
        repertoire2.ajouter(fichier3);
        repertoire2.ajouter(repertoire1);
        repertoire3.ajouter(fichier4);
        repertoire3.ajouter(repertoire2);
        repertoire3.ajouter(fichier5);
        repertoire3.afficher();

        // Stratégies
        Context contexte = new Context();
        contexte.execute();
        contexte.setStrategy(new ConcreteStrategyB());
        contexte.execute();
    }
}