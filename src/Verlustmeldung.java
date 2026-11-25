public class Verlustmeldung {
    private String verlustnummer;
    private String verlustorte;
    private String verlustzeitraum;
    private String übergabewunsch;
    private String merkmal;
    private double wert;
    private String farbe;
    private String gegenstandsart;
    private String status;
    private final Nutzer nutzer;

    public Verlustmeldung(
            Nutzer nutzer,
            String verlustnummer,
            String verlustorte,
            String verlustzeitraum,
            String übergabewunsch,
            String merkmal,
            double wert,
            String farbe,
            String gegenstandsart,
            String status) {
        this.nutzer = nutzer;
        this.verlustnummer = verlustnummer;
        this.verlustorte = verlustorte;
        this.verlustzeitraum = verlustzeitraum;
        this.übergabewunsch = übergabewunsch;
        this.merkmal = merkmal;
        this.wert = wert;
        this.farbe = farbe;
        this.gegenstandsart = gegenstandsart;
        this.status = status;
        nutzer.registriere(this);
    }

    public boolean passtZu(Fundmeldung meldung) {
        // Noch offen: Das Diagramm definiert keine Kriterien für den Vergleich.
        throw new UnsupportedOperationException("Noch nicht umgesetzt");
    }

    public void statusÄndern(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
