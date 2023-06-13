public class DocumentHTML implements Document {
    protected String contenu;
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    public void dessine() {
        System.out.println("Dessine le document HTML : " + contenu);
    }
    public void imprime() {
        System.out.println("Impression du document HTML : " + contenu);
    }
}
