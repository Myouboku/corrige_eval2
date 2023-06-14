public class Journalisation {
    private static Journalisation instance;
    private String log;

    private Journalisation() {
        log = "";
    }

    public static Journalisation getInstance() {
        synchronized (Journalisation.class) {
            if (instance == null) {
                instance = new Journalisation();
            }
        }
        return instance;
    }

    public void ajouterLog(String log) {
        this.log += log + "\n";
    }

    public String afficherLog() {
        return log;
    }
}
