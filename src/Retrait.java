public class Retrait {
    private final StringBuffer SBRetrait = new StringBuffer();
    public String getRetrait() {
        return SBRetrait.toString();
    }
    public void augmenterRetrait() {
        SBRetrait.append("🍯");
    }
    public void diminuerRetrait() {
        if (SBRetrait.length() >= 3) {
            SBRetrait.delete(SBRetrait.length() - 3, SBRetrait.length());
        }
    }
}
