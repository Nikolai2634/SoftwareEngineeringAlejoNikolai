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

## Durchgeführte Änderungen

| ID | Version alt → neu | alte Formulierung (kurz) | neue Formulierung (kurz) | Begründung |
|---|---|---|---|---|
| F-001 | 1 → 2 | Registrierung mit E-Mail-Adresse und Passwort | Registrierung mit Telefonnummer und Verifizierungscode | Passt zu Giovannis Kenntnisstand und zum telefonbasierten Ablauf. |
| F-002 | 1 → 2 | Anmeldung mit gültigen Zugangsdaten | Anmeldung mit Telefonnummer und Verifizierungscode | Stimmt die Anmeldung auf die passwortlose Registrierung ab. |
| F-003 | 1 → 2 | Fundmeldung ohne Wertauswahl | Pflichtauswahl: „unter 100 €“, „100 € oder mehr“ oder „weiß ich nicht“ | Der Wert wird für die Entscheidung über den Übergabeweg benötigt. |
| F-008 | 1 → 2 | Fundbüros „in der Nähe“ anzeigen | 10-km-Radius, vergrößerbar; bei weniger als drei Treffern die drei nächsten anzeigen | Legt Suchbereich und Verhalten bei wenigen Treffern fest; doppelte Kriterien wurden ersetzt. |
| F-015 | 1 → 2 | Unbestimmte Liste, etwa „Wertsache“ | Verbindliche Liste und Wertgrenzen; „weiß ich nicht“ sperrt direkte Übergabe; Neuschätzung wird protokolliert | Vereinheitlicht die Einstufung und macht die Sperre und spätere Neuschätzung nachvollziehbar. |
| F-025 | 1 → 2 | Benachrichtigung per Push oder E-Mail | Push, E-Mail, SMS oder Anruf | Entspricht den Benachrichtigungswegen in Szenario und Anwendungsfall. |
| US10 | – → – (nicht versioniert) | „Wertvolle Gegenstände“, „usw.“ | Verbindliche Liste und Wertauswahl; kein Wertnachweis erforderlich | Vermeidet unbestimmte Kategorien und stimmt die Regel mit F-015 ab. |
| Anwendungsfall | – → – (nicht versioniert) | Beispiele sensibler Gegenstände; Fundbüro wird angezeigt | Verbindliche Liste; bei sensiblen oder unklaren Werten keine Chat-Übergabe; Neuschätzung protokolliert, Gegenstand bleibt im Fundbüro | Stimmt Ablauf und Fundbüroregel mit F-015 und US10 ab. |

## Begründung der Überarbeitung

Die Teamentscheidungen wurden in die fachlichen Artefakte übernommen, damit Anforderungen, User Story und Anwendungsfall dieselben Regeln enthalten. Die Versionsänderungen kennzeichnen die Änderungen gegenüber den Entwurfsversionen; das Review bleibt eine eigene Entscheidungsdokumentation.
