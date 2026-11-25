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
| F-001 | 2 | Entwurf | Konto | Muss | Konto registrieren | Nach Auswahl von „Registrieren" muss das System neuen Nutzern die Möglichkeit bieten, ein Konto mit Telefonnummer zu erstellen und die Nummer per Verifizierungscode zu bestätigen. | Nutzer |
| F-002 | 2 | Entwurf | Anmeldung | Muss | Anmeldung | Nach Eingabe seiner Telefonnummer und eines gültigen Verifizierungscodes muss das System dem Nutzer die Möglichkeit bieten, sich anzumelden und auf seine Meldungen zuzugreifen. | Nutzer |
| F-003 | 2 | Entwurf | Fundmeldung | Muss | Fundmeldung erstellen | Nach Auswahl von „Ich habe etwas gefunden" muss das System dem Finder die Möglichkeit bieten, eine Fundmeldung mit Gegenstandsart, Fundort, Funddatum, Fundzeit, einer verpflichtenden Wertauswahl („unter 100 €“, „100 € oder mehr“ oder „weiß ich nicht“) und einer optionalen Beschreibung zu erstellen. | Finder |
| F-004 | 1 | Entwurf | Fundmeldung | Muss | Fundort erfassen | Nach Start der Fundmeldung muss das System dem Finder die Möglichkeit bieten, den Fundort automatisch über den Standort oder manuell per Adresse bzw. Karte anzugeben. | Finder |
| F-005 | 1 | Entwurf | Foto | Soll | Foto Hochladen | Nach Auswahl eines Fotos, muss das System den Nutzer die Möglichkeit bieten, ein Foto des Gegenstands hochzuladen. | Finder/Verlierer |
| F-006 | 1 | Entwurf | KI-Unterstützung | Soll | Gegenstand Identifizieren | Nach Foto upload muss das System den Nutzer die Möglichkeit bieten eine KI-gestützte Identifikation des Gegenstands anzufordern. | Nutzer |
| F-007 | 1 | Entwurf | KI-Unterstützung | Soll | Fehlende Merkmale abfragen | Nach KI-Fotoidentifikation muss das System den Nutzer die Möglichkeit bieten, fehlende Merkmale durch gezielte Rückfragen zu ergänzen. | Nutzer |
| F-008 | 2 | Entwurf | Fundbüro | Muss | Fundbüros Anzeigen | Nach Eingabe eines Standorts oder Freigabe des aktuellen Standorts muss das System dem Finder und Verlierer die Möglichkeit bieten, Fundbüros im Umkreis von 10 km inklusive Adresse, Entfernung und Öffnungszeiten anzuzeigen. Der Nutzer muss den Radius vergrößern können. Sind weniger als drei Fundbüros im Radius vorhanden, muss das System die drei nächsten Fundbüros mit einem Hinweis anzeigen. | Finder/Verlierer |
| F-009 | 1 | Entwurf | Fundbüro | Muss | Route anzeigen | Nach Auswahl eines Fundbüros muss das System dem Nutzer die Möglichkeit bieten, eine Route zum Fundbüro anzuzeigen oder zu starten. | Finder/Verlierer |
| F-010 | 1 | Entwurf | Verlustmeldung | Muss | Verlustmeldung Erstellen | Nach Auswahl von „Ich habe etwas verloren" muss das System dem Verlierer die Möglichkeit bieten, eine Verlustmeldung mit Gegenstandsart, Verlustort, Verlustzeitraum, Beschreibung und optionalem Foto zu erstellen. | Verlierer |
| F-011 | 1 | Entwurf | Matching | Muss | Fundsachen Suchen | Nach Erstellen einer Verlustmeldung muss das System dem Verlierer die Möglichkeit bieten, passende Fundmeldungen anhand von Gegenstandsart, Ort, Datum und optionalen Merkmalen zu suchen. | Verlierer |
| F-012 | 1 | Entwurf | Matching | Muss | Verlustmeldung Bearbeiten | Nach Aufruf einer eigenen Verlustmeldung muss das System dem Verlierer die Möglichkeit bieten, Beschreibung, Merkmale, Foto oder Suchbereich nachträglich zu ergänzen oder zu ändern. | Verlierer |
| F-013 | 1 | Entwurf | Fundabgabe | Muss | Fundsache Abgeben | Nach Auswahl einer Fundsache muss das System dem Finder die Möglichkeit bieten, zwischen Abgabe im Fundbüro und direkter Übergabe an einen verifizierten Verlierer zu wählen. | Finder |
| F-014 | 1 | Entwurf | Fundabgabe | Muss | Abgabe bestätigen | Nach Übergabe einer Fundsache muss das System dem Finder die Möglichkeit bieten, eine digitale Bestätigung mit Fundnummer, Datum, Uhrzeit und Abgabeort zu erhalten. | Finder |
| F-015 | 2 | Entwurf | Sicherung Sensibler Gegenstände | Muss | Sensible Fundsachen sperren | Nach Kennzeichnung einer Fundsache als Ausweis, Reisepass, Führerschein, Bankkarte, Geldbörse, Schlüssel, Handy, Tablet, Laptop, Bargeld oder nach Auswahl „100 € oder mehr“ muss das System die direkte Übergabe deaktivieren und zur Abgabe im Fundbüro leiten. Bei „weiß ich nicht“ gilt dieselbe Sperrung. Die Wertauswahl ist bei jeder Fundmeldung Pflicht; „unter 100 €“ allein sperrt keine direkte Übergabe. Eine spätere Wertänderung des Fundbüros muss Mitarbeiter und Datum dokumentieren und darf den Ablageort Fundbüro nicht ändern. | Finder/Verlierer |
| F-016 | 1 | Entwurf | Fundabholung | Muss | Fundsache Abholen | Nach Auswahl einer als gefunden gemeldeten Fundsache muss das System dem Verlierer die Möglichkeit bieten, einen Abholtermin bzw. eine Abholung im Fundbüro zu veranlassen. | Verlierer |
| F-017 | 1 | Entwurf | Fundabholung | Muss | Eigentum Nachweisen | Vor Herausgabe einer Fundsache muss das System dem Verlierer die Möglichkeit bieten, sein Eigentum durch versteckte Merkmale, einen Zweitschlüssel, eine Seriennummer oder ein Foto nachzuweisen. | Verlierer |
| F-018 | 1 | Entwurf | Direkte Übergabe | Soll | Direkte Übergabe vereinbaren | Nach einem bestätigten Treffer muss das System Finder und Verlierer die Möglichkeit bieten, eine direkte Übergabe an einem öffentlichen Treffpunkt zu vereinbaren | Finder/Verlierer |
| F-019 | 1 | Entwurf | Direkte Übergabe | Muss | Sicheren/Fairen Treffpunkt Vereinbaren | Nach Auswahl der Direkten Übergabe muss das System den Nutzern die Möglichkeit bieten, geeignete Öffentliche Treffpunkte vorzuschlagen oder ein fairer äquidistanter Öffentlicher Treffpunkt. | Finder/Verlierer |
| F-020 | 1 | Entwurf | Chat | Muss | Chat Öffnen | Nach gegenseitiger Freigabe einer direkten Übergabe muss das System den Nutzern die Möglichkeit bieten, über einen pseudonymen In-App-Chat zu kommunizieren. | Nutzer |
| F-021 | 1 | Entwurf | Sicherheit | Muss | Nutzer Blockieren | Nach Auswahl von „Blockieren" muss das System den Nutzer die Möglichkeit bieten, die Person mit der Gechattet wird zu Blockieren | Nutzer |
| F-022 | 1 | Entwurf | Sicherheit | Muss | Nutzer Melden | Nach Auswahl von „Melden" muss das System dem Nutzer die Möglichkeit bieten, eine andere Person wegen Missbrauchs, Belästigung oder Betrugs zu melden. | Nutzer |
| F-023 | 1 | Entwurf | Finderlohn | Soll | Finderlohn angeben | Nach Auswahl der direkten Übergabe muss das System dem Finder die Möglichkeit bieten, anzugeben, ob er Finderlohn geltend machen möchte. | Finder |
| F-024 | 1 | Entwurf | Finderlohn | Soll | Finderlohn Berechnen | Nach Eingabe eines geschätzten Gegenstandswerts muss das System dem Finder die Möglichkeit bieten, den gesetzlichen Mindest-Finderlohn automatisch berechnen zu lassen. | Finder |
| F-025 | 2 | Entwurf | Benachrichtigung | Muss | Fundtreffer benachrichtigen | Nach Erstellung eines möglichen Treffers muss das System dem Verlierer die Möglichkeit bieten, per Push, E-Mail, SMS oder Anruf informiert zu werden. | Verlierer |
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

**Anforderung:** Nach Auswahl von „Ich habe etwas gefunden" muss das System dem Finder die Möglichkeit bieten, eine Fundmeldung mit Gegenstandsart, Fundort, Funddatum, Fundzeit, einer verpflichtenden Wertauswahl („unter 100 €“, „100 € oder mehr“ oder „weiß ich nicht“) und einer optionalen Beschreibung zu erstellen.

**Akzeptanzkriterien:**

1. **Erfolgsfall:** Ein angemeldeter Finder wählt „Ich habe etwas gefunden", gibt „Geldbörse", „Sendlinger Tor, München", „20.11.2026", „16:30 Uhr" und „unter 100 €" ein und sendet die Meldung ab. Das System erstellt die Fundmeldung, zeigt die Fundnummer an und ändert den Status auf „Offen".
2. **Pflichtfelder:** Der Finder versucht, die Meldung ohne Gegenstandsart, Fundort, Funddatum oder Wertauswahl abzusenden. Das System verhindert das Absenden und zeigt für jedes fehlende Pflichtfeld eine klare Fehlermeldung an.
3. **Manueller Fundort:** Der Finder lehnt die Standortfreigabe ab. Das System bietet die Möglichkeit, den Fundort manuell über Adresse, PLZ oder per digitaler Karte einzugeben.
4. **Optionale Beschreibung:** Der Finder lässt das Beschreibungsfeld leer. Das System akzeptiert die Fundmeldung trotzdem, sofern alle Pflichtfelder ausgefüllt sind.

### F-008: Fundbüros anzeigen

**Anforderung:** Nach Eingabe eines Standorts oder Freigabe des aktuellen Standorts muss das System dem Finder und Verlierer die Möglichkeit bieten, Fundbüros im Umkreis von 10 km inklusive Adresse, Entfernung und Öffnungszeiten anzuzeigen. Der Nutzer muss den Radius vergrößern können. Sind weniger als drei Fundbüros im Radius vorhanden, muss das System die drei nächsten Fundbüros mit einem Hinweis anzeigen.

**Akzeptanzkriterien:**

1. **Erfolgsfall:** Ein Finder gibt „80331 München" ein. Sind mindestens drei Fundbüros im Umkreis von 10 km vorhanden, zeigt das System diese mit Adresse, Entfernung und Öffnungszeiten an. Sind weniger als drei vorhanden, zeigt das System die drei nächsten Fundbüros mit einem Hinweis auf den erweiterten Suchbereich.
2. **Standortfreigabe:** Ein Finder erlaubt die Standortfreigabe. Das System ermittelt den aktuellen Standort und sortiert die Fundbüros nach Entfernung/Ankunftszeit aufsteigend.
3. **Keine Standortfreigabe:** Ein Finder erlaubt die Standortbestimmung nicht. Das System zeigt ein Eingabefeld für Adresse oder PLZ.
4. **Ungültige PLZ:** Der Finder gibt die PLZ „00000“ ein. Das System zeigt die Meldung „PLZ nicht gefunden“.

## F-011: Fundsachen suchen

**Anforderung:**

Nach Erstellen einer Verlustmeldung muss das System dem Verlierer die Möglichkeit bieten, passende Fundmeldungen anhand von Gegenstandsart, Ort, Datum und optionalen Merkmalen zu suchen.

Akzeptanzkriterien: 

1. **Erfolgsfall:** Ein Verlierer erstellt eine Verlustmeldung für eine „blaue Geldbörse“, verloren am „19.11.2026“ in „München Hbf“. Das System zeigt alle Fundmeldungen mit Gegenstandsart „Geldbörse“ an, deren Funddatum innerhalb von 7 Tagen und deren Fundort innerhalb von 10 km liegt.
2. **Relevanzsortierung:** Bei mehreren Treffern werden Fundmeldungen mit übereinstimmender Gegenstandsart, näherem Fundort und ähnlichem Funddatum weiter oben angezeigt.
3. **Keine Treffer:** Es existiert keine passende Fundmeldung. Das System zeigt „Keine passenden Fundsachen gefunden“ an und bietet an, den Suchradius oder Zeitraum zu erweitern.
4. **Unvollständige Angeben:** Der Verlierer gibt nur die Gegenstandsart „Schlüssel“ ein. Das System führt die Suche trotzdem durch und zeigt passende Fundmeldungen, sortiert nach Relevanz.

## F-014: Abgabe bestätigen

**Anforderung:**

Nach Übergabe einer Fundsache muss das System dem Finder die Möglichkeit bieten, eine digitale Bestätigung mit Fundnummer, Datum, Uhrzeit und Abgabeort zu erhalten.

Akzeptanzkriterien:

1. **Erfolgsfall:** Ein Finder gibt eine Fundsache im Fundbüro ab. Die Mitarbeitenden bestätigen die Abgabe per QR-Code. Das System erzeugt eine Bestätigung mit Fundnummer, Datum, Uhrzeit, Fundbüro und Status „Abgegeben“.

2. **Abrufbar bleiben:** Der Finder meldet sich ab und erneut an. Die Abgabe-Bestätigung ist weiterhin in seinem Profil bzw. unter „Meine Fundmeldungen“ abrufbar.

3. **Download:** Der Finder wählt „Bestätigung herunterladen“. Das System stellt eine PDF-Datei mit allen Pflichtangaben bereit.

4. **Fehlerfall**: Der QR-Code ist ungültig oder wurde bereits verwendet. Das System verhindert die Bestätigung und zeigt eine Fehlermeldung an, etwa „QR-Code ungültig oder bereits verwendet“.

## F-019: Sensible Fundsachen sperren

**Anforderung:**

Nach Kennzeichnung einer Fundsache als Ausweis, Bankkarte, Schlüssel, Handy, Laptop oder Wertsache muss das System die direkte Übergabe deaktivieren und zur Abgabe im Fundbüro leiten.

Akzeptanzkriterien:

1. **Erfolgsfall:** Ein Finder wählt bei einer Fundmeldung die Kategorie „Ausweis“. Das System zeigt eine Warnung an und bietet ausschließlich die Option „Abgabe im Fundbüro“ an.
2. **Erfolgsfall:** Ein Finder wählt bei einer Fundmeldung die Kategorie „Ausweis“. Das System zeigt eine Warnung an und bietet ausschließlich die Option „Abgabe im Fundbüro“ an.
3. **Weiterleitung:** Nach Bestätigung der sensiblen Fundsache zeigt das System automatisch das nächstgelegene Fundbüro mit Adresse und Öffnungszeiten an.
4. **Fehlerfall:** Ein Finder versucht, über die API oder eine manipulierte Eingabe eine direkte Übergabe für einen Ausweis anzustoßen. Das System lehnt die Anfrage ab und erstellt keine Übergabevereinbarung.

## NF-001: Antwortzeit der Fundbüro-Suche

**Anforderung:**

Bei bis zu 100 gleichzeitigen Suchanfragen muss das System mindestens 95% der Ergebnisse innerhalb von 3 Sekunden anzeigen.

1. Bei 100 parallelen Anfragen erreichen mindestens 95% eine Antwortzeit von höchstens 3 Sekunden. 

2. Gemessen wird bis zur vollständigen Anzeige der Liste. 

3. Überschreitet das 95-Perzentil 3 Sekunden, ist die Anforderung nicht erfüllt. 

4. Der Test wird dreimal wiederholt; mindestens zwei Durchläufe müssen bestehen.

## NF-005: Datenschutz bei Fotos

**Anforderung:**

Fotos mit erkennbaren Ausweisen, Karten oder Schlüsseln dürfen nicht öffentlich angezeigt werden.

1. **Erfolgsfall:** Ein Finder lädt ein Foto einer geschlossenen Geldbörse hoch. Das System akzeptiert das Foto und zeigt es ausschließlich in der zugehörigen Fundmeldung an.
2. **Ausweis erkannt:** Ein Finder lädt ein Foto hoch, auf dem ein Personalausweis erkennbar ist. Das System schwärzt automatisch die Dokumentbereiche oder verhindert die Veröffentlichung des Fotos.
3. **Bankkarte erkannt:** Ein Finder lädt ein Foto mit einer sichtbaren EC- oder Kreditkarte hoch. Das System verhindert die öffentliche Anzeige und fordert den Nutzer auf, ein Foto ohne Kartendetails hochzuladen.
4. **Schlüssel erkannt**: Ein Finder lädt ein Foto eines Schlüssels hoch. Das System zeigt das Foto nicht öffentlich an und warnt, dass Schlüssel nur über das Fundbüro abgegeben werden dürfen.


Übung 4: 


## Features

| Feature                                     | Enthaltene Anforderungen                             | Nutzerwert                                                                                  |
| ------------------------------------------- | ---------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| **F1: Konto und Anmeldung**                 | F-001, F-002, F-030                                  | Nutzer können sich registrieren, anmelden und ihre Daten verwalten.                         |
| **F2: Fundmeldung**                         | F-003, F-004, F-005, F-023, F-024, F-031             | Finder können eine Fundsache melden, Fotos hochladen und sensible Gegenstände kennzeichnen. |
| **F3: Verlustmeldung und Suche**            | F-010, F-011, F-012, F-005, F-006, F-007             | Verlierer können einen Verlust melden, Fotos hochladen und passende Fundsachen finden.      |
| **F4: Fundbüro-Finder**                     | F-008, F-009, NF-001                                 | Finder und Verlierer finden Fundbüros inklusive Öffnungszeiten und Route.                   |
| **F5: Sichere Fundabgabe**                  | F-013, F-014, F-019, F-022                           | Finder geben Fundsachen sicher ab und erhalten eine Bestätigung.                            |
| **F6: Fundabholung und Eigentumsprüfung**   | F-015, F-016, F-026                                  | Verlierer können Fundsachen abholen und ihr Eigentum nachweisen.                            |
| **F7: Direkte Übergabe**                    | F-017, F-018, F-020, F-021, F-023, F-024             | Finder und Verlierer können eine sichere direkte Übergabe vereinbaren.                      |
| **F8: Benachrichtigungen und Status**       | F-025, F-026                                         | Nutzer erfahren, wenn es einen Treffer gibt und wie der Fall steht.                         |
| **F9: Fundbüro-Verwaltung**                 | F-027, F-028, F-029                                  | Fundbüro-Mitarbeitende erfassen Fundsachen, bestätigen Abholungen und verwalten Fristen.    |
| **F10: KI-Unterstützung**                   | F-006, F-007, NF-012                                 | Nutzer erhalten Unterstützung bei Fotoerkennung und vollständiger Beschreibung.             |
| **F11: Datenschutz und Sicherheit**         | F-030, F-031, NF-004, NF-005, NF-006, NF-007, NF-008 | Das System schützt personenbezogene Daten, Fotos und Kommunikation.                         |
| **F12: Barrierefreiheit und Benutzbarkeit** | NF-009, NF-010                                       | Die App ist für möglichst viele Nutzer verständlich und bedienbar.                          |
| **F13: Wartbarkeit und Betrieb**            | NF-003, NF-011                                       | Das System bleibt verfügbar und kann ohne Codeänderung erweitert werden.                    |

## Roadmap

| Priorität    | Feature                                     | Begründung                                                                                                              |
| ------------ | ------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| **Sofort**   | **F1: Konto und Anmeldung**                 | Ohne Konto können Meldungen, Status und Chat nicht zuverlässig einer Person zugeordnet werden.                          |
| **Sofort**   | **F2: Fundmeldung**                         | Ohne Fundmeldung gibt es keinen Fund, keine Suche und keine Rückgabe.                                                   |
| **Sofort**   | **F3: Verlustmeldung und Suche**            | Ohne Verlustmeldung kann ein Verlierer seine Fundsache nicht finden.                                                    |
| **Sofort**   | **F4: Fundbüro-Finder**                     | Die App muss zeigen, wo eine Fundsache sicher abgegeben oder abgeholt werden kann.                                      |
| **Sofort**   | **F5: Sichere Fundabgabe**                  | Die Abgabe und Bestätigung ist der Kernprozess für Finder und Fundbüro.                                                 |
| **Sofort**   | **F6: Fundabholung und Eigentumsprüfung**   | Ohne Eigentumsprüfung könnte eine falsche Person die Fundsache erhalten.                                                |
| **Sofort**   | **F8: Benachrichtigungen und Status**       | Nutzer müssen wissen, ob es einen Treffer gibt und welchen Status ihre Meldung hat.                                     |
| **Sofort**   | **F9: Fundbüro-Verwaltung**                 | Ohne Erfassung und QR-Code-Bestätigung kann das Fundbüro die Fundsachen nicht verwalten.                                |
| **Sofort**   | **F11: Datenschutz und Sicherheit**         | Datenschutz, Foto-Schutz und sichere Kommunikation sind für eine Fund-App unverzichtbar.                                |
| **Nächstes** | **F7: Direkte Übergabe**                    | Die direkte Übergabe ist nützlich, aber das Fundbüro bleibt zunächst der sichere Standardweg.                           |
| **Nächstes** | **F10: KI-Unterstützung**                   | KI verbessert Matching und Beschreibung, ist für den ersten Release aber nicht zwingend notwendig.                      |
| **Nächstes** | **F12: Barrierefreiheit und Benutzbarkeit** | Wichtig für Qualität und Reichweite; grundlegende Barrierefreiheit sollte früh, erweiterte Optimierung danach erfolgen. |
| **Später**   | **F13: Wartbarkeit und Betrieb**            | Erweiterte Monitoring-, Skalierungs- und Admin-Funktionen sind wichtig, aber nicht für den ersten Release zwingend.     |
| **Nie**      | **Öffentliche Anzeige sensibler Fotos**     | Ausweise, Karten und Schlüssel dürfen nicht öffentlich sichtbar sein; das ist bewusst ausgeschlossen.                   |
| **Nie**      | **Direkte Übergabe sensibler Fundsachen**   | Ausweise, Karten, Schlüssel, Handys und Wertsachen werden ausschließlich über das Fundbüro zurückgegeben.               |
| **Nie**      | **Automatische Garantie für Finderlohn**    | Die App kann Finderlohn berechnen und dokumentieren, aber keinen Rechtsanspruch durchsetzen.                            |

## Nichtfunktionale Anforderungen zuordnen

| Nichtfunktionale Anforderung        | Zugeordnetes Feature                    | Art                                 |
| ----------------------------------- | --------------------------------------- | ----------------------------------- |
| NF-001: Antwortzeit Fundbüro-Suche  | F4: Fundbüro-Finder                     | Feature-spezifisch                  |
| NF-002: Antwortzeit Matching und KI | F3, F10                                 | Feature-spezifisch                  |
| NF-003: Verfügbarkeit               | F13: Wartbarkeit und Betrieb            | Übergreifend                        |
| NF-004: Datenschutz im Chat         | F7, F11                                 | Feature-spezifisch und übergreifend |
| NF-005: Datenschutz bei Fotos       | F2, F3, F11                             | Feature-spezifisch und übergreifend |
| NF-006: Datenminimierung            | F11: Datenschutz und Sicherheit         | Übergreifend                        |
| NF-007: Löschbarkeit                | F1, F11                                 | Übergreifend                        |
| NF-008: Sicherheit                  | F1, F7, F11                             | Übergreifend                        |
| NF-009: Barrierefreiheit            | F12: Barrierefreiheit und Benutzbarkeit | Übergreifend                        |
| NF-010: Benutzbarkeit               | F12: Barrierefreiheit und Benutzbarkeit | Übergreifend                        |
| NF-011: Wartbarkeit                 | F13: Wartbarkeit und Betrieb            | Übergreifend                        |
| NF-012: KI-Zuverlässigkeit          | F10: KI-Unterstützung                   | Feature-spezifisch                  |

## Begründung: F5 sichere Fundabgabe

**F5: Sichere Fundabgabe** ist **Sofort**, weil es der zentrale Prozess der App ist. Ein Finder muss eine Fundsache verlässlich abgeben können und einen Nachweis erhalten; sonst entsteht kein vertrauenswürdiger Übergabeprozess.

**Nutzen für die Personas:**

- **Thomas, der Finder:** Er kann die Geldbörse schnell und ohne direkten Kontakt zu Giovanni abgeben.
- **Giovanni, der Verlierer:** Er weiß, dass die Fundsache dokumentiert im Fundbüro ist und kann sie nach Eigentumsprüfung abholen.
- **Fundbüro-Mitarbeitende:** Sie erhalten eine strukturierte Fundmeldung und können die Übergabe nachvollziehen.

**Abhängigkeiten:**

- F5 benötigt **F2 Fundmeldung**, weil ohne Fundmeldung keine Fundsache existiert.
- F5 benötigt **F4 Fundbüro-Finder**, damit der Finder weiß, wohin er gehen soll.
- F5 benötigt **F11 Datenschutz und Sicherheit**, damit sensible Fotos und Daten geschützt werden.
- F5 ist Voraussetzung für **F6 Fundabholung**, weil der Verlierer nur eine bereits abgegebene Fundsache abholen kann.

**Implementierungsaufwand:**

Der Aufwand ist mittel bis hoch, weil mehrere Teile zusammenarbeiten müssen:

- Fundmeldung erstellen und speichern
- Fundbüro-Suche und Route
- QR-Code-basierte Abgabe-Bestätigung
- Statusänderung „Abgegeben“
- Benachrichtigung an Finder und Verlierer
- Datenschutzprüfung für Fotos

Trotzdem ist F5 unverzichtbar: Ohne sichere Abgabe wäre die App nur eine Suchmaschine für Fundsachen, aber kein vollständiges Fundbüro-System. Muss-Features sind genau die Funktionen, ohne die ein Release nicht erfolgreich wäre.

## Begründung: F7 direkte Übergabe

**F7: Direkte Übergabe** ist **Nächstes**, weil sie einen echten Nutzen hat, aber nicht für den ersten Release notwendig ist.

**Nutzen:** Finder und Verlierer können unempfindliche Fundsachen schneller zurückgeben, ohne ein Fundbüro aufsuchen zu müssen.

**Abhängigkeiten:**

- F7 benötigt **F2** und **F3**, damit Fund- und Verlustmeldung existieren.
- F7 benötigt **F11**, damit Identität, Chat und persönliche Daten geschützt sind.
- F7 benötigt **F5**, damit es einen sicheren Fallback über das Fundbüro gibt.
- F7 sollte erst nach F5 umgesetzt werden, weil die Fundbüro-Abgabe der sichere Standardprozess ist.

**Aufwand:** Hoch, weil ihr Chat, Identitätsprüfung, Treffpunkt-Vorschläge, Blockier- und Meldefunktion, Finderlohn-Dokumentation und Sicherheitsregeln umsetzen müsst.

Deshalb: **erst Fundbüro-Abgabe, dann direkte Übergabe.** Das reduziert Risiko, Datenschutzprobleme und Betrugsmöglichkeiten im ersten Release. Features mit hoher Komplexität und Sicherheitsrisiko sollten erst nach den Kernfunktionen kommen.



