import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Sämtliche Beispielangaben sind Demo-Daten, keine fachlichen Vorgaben.
        Nutzer nutzer = new Nutzer("Alex Beispiel", "alex@example.test", "0123456789", "E-Mail");
        Fundsache fundsache = new Fundsache("Schlüssel", "Ein einzelner Schlüssel", "silber", "blauer Anhänger", "");
        Fundmeldung fundmeldung = new Fundmeldung(
                nutzer,
                fundsache,
                "Bibliothek",
                "F-001",
                LocalDate.of(2026, 11, 25),
                LocalTime.of(10, 30),
                "nicht angegeben",
                "Abholung",
                "neu");
        Verlustmeldung verlustmeldung = new Verlustmeldung(
                nutzer,
                "V-001",
                "Bibliothek",
                "25.11.2026",
                "Abholung",
                "blauer Anhänger",
                1.0,
                "silber",
                "Schlüssel",
                "offen");

        fundmeldung.statusÄndern("zur Abholung bereit");
        verlustmeldung.statusÄndern("in Prüfung");

        System.out.println("Fundmeldung " + fundmeldung.getFundnummer()
                + " beschreibt Fundsache: " + fundsache.getGegenstandsart());
        System.out.println("Fundmeldung-Status: " + fundmeldung.getStatus());
        System.out.println("Verlustmeldung-Status: " + verlustmeldung.getStatus());
    }
}
