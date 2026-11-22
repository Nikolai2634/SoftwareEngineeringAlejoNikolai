# Übung 2 – Software Engineering 1 (Wintersemester 2026/2027)

Fallstudie: **Fundbüro-App**

> In dieser Übung konkretisieren Sie die Anforderungen an Ihre Fallstudie (Fundbüro-Anwendung, Verleih-Plattform oder Repair Café). Ausgangspunkt sind die bisher erarbeiteten Personas, Szenarien und User Stories. Sie leiten funktionale und nichtfunktionale Anforderungen ab, definieren überprüfbare Akzeptanzkriterien und dokumentieren die Ergebnisse.

---

## Aufgabe 1 – Erstellen Sie eine strukturierte Liste mit funktionalen Anforderungen

> Leiten Sie aus den Use Cases, Szenarien und User Stories Ihrer Fallstudie mindestens sechs funktionale Anforderungen ab. Funktionale Anforderungen beschreiben, welche Funktionen ein System bereitstellen muss und wie es auf bestimmte Eingaben oder Ereignisse reagiert.
>
> Verwenden Sie das Formulierung Schema aus der Vorlesung:
> ***Nach [Bedingung] muss das System [Akteur] die Möglichkeit bieten, [Funktion] auszuführen.***
>
> **Beispiel – Ableiten einer funktionalen Anforderung aus einer User Story**
>
> - **User Story:** Als Pendlerin möchte ich häufig genutzte Strecken als Favoriten speichern können, damit ich Start und Ziel bei meinen täglichen Fahrten nicht erneut eingeben muss.
> - **Funktionale Anforderung F-020:** Nach Suche einer Verbindung muss das System angemeldeten Fahrgästen die Möglichkeit bieten, die Start- und Zielhaltestelle als Favorit zu speichern.
>
> Erstellen Sie eine Anforderungsliste in Tabellenform mit folgenden Spalten:
>
> | ID | Version | Status | Feature | Priorität | Anforderungsname | Beschreibung | Quelle |
> | --- | --- | --- | --- | --- | --- | --- | --- |
> | F-020 | 1 | Entwurf | Favoriten | Muss | Strecke speichern | Nach Auswahl einer Verbindung muss das System … | USX |
>
> Achten Sie darauf, dass Ihre Anforderungen eindeutig, verständlich und möglichst unabhängig voneinander formuliert sind.

### Funktionale Anforderungen

| ID | Version | Status | Feature | Priorität | Anforderungsname | Beschreibung | Quelle |
| --- | --- | --- | --- | --- | --- | --- | --- |
| F-001 | 1 | Entwurf | Konto | Muss | Konto registrieren | Nach Auswahl von „Registrieren" muss das System neuen Nutzern die Möglichkeit bieten, ein Konto mit E-Mail-Adresse und Passwort zu erstellen. | Nutzer |
| F-002 | 1 | Entwurf | Anmeldung | Muss | Anmleden | Nach Eingabe gültiger Zugangsdaten muss das System dem Nutzer die Möglichkeit bieten, sich anzumelden und auf seine Meldungen zuzugreifen. | Nutzer |
| F-003 | 1 | Entwurf | Fundmeldung | Muss | Fundmeldung erstellen | Nach Auswahl von „Ich habe etwas gefunden" muss das System dem Finder die Möglichkeit bieten, eine Fundmeldung mit Gegenstandsart, Fundort, Funddatum, Fundzeit und optionaler Beschreibung zu erstellen. | Finder |
| F-004 | 1 | Entwurf | Fundmeldung | Muss | Fundort erfassen | Nach Start der Fundmeldung muss das System dem Finder die Möglichkeit bieten, den Fundort automatisch über den Standort oder manuell per Adresse bzw. Karte anzugeben. | Finder |
| F-005 | 1 | Entwurf | Foto | Soll | Foto Hochladen | Nach Auswahl eines Fotos, muss das System den Nutzer die Möglichkeit bieten, ein Foto des Gegenstands hochzuladen. | Finder/Verlierer |
| F-006 | 1 | Entwurf | KI-Unterstützung | Soll | Gegenstand Identifizieren | Nach Foto upload muss das System den Nutzer die Möglichkeit bieten eine KI-gestützte Identifikation des Gegenstands anzufordern. | Nutzer |
| F-007 | 1 | Entwurf | KI-Unterstützung | Soll | Fehlende Merkmale abfragen | Nach KI-Fotoidentifikation muss das System den Nutzer die Möglichkeit bieten, fehlende Merkmale durch gezielte Rückfragen zu ergänzen. | Nutzer |
| F-008 | 1 | Entwurf | Fundbüro | Muss | Fundbüros Anzeigen | Nach Eingabe eines Standorts oder Freigabe des aktuellen Standorts muss das System dem Finder und Verlierer die Möglichkeit bieten, Fundbüros in der Nähe inklusive Adresse, Entfernung und Öffnungszeiten anzuzeigen. | Finder/Verlierer |
| F-009 | 1 | Entwurf | Fundbüro | Muss | Route anzeigen | Nach Auswahl eines Fundbüros muss das System dem Nutzer die Möglichkeit bieten, eine Route zum Fundbüro anzuzeigen oder zu starten. | Finder/Verlierer |
| F-010 | 1 | Entwurf | Verlustmeldung | Muss | Verlustmeldung Erstellen | Nach Auswahl von „Ich habe etwas verloren" muss das System dem Verlierer die Möglichkeit bieten, eine Verlustmeldung mit Gegenstandsart, Verlustort, Verlustzeitraum, Beschreibung und optionalem Foto zu erstellen. | Verlierer |
| F-011 | 1 | Entwurf | Matching | Muss | Fundsachen Suchen | Nach Erstellen einer Verlustmeldung muss das System dem Verlierer die Möglichkeit bieten, passende Fundmeldungen anhand von Gegenstandsart, Ort, Datum und optionalen Merkmalen zu suchen. | Verlierer |
| F-012 | 1 | Entwurf | Matching | Muss | Verlustmeldung Bearbeiten | Nach Aufruf einer eigenen Verlustmeldung muss das System dem Verlierer die Möglichkeit bieten, Beschreibung, Merkmale, Foto oder Suchbereich nachträglich zu ergänzen oder zu ändern. | Verlierer |
| F-013 | 1 | Entwurf | Fundabgabe | Muss | Fundsache Abgeben | Nach Auswahl einer Fundsache muss das System dem Finder die Möglichkeit bieten, zwischen Abgabe im Fundbüro und direkter Übergabe an einen verifizierten Verlierer zu wählen. | Finder |
| F-014 | 1 | Entwurf | Fundabgabe | Muss | Abgabe bestätigen | Nach Übergabe einer Fundsache muss das System dem Finder die Möglichkeit bieten, eine digitale Bestätigung mit Fundnummer, Datum, Uhrzeit und Abgabeort zu erhalten. | Finder |
| F-015 | 1 | Entwurf | Sicherung Sensibler Gegenstände | Muss | Sensible Fundsachen sperren | Nach Kennzeichnung einer Fundsache als Ausweis, Bankkarte, Schlüssel, Handy, Laptop oder Wertsache muss das System die direkte Übergabe deaktivieren und zur Abgabe im Fundbüro leiten. | Finder/Verlierer |
| F-016 | 1 | Entwurf | Fundabholung | Muss | Fundsache Abholen | Nach Auswahl einer als gefunden gemeldeten Fundsache muss das System dem Verlierer die Möglichkeit bieten, einen Abholtermin bzw. eine Abholung im Fundbüro zu veranlassen. | Verlierer |
| F-017 | 1 | Entwurf | Fundabholung | Muss | Eigentum Nachweisen | Vor Herausgabe einer Fundsache muss das System dem Verlierer die Möglichkeit bieten, sein Eigentum durch versteckte Merkmale, einen Zweitschlüssel, eine Seriennummer oder ein Foto nachzuweisen. | Verlierer |
| F-018 | 1 | Entwurf | Direkte Übergabe | Soll | Direkte Übergabe vereinbaren | Nach einem bestätigten Treffer muss das System Finder und Verlierer die Möglichkeit bieten, eine direkte Übergabe an einem öffentlichen Treffpunkt zu vereinbaren | Finder/Verlierer |
| F-019 | 1 | Entwurf | Direkte Übergabe | Muss | Sicheren/Fairen Treffpunkt Vereinbaren | Nach Auswahl der Direkten Übergabe muss das System den Nutzern die Möglichkeit bieten, geeignete Öffentliche Treffpunkte vorzuschlagen oder ein fairer äquidistanter Öffentlicher Treffpunkt. | Finder/Verlierer |
| F-020 | 1 | Entwurf | Chat | Muss | Chat Öffnen | Nach gegenseitiger Freigabe einer direkten Übergabe muss das System den Nutzern die Möglichkeit bieten, über einen pseudonymen In-App-Chat zu kommunizieren. | Nutzer |
| F-021 | 1 | Entwurf | Sicherheit | Muss | Nutzer Blockieren | Nach Auswahl von „Blockieren" muss das System den Nutzer die Möglichkeit bieten, die Person mit der Gechattet wird zu Blockieren | Nutzer |
| F-022 | 1 | Entwurf | Sicherheit | Muss | Nutzer Melden | Nach Auswahl von „Melden" muss das System dem Nutzer die Möglichkeit bieten, eine andere Person wegen Missbrauchs, Belästigung oder Betrugs zu melden. | Nutzer |
| F-023 | 1 | Entwurf | Finderlohn | Soll | Finderlohn angeben | Nach Auswahl der direkten Übergabe muss das System dem Finder die Möglichkeit bieten, anzugeben, ob er Finderlohn geltend machen möchte. | Finder |
| F-024 | 1 | Entwurf | Finderlohn | Soll | Finderlohn Berechnen | Nach Eingabe eines geschätzten Gegenstandswerts muss das System dem Finder die Möglichkeit bieten, den gesetzlichen Mindest-Finderlohn automatisch berechnen zu lassen. | Finder |
| F-025 | 1 | Entwurf | Benachrichtigung | Muss | Fundtreffer benachrichtigen | Nach Erstellung eines möglichen Treffers muss das System dem Verlierer die Möglichkeit bieten, per Push- oder E-Mail-Benachrichtigung informiert zu werden. | Verlierer |
| F-026 | 1 | Entwurf | Status | Muss | Meldungsstatus anzeigen | Nach Aufruf einer eigenen Meldung muss das System dem Finder und Verlierer die Möglichkeit bieten, den Status „Offen", „Möglicher Treffer", „Bestätigt" oder „Abgeholt" einzusehen. | Finder/Verlierer |
| F-027 | 1 | Entwurf | Fundbüro | Muss | Fundsache erfassen | Nach Eingabe eines Fundgegenstands muss das System Fundbüro-Mitarbeitenden die Möglichkeit bieten, die Fundsache mit Beschreibung, Foto, Fundort, Fundzeit und Status zu erfassen. | Fundbüro-Mitarbeiter |
| F-028 | 1 | Entwurf | Fundbüro | Muss | Abholung per QR-Code bestätigen | Nach Scannen eines gültigen QR-Codes muss das System Fundbüro-Mitarbeitenden die Möglichkeit bieten, die Abholung des Gegenstands zu bestätigen und die Übergabe zu dokumentieren. | Fundbüro-Mitarbeiter |
| F-029 | 1 | Entwurf | Aufbewahrung | Soll | Aufbewahrungsfrist markieren | Nach Ablauf der Aufbewahrungsfrist muss das System Fundbüro-Mitarbeitenden die Möglichkeit bieten, den Fall als „Frist abgelaufen" zu markieren. | Fundbüro-Mitarbeiter |
| F-030 | 1 | Entwurf | Datenschutz | Muss | Daten Löschen | Nach Auswahl von „Daten löschen" muss das System dem Nutzer die Möglichkeit bieten, seine personenbezogenen Daten und Meldungen zu löschen, sofern keine gesetzlichen Aufbewahrungspflichten bestehen. | Nutzer |
| F-031 | 1 | Entwurf | Datenschutz | Muss | Sensible Fotos Schützen | Nach Upload eines Fotos mit erkennbaren Dokumenten, Karten oder Schlüsseln muss das System dem Betreiber die Möglichkeit bieten, das Foto automatisch zu prüfen, zu schwärzen oder die Veröffentlichung zu verhindern. | Betreiber |

---

## Aufgabe 2 – Erstellen Sie eine strukturierte Liste mit nicht-funktionalen Anforderungen

> Ergänzen Sie Ihre Anforderungsliste um mindestens vier nichtfunktionale Anforderungen Ihrer Fallstudie. Nichtfunktionale Anforderungen beschreiben Qualitätseigenschaften des Systems. Berücksichtigen Sie beispielsweise:
>
> - Benutzbarkeit und Barrierefreiheit
> - Sicherheit und Datenschutz
> - Wartbarkeit
>
> Formulieren Sie möglichst messbare Qualitätsziele und beschreiben Sie die Bedingungen, unter denen diese überprüft werden können. Überlegen Sie, welche Anforderungen nur für ein bestimmtes Feature gelten und welche für das gesamte System relevant sind. Verknüpfen Sie die Anforderungen bei Bedarf mit mehreren Features oder User Stories.
>
> | ID | Ver. | Quelle | Geltungsbereich | Anforderungsname | Anforderungsbeschreibung |
> | --- | --- | --- | --- | --- | --- |
> | ReqMOB-N010 | 1 | UC1 | Verbindungssuche | Antwortzeit | Bei 100 parallelen Suchanfragen müssen mindestens 95 % der Anfragen innerhalb von 3 Sekunden beantwortet werden. |

### Nichtfunktionale Anforderungen

| ID | Ver. | Quelle | Geltungsbereich | Anforderungsname | Anforderungsbeschreibung |
| --- | --- | --- | --- | --- | --- |
| NF-001 | 1 | F-008, F-009 | Fundbüro-Suche | Antwortzeit | Bei bis zu 100 gleichzeitigen Suchanfragen muss das System mindestens 95% der Ergebnisse innerhalb von 3 Sekunden anzeigen. |
| NF-002 | 1 | F-011, F-006 | Matching und KI | Antwortzeit | Bei einer normalen Fundsachensuche muss das System mindestens 90% der Ergebnisse innerhalb von 5 Sekunden anzeigen. |
| NF-003 | 1 | F-020, F-021, F-022 | Chat und Kommunikation | Datenschutz | Telefonnummer, Adresse und E-Mail-Adresse dürfen im Chat standardmäßig nicht an die andere Person übermittelt werden. |
| NF-004 | 1 | F-005, F-015, F-031 | Foto Upload | Datenschutz | Fotos mit erkennbaren Ausweisen, Karten oder Schlüsseln dürfen nicht öffentlich angezeigt werden. |
| NF-005 | 1 | F-030 | Gesamtes System | Löschbarkeit | Nach Ablauf des Verarbeitungszwecks müssen personenbezogene Daten gelöscht werden, sofern keine gesetzlichen Aufbewahrungsfristen bestehen. |
| NF-006 | 1 | F-008, F-009, F-018 | Fundbüro-Suche und Treffpunkte | Barrierefreiheit | Die App muss die Bedienung per Screenreader, ausreichende Kontraste und eine Mindestschriftgröße unterstützen. |
| NF-007 | 1 | F-003 bis F-012 | Gesamtes System | Benutzbarkeit | Ein neuer Nutzer muss eine Fund/Verlustmeldung ohne Anleitung innerhalb von 3 min. abschließen können. |
| NF-008 | 1 | F-027 bis F-029 | Fundbüro Modul | Wartbarkeit | Neue Fundbüros müssen ohne Änderung des App-Codes über eine Verwaltungsoberfläche hinzugefügt werden können. |

---

## Aufgabe 3 – Versehen Sie Ihre Anforderungen mit Akzeptanzkriterien

> Wählen Sie mindestens drei funktionale und zwei nichtfunktionale Anforderungen aus Ihrer Liste aus. Ergänzen Sie für jede dieser Anforderungen zwei bis vier Akzeptanzkriterien. Akzeptanzkriterien beschreiben konkrete Bedingungen, anhand derer überprüft werden kann, ob eine Anforderung erfüllt ist.
>
> Achten Sie dabei auf folgende Aspekte:
>
> - Beschreiben Sie konkrete Eingaben, Bedingungen und erwartete Ergebnisse
> - Berücksichtigen Sie den erfolgreichen Ablauf und Fehlerfälle oder alternative Abläufe
> - Verwenden Sie für nichtfunktionale Anforderungen messbare Kriterien
> - Legen Sie gegebenenfalls geeignete Testbedingungen fest
>
> **Beispiel – Funktionale Anforderung F-020 – Strecke als Favorit speichern**
>
> Nach Auswahl einer Strecke muss das System angemeldeten Fahrgästen ermöglichen, Start und Ziel als Favorit zu speichern.
>
> Akzeptanzkriterien:
> 1. Die Strecke „München-Laimstraße → München Hbf" wird gespeichert und erscheint anschließend in der Favoritenliste.
> 2. Nach Abmeldung und erneuter Anmeldung ist die gespeicherte Strecke weiterhin verfügbar.
> 3. Nach Neuinstallation der App und erneuter Anmeldung ist die gespeicherte Strecke weiterhin verfügbar.
> 4. Wird ein Favorit ausgewählt, übernimmt das System Start und Ziel in eine neue Verbindungssuche.

### F-003: Fundmeldung erstellen

**Anforderung:** Nach Auswahl von „Ich habe etwas gefunden" muss das System dem Finder die Möglichkeit bieten, eine Fundmeldung mit Gegenstandsart, Fundort, Funddatum, Fundzeit und optionaler Beschreibung zu erstellen.

**Akzeptanzkriterien:**

1. **Erfolgsfall:** Ein angemeldeter Finder wählt „Ich habe etwas gefunden", gibt „Geldbörse", „Sendlinger Tor, München", „20.11.2026" und „16:30 Uhr" ein und sendet die Meldung ab. Das System erstellt die Fundmeldung, zeigt die Fundnummer an und ändert den Status auf „Offen".
2. **Pflichtfelder:** Der Finder versucht, die Meldung ohne Gegenstandsart, Fundort oder Funddatum abzusenden. Das System verhindert das Absenden und zeigt für jedes fehlende Pflichtfeld eine klare Fehlermeldung an.
3. **Manueller Fundort:** Der Finder lehnt die Standortfreigabe ab. Das System bietet die Möglichkeit, den Fundort manuell über Adresse, PLZ oder per digitaler Karte einzugeben.
4. **Optionale Beschreibung:** Der Finder lässt das Beschreibungsfeld leer. Das System akzeptiert die Fundmeldung trotzdem, sofern alle Pflichtfelder ausgefüllt sind.

### F-008: Fundbüros anzeigen

**Anforderung:** Nach Eingabe eines Standorts oder Freigabe des aktuellen Standorts muss das System dem Finder und Verlierer die Möglichkeit bieten, Fundbüros in der Nähe inklusive Adresse, Entfernung und Öffnungszeiten anzuzeigen.

**Akzeptanzkriterien:**

1. **Erfolgsfall:** Ein Finder gibt „80331 München" ein. Das System zeigt mindestens drei Fundbüros im Umkreis von 10 km mit Adresse, Entfernung und Öffnungszeiten an.
2. **Standortfreigabe:** Ein Finder erlaubt die Standortfreigabe. Das System ermittelt den aktuellen Standort und sortiert die Fundbüros nach Entfernung/Ankunftszeit aufsteigend.
3. **Standortfreigabe:** Ein Finder erlaubt die Standortbestimmung. Das System ermittelt den aktuellen Standort und sortiert die Fundbüros nach Entfernung aufsteigend.
4. **Standortfreigabe:** Ein Finder erlaubt die Standortbestimmung. Das System ermittelt den aktuellen Standort und sortiert die Fundbüros nach Entfernung aufsteigend.
