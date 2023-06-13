public class ComposantPDF {
    protected String contenu;
    public void pdfFixeContenu(String contenu) {
        this.contenu = contenu;
    }
    public void pdfPrepareAffichage() {
        System.out.println("Début affichage PDF");
    }
    public void pdfRafraichit() {
        System.out.println("Affichage du contenu du PDF : " + contenu);
    }
    public void pdfTermineAffichage() {
        System.out.println("Affichage PDF terminé");
    }
    public void pdfEnvoieImprimante() {
        System.out.println("Impression PDF : " + contenu);
    }
}
