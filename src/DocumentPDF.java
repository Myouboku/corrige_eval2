public class DocumentPDF implements Document {
    protected ComposantPDF outilPDF = new ComposantPDF();
    public void setContenu(String contenu) {
        outilPDF.pdfFixeContenu(contenu);
    }
    public void dessine() {
        outilPDF.pdfPrepareAffichage();
        outilPDF.pdfRafraichit();
        outilPDF.pdfTermineAffichage();
    }
    public void imprime() {
        outilPDF.pdfEnvoieImprimante();
    }
}
