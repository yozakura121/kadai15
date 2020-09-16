class AcAdapter extends Dengen {
    private JapaneseConsent japaneseconsent;

    public AcAdapter() {
        this.JapaneseConsent = new JapaneseConsent();
    }

    public int kyuuden() {
        return (int) (power() * 0.16);
    }
}