# Requirements Review

**Prüfgrundlage:** `docs/01-anforderungen/uebung1.md`, `docs/01-anforderungen/uebung2.md` und `docs/01-anforderungen/anwendungsfalldiagramm.csv`. Dieses Review dokumentiert die geklärten Teamentscheidungen; die überarbeiteten Anforderungsartefakte werden getrennt gepflegt.

## 1. Tatsächliche Unklarheiten

| Erkenntnis | Entscheidung des Teams | Begründung |
|---|---|---|
| F-001 und F-002 beschreiben E-Mail-Adresse und Passwort, während der Anwendungsfall eine telefonbasierte Registrierung mit Verifizierungscode vorsieht. | F-001 und F-002 werden auf Registrierung und Anmeldung mit Telefonnummer und Verifizierungscode umgestellt. | Giovanni kennt keine Passwörter; die telefonbasierte Variante passt zum geschilderten Kernablauf und zur passwortlosen Kontoeinrichtung im Anwendungsfall. |
| F-025 erlaubt nur Push oder E-Mail, der Anwendungsfall und die Szenarien nennen auch SMS und Anruf. | F-025 wird um SMS und Anruf ergänzt. | Die Benachrichtigungsarten sollen für den User- und Systemablauf einheitlich sein. |
| F-015 nennt nur eine verkürzte, teilweise andere Liste sensibler Gegenstände als US10 und der Anwendungsfall. | F-015, US10 und der Anwendungsfall verwenden dieselbe verbindliche Liste: Ausweise, Reisepässe, Führerscheine, Bankkarten, Geldbörsen, Schlüssel, Handys, Tablets, Laptops, Bargeld und Gegenstände „100 € oder mehr“. | Eine gemeinsame Liste verhindert widersprüchliche Regeln zwischen Anforderung, User Story und Ablauf. |
| Die Wertgrenze 100 € war uneindeutig. | Die Optionen heißen „unter 100 €“ und „100 € oder mehr“; genau 100 € gilt als sensibel. | Die beiden ausschließenden Optionen schließen einen Grenzwert und Überschneidungen aus. |
| Der Finder konnte bei der Fundmeldung eine Wertangabe auslassen. | Die Wertauswahl „unter 100 €“, „100 € oder mehr“ oder „weiß ich nicht“ ist ein Pflichtfeld. | Eine vollständige Fundmeldung braucht eine eindeutige Eingabe, bevor der Übergabweg festgelegt wird. |
| „Weiß ich nicht“ ist in F-015/US10/Anwendungsfall noch nicht einheitlich als Sperrgrund festgelegt. | Bei „weiß ich nicht“ muss der Gegenstand ins Fundbüro; direkte Übergabe ist nicht möglich. Das Fundbüro darf den Wert später neu einschätzen, der Gegenstand bleibt dennoch im Fundbüro. | Im Zweifel soll kein direkter Kontakt zur Eigentumsprüfung genügen; die neue Einschätzung ändert nur die spätere Bewertung, nicht den Ablageort. |
| Eine nachträgliche Wertänderung des Fundbüros war noch nicht nachvollziehbar dokumentiert. | Mitarbeiter und Datum werden zusammen mit der Änderung gespeichert. | Dadurch bleibt jede Neuschätzung zeitlich und personell nachvollziehbar. |
| F-008 enthält keinen Radius, obwohl das Akzeptanzkriterium einen Radius von 10 km voraussetzt. | Der Standardradius beträgt 10 km. Der Nutzer kann ihn vergrößern. Bei weniger als drei Treffern zeigt die App die drei nächsten Fundbüros mit Hinweis. | Damit werden der vorgeschriebene Suchbereich und das Verhalten bei wenigen Treffern festgelegt. |

## 2. Offene Fragen

Keine offenen fachlichen Fragen zu den geprüften Punkten.

## 3. Mögliche Verbesserungen

| Erkenntnis | Entscheidung des Teams | Begründung |
|---|---|---|
| F-008 hat doppelte Akzeptanzkriterien für die Standortbestimmung. | Kriterium 2 bleibt bestehen. Kriterium 3 wird zu „keine Standortfreigabe, Eingabefeld für Adresse oder PLZ“; Kriterium 4 wird zu „ungültige PLZ wie „00000“, Meldung „PLZ nicht gefunden““. | Kriterium 2 behält den Erfolgsfall der Standortfreigabe; 3 und 4 decken die Alternativen und den Fehlerfall ab. |
| Die sensible Liste ist fachlich breit und enthält Gegenstände, die je nach Einzelfall unterschiedlich bewertet werden könnten. | Als Teamentscheidung wird die Liste dennoch verbindlich ohne Nachweis-/Beweispflicht verwendet. | Eine hohe Sicherheit und geringe Missbrauchsmöglichkeit sollen Vorrang vor einer Einzelfallprüfung durch den Finder haben. |
| In F-015 kann eine nachträgliche Bewertung des Fundbüros missverständlich wirken, wenn sie als Änderung des Ablageorts interpretiert wird. | Das Fundbüro darf den geschätzten Wert ändern, aber nicht den Status „direkte Übergabe gesperrt“ oder den Ablageort „Fundbüro“ zurücksetzen. | Die Neuschätzung trennt Wertbeurteilung von Übergabesicherheit. |
| Die Bezeichnung „Konto“ kann eine Passwortregistrierung suggerieren. | F-001/F-002 sollen ausdrücklich von telefonbasierter Registrierung und Anmeldung sprechen. | Begriffe und Implementierung sollten der gewählten Geschäftsregel entsprechen. |

## Zu ändernde Artefakte

- **F-001:** E-Mail-/Passwortregistrierung durch Registrierung mit Telefonnummer und Verifizierungscode ersetzen.
- **F-002:** Anmeldung durch Telefonnummer und Verifizierungscode statt gültiger Zugangsdaten/E-Mail-Passwort ersetzen.
- **F-003:** Die verpflichtende Wertauswahl bei der Fundmeldung ergänzen.
- **F-008:** 10-km-Radius, vergrößerbaren Radius, Verhalten bei weniger als drei Treffern und die Ersetzung der doppelten Akzeptanzkriterien ergänzen.
- **F-015:** Einheitliche Liste sensibler Gegenstände, Schätzwertoptionen und verpflichtende Fundbüroabgabe bei „weiß ich nicht“ festlegen.
- **F-025:** SMS und Anruf als Benachrichtigungswege ergänzen.
- **US10:** „Wertvolle Gegenstände“ durch dieselbe verbindliche Liste sensibler Gegenstände ersetzen und keine Nachweispflicht des Finderwerts vorsehen.
- **Anwendungsfall:** Telefonregistrierung, die einheitliche sensible Gegenstands­liste und den Fundbüroablauf ohne direkte Übergabe entsprechend aktualisieren.

## Begründung der Überarbeitung

Die Teamentscheidungen wurden in die fachlichen Artefakte übernommen, damit Anforderungen, User Story und Anwendungsfall dieselben Regeln enthalten. Die Versionsänderungen kennzeichnen die Änderungen gegenüber den Entwurfsversionen; das Review bleibt eine eigene Entscheidungsdokumentation.
