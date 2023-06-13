public class Main {
    public static void main(String[] args) {
        Document document1, document2;
        document1 = new DocumentHTML();
        document1.setContenu("Hello HTML");
        document1.dessine();

        System.out.println("----------------------------");

        document2 = new DocumentPDF();
        document2.setContenu("Hello PDF");
        document2.dessine();
    }
}