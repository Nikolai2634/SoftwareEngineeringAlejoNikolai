public class Fundsache {
    private String gegenstandsart;
    private String beschreibung;
    private String farbe;
    private String merkmal;
    private String foto;

    public Fundsache(String gegenstandsart, String beschreibung, String farbe, String merkmal, String foto) {
        this.gegenstandsart = gegenstandsart;
        this.beschreibung = beschreibung;
        this.farbe = farbe;
        this.merkmal = merkmal;
        this.foto = foto;
    }

    public boolean istSensibel() {
        // Noch offen: Das Diagramm definiert keine Kriterien für sensible Gegenstände.
        throw new UnsupportedOperationException("Noch nicht umgesetzt");
    }

    public String getGegenstandsart() {
        return gegenstandsart;
    }
}
