import java.util.ArrayList;
import java.util.List;

public class Nutzer {
    private String name;
    private String email;
    private String telefonnummer;
    private String benachrichtigung;
    private final List<Fundmeldung> fundmeldungen = new ArrayList<>();
    private final List<Verlustmeldung> verlustmeldungen = new ArrayList<>();

    public Nutzer(String name, String email, String telefonnummer, String benachrichtigung) {
        this.name = name;
        this.email = email;
        this.telefonnummer = telefonnummer;
        this.benachrichtigung = benachrichtigung;
    }

    public Fundmeldung fundMelden(Fundsache fundsache) {
        // Noch offen: Das Diagramm legt die übrigen Fundmeldungsdaten nicht fest.
        throw new UnsupportedOperationException("Noch nicht umgesetzt");
    }

    public Verlustmeldung verlustMelden(String art) {
        // Noch offen: Das Diagramm legt die übrigen Verlustmeldungsdaten nicht fest.
        throw new UnsupportedOperationException("Noch nicht umgesetzt");
    }

    public void benachrichtigen(String nachricht) {
        // Noch offen: Der Benachrichtigungskanal und sein Verhalten sind nicht festgelegt.
        throw new UnsupportedOperationException("Noch nicht umgesetzt");
    }

    void registriere(Fundmeldung meldung) {
        fundmeldungen.add(meldung);
    }

    void registriere(Verlustmeldung meldung) {
        verlustmeldungen.add(meldung);
    }
}
