import java.time.LocalDate;
import java.time.LocalTime;

public class Fundmeldung {
    private String fundort;
    private String fundnummer;
    private LocalDate funddatum;
    private LocalTime fundzeit;
    private String wertauswahl;
    private String übergabewunsch;
    private String status;
    private final Nutzer nutzer;
    private final Fundsache fundsache;

    public Fundmeldung(
            Nutzer nutzer,
            Fundsache fundsache,
            String fundort,
            String fundnummer,
            LocalDate funddatum,
            LocalTime fundzeit,
            String wertauswahl,
            String übergabewunsch,
            String status) {
        this.nutzer = nutzer;
        this.fundsache = fundsache;
        this.fundort = fundort;
        this.fundnummer = fundnummer;
        this.funddatum = funddatum;
        this.fundzeit = fundzeit;
        this.wertauswahl = wertauswahl;
        this.übergabewunsch = übergabewunsch;
        this.status = status;
        nutzer.registriere(this);
    }

    public boolean mussInsFundbüro() {
        // Noch offen: Das Diagramm definiert keine Regel für die Abgabe.
        throw new UnsupportedOperationException("Noch nicht umgesetzt");
    }

    public void statusÄndern(String status) {
        this.status = status;
    }

    public String getFundnummer() {
        return fundnummer;
    }

    public String getStatus() {
        return status;
    }
}
