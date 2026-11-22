# Übung 2

![Screenshot 2026-11-13 at 13.22.50.png](%C3%9Cbung%202/Screenshot_2026-11-13_at_13.22.50.png)

|           **ID**              | **Version** | **Status** | **Feature** | **Priorität** | **Anforderungfsname** | **Beschreibung** | **Quelle** |
| --- | --- | --- | --- | --- | --- | --- | --- |
| F-001 | 1 | Entwurf | Konto  | Muss | Konto registrieren | Nach Auswahl von „Registrieren“ muss das System neuen Nutzern die Möglichkeit bieten, ein Konto mit E-Mail-Adresse und Passwort zu erstellen. | Nutzer |
| F-002 | 1 | Entwurf | Anmeldung | Muss | Anmleden | Nach Eingabe gültiger Zugangsdaten muss das System dem Nutzer die Möglichkeit bieten, sich anzumelden und auf seine Meldungen zuzugreifen. | Nutzer |
| F-003 | 1 | Entwurf | Fundmeldung | Muss | Fundmeldung erstellen | Nach Auswahl von „Ich habe etwas gefunden“ muss das System dem Finder die Möglichkeit bieten, eine Fundmeldung mit Gegenstandsart, Fundort, Funddatum, Fundzeit und optionaler Beschreibung zu erstellen. | Finder |
| F-004 | 1 | Entwurf | Fundmeldung | Muss | Fundort erfassen | Nach Start der Fundmeldung muss das System dem Finder die Möglichkeit bieten, den Fundort automatisch über den Standort oder manuell per Adresse bzw. Karte anzugeben. | Finder |
| F-005 | 1 | Entwurf | Foto | Soll | Foto Hochladen | Nach Auswahl eines Fotos, muss das System den Nutzer die Möglichkeit bieten, ein Foto des Gegenstands hochzuladen. | Finder/Verlierer |
| F-006 | 1 | Entwurf | KI -Unterstützung | Soll | Gegenstand Identifizieren | Nach Foto upload muss das System den Nutzer die Möglichkeit bieten eine KI-gestützte Identifikation des Gegenstands anzufordern. | Nutzer |
| F-007 | 1 | Entwurf | KI -Unterstützung | Soll | Fehlende Merkmale abfragen | Nach KI-Fotoidentifikation muss das System den Nutzer die Möglichkeit bieten, fehlende Merkmale durch gezielte Rückfragen zu ergänzen.  | Nutzer |
| F-008	 | 1 | Entwurf | Fundbüro | Muss | Fundbüros Anzeigen | Nach Eingabe eines Standorts oder Freigabe des aktuellen Standorts muss das System dem Finder und Verlierer die Möglichkeit bieten, Fundbüros in der Nähe inklusive Adresse, Entfernung und Öffnungszeiten anzuzeigen. | Finder/Verlierer |
| F-009 | 1 | Entwurf | Fundbüro | Muss | Route anzeigen | Nach Auswahl eines Fundbüros muss das System dem Nutzer die Möglichkeit bieten, eine Route zum Fundbüro anzuzeigen oder zu starten. | Finder/Verlierer |
| F-010 | 1 | Entwurf | Verlustmeldung | Muss | Verlustmeldung Erstellen | Nach Auswahl von „Ich habe etwas verloren“ muss das System dem Verlierer die Möglichkeit bieten, eine Verlustmeldung mit Gegenstandsart, Verlustort, Verlustzeitraum, Beschreibung und optionalem Foto zu erstellen. | Verlierer |
| F-011 | 1 | Entwurf | Matching | Muss | Fundsachen Suchen | Nach Erstellen einer Verlustmeldung muss das System dem Verlierer die Möglichkeit bieten, passende Fundmeldungen anhand von Gegenstandsart, Ort, Datum und optionalen Merkmalen zu suchen. | Verlierer |
| F-012 | 1 | Entwurf | Matching | Muss | Verlustmeldung Bearbeiten | Nach Aufruf einer eigenen Verlustmeldung muss das System dem Verlierer die Möglichkeit bieten, Beschreibung, Merkmale, Foto oder Suchbereich nachträglich zu ergänzen oder zu ändern. | Verlierer |
| F-013 | 1 | Entwurf | Fundabgabe | Muss | Fundsache Abgeben | Nach Auswahl einer Fundsache muss das System dem Finder die Möglichkeit bieten, zwischen Abgabe im Fundbüro und direkter Übergabe an einen verifizierten Verlierer zu wählen. | Finder |
| F-014 | 1 | Entwurf | Fundabgabe | Muss | Abgabe bestätigen | Nach Übergabe einer Fundsache muss das System dem Finder die Möglichkeit bieten, eine digitale Bestätigung mit Fundnummer, Datum, Uhrzeit und Abgabeort zu erhalten. | Finder |
| F-015 | 1 | Entwurf | Sicherung Sensibler Gegenstände | Muss | Sensible Fundsachen sperren | Nach Kennzeichnung einer Fundsache als Ausweis, Bankkarte, Schlüssel, Handy, Laptop oder Wertsache muss das System die direkte Übergabe deaktivieren und zur Abgabe im Fundbüro leiten. | Finder/Verliere |
| F-016 | 1 | Entwurf | Fundabholung | Muss | Fundsache Abholen | Nach Auswahl einer als gefunden gemeldeten Fundsache muss das System dem Verlierer die Möglichkeit bieten, einen Abholtermin bzw. eine Abholung im Fundbüro zu veranlassen. | Verlierer |
| F-017 | 1 | Entwurf | Fundabholung | Muss | Eigentum Nachweisen | Vor Herausgabe einer Fundsache muss das System dem Verlierer die Möglichkeit bieten, sein Eigentum durch versteckte Merkmale, einen Zweitschlüssel, eine Seriennummer oder ein Foto nachzuweisen. | Verlierer |
| F-018 | 1 | Entwurf | Direkte Übergabe | Soll | Direkte Übergabe vereinbaren | Nach einem bestätigten Treffer muss das System Finder und Verlierer die Möglichkeit bieten, eine direkte Übergabe an einem öffentlichen Treffpunkt zu vereinbaren | Finder/Verlierer |
| F-019 | 1 | Entwurf | Direkte Übergabe | Muss | Sicheren/Fairen Treffpunkt Vereinbaren | Nach Auswahl der Direkten Übergabe muss das System den Nutzern die Möglichkeit bieten, geeignete Öffentliche Treffpunkte vorzuschlagen oder ein fairer äquidistanter Öffentlicher Treffpunkt. | Finder/Verlierer |
| F-020 | 1 | Entwurf | Chat | Muss | Chat Öffnen | Nach gegenseitiger Freigabe einer direkten Übergabe muss das System den Nutzern die Möglichkeit bieten, über einen pseudonymen In-App-Chat zu kommunizieren. | Nutzer |
| F-021 | 1 | Entwurf | Sicherheit | Muss | Nutzer Blockieren | Nach Auswahl von “Blockieren” muss das System den Nutzer die Möglichkeit bieten, die Person mit der Gechattet wird zu Blockieren | Nutzer |
| F-022 | 1 | Entwurf | Sicherheit | Muss | Nutzer Melden | Nach Auswahl von „Melden“ muss das System dem Nutzer die Möglichkeit bieten, eine andere Person wegen Missbrauchs, Belästigung oder Betrugs zu melden. | Nutzer |
| F-023 | 1 | Entwurf | Finderlohn | Soll | Finderlohn angeben | Nach Auswahl der direkten Übergabe muss das System dem Finder die Möglichkeit bieten, anzugeben, ob er Finderlohn geltend machen möchte. | Finder |
| F-024 | 1 | Entwurf | Finderlohn | Soll | Finderlohn Berechnen | Nach Eingabe eines geschätzten Gegenstandswerts muss das System dem Finder die Möglichkeit bieten, den gesetzlichen Mindest-Finderlohn automatisch berechnen zu lassen. | Finder |
| F-025 | 1 | Entwurf | Benachrichtigung | Muss | Fundtreffer benachrichtigen | Nach Erstellung eines möglichen Treffers muss das System dem Verlierer die Möglichkeit bieten, per Push- oder E-Mail-Benachrichtigung informiert zu werden. | Verlierer |
| F-026 | 1 | Entwurf | Status | Muss | Meldungsstatus anzeigen | Nach Aufruf einer eigenen Meldung muss das System dem Finder und Verlierer die Möglichkeit bieten, den Status „Offen“, „Möglicher Treffer“, „Bestätigt“ oder „Abgeholt“ einzusehen. | Finder/Verlierer |
| F-027 | 1 | Entwurf | Fundbüro | Muss | Fundsache erfassen | Nach Eingabe eines Fundgegenstands muss das System Fundbüro-Mitarbeitenden die Möglichkeit bieten, die Fundsache mit Beschreibung, Foto, Fundort, Fundzeit und Status zu erfassen. | Fundbüro Mitarbeiter |
| F-028 | 1 | Entwurf | Fundbüro | Muss | Abholung per QR-Code bestätigen | Nach Scannen eines gültigen QR-Codes muss das System Fundbüro-Mitarbeitenden die Möglichkeit bieten, die Abholung des Gegenstands zu bestätigen und die Übergabe zu dokumentieren. | Fundbüro Mitarbeiter |
| F-029 | 1 | Entwurf | Aufbewahrung | Soll | Aufbewahrungsfrist markieren | Nach Ablauf der Aufbewahrungsfrist muss das System Fundbüro-Mitarbeitenden die Möglichkeit bieten, den Fall als „Frist abgelaufen“ zu markieren. | Fundbüro Mitarbeiter |
| F-030 | 1 | Entwurf | Datenschutz | Muss | Daten Löschen | Nach Auswahl von „Daten löschen“ muss das System dem Nutzer die Möglichkeit bieten, seine personenbezogenen Daten und Meldungen zu löschen, sofern keine gesetzlichen Aufbewahrungspflichten bestehen. | Nutzer |
| F-031 | 1 | Entwurf | Datenschutz | Muss | Sensible Fotos Schützen | Nach Upload eines Fotos mit erkennbaren Dokumenten, Karten oder Schlüsseln muss das System dem Betreiber die Möglichkeit bieten, das Foto automatisch zu prüfen, zu schwärzen oder die Veröffentlichung zu verhindern. | Betreiber |

                                       

---

![image.png](%C3%9Cbung%202/46cc5b96-51b5-4dae-aee8-77922eefd9d7.png)

| **ID** | **Ver.** | **Quelle** | **Geltungsbereich** | **Anforderungsname** | **Anforderungsbeschreibung** |
| --- | --- | --- | --- | --- | --- |
| NF-001 | 1 | F-008,F-009 | Fundbüro-Suche | Antwortzeit | Bei bis zu 100 gleichzeitigen Suchanfragen muss das System mindestens 95% der Ergebnisse innerhalb von 3 Sekunden anzeigen. |
| NF-002 | 1 | F-011, F-006 | Matching und KI | Antwortzeit | Bei einer normalen Fundsachensuche muss das System mindestens 90% der Ergebnisse innerhalb von 5 Sekunden anzeigen. |
| NF-003 | 1 | F-020, F-021, F-022 | Chat und Kommunikation | Datenschutz | Telefonnummer, Adresse und E-Mail-Adresse dürfen im Chat standardmäßig nicht an die andere Person übermittelt werden. |
| NF-004 | 1 | F-005, F-015, F-031 | Foto Upload | Datenschutz | Fotos mit erkennbaren Ausweisen, Karten oder Schlüsseln dürfen nicht öffentlich angezeigt werden. |
| NF-005 | 1 | F-030 | Gesamtes System | Löschbarkeit | Nach Ablauf des Verarbeitungszwecks müssen personenbezogene Daten gelöscht werden, sofern keine gesetzlichen Aufbewahrungsfristen bestehen. |
| NF-006 | 1 | F-008, F-009, F-018 | Fundbüro-Suche undbTreffpunkte | Barrierefreiheit | Die App muss die Bedienung per Screenreader, ausreichende Kontraste und eine Mindestschriftgröße unterstützen. |
| NF-007 | 1 | F-003 bis F-012 | Gesamtes System | Benutzbarkeit | Ein neuer Nutzer muss eine Fund/Verlustmeldung ohne Anleitung innerhalb von 3 min. abschließen können. |
| NF-008 | 1 | F-027 bis F-029 | Fundbüro Modul | Wartbarkeit | Neue Fundbüros müssen ohne Änderung des App-Codes über eine Verwaltungsoberfläche hinzugefügt werden können. |
|  |  |  |  |  |  |
|  |  |  |  |  |  |

                            

---

![image.png](%C3%9Cbung%202/4e51ccec-3cbc-43c1-bcf6-ac8cd5a882f4.png)

## F-003: Fundmeldung erstellen

**Anforderung:**

Nach Auswahl von „Ich habe etwas gefunden“ muss das System dem Finder die Möglichkeit bieten, eine Fundmeldung mit Gegenstandsart, Fundort, Funddatum, Fundzeit und optionaler Beschreibung zu erstellen.

Akzeptanzkriterien:

1. **Erfolgsfall:** Ein angemeldeter Finder wählt „Ich habe etwas gefunden“, gibt „Geldbörse“, „Sendlinger Tor, München“, „20.11.2026“ und „16:30 Uhr“ ein und sendet die Meldung ab. Das System erstellt die Fundmeldung, zeigt die Fundnummer an und ändert den Status auf „Offen“.
2. **Pflichtfelder:** Der Finder versucht, die Meldung ohne Gegenstandsart, Fundort oder Funddatum abzusenden. Das System verhindert das Absenden und zeigt für jedes fehlende Pflichtfeld eine klare Fehlermeldung an.
3. **Manueller Fundort:** Der Finder lehnt die Standortfreigabe ab. Das System bietet die Möglichkeit, den Fundort manuell über Adresse, PLZ oder per digitaler Karte einzugeben.
4. **Optionale Beschreibung:** Der Finder lässt das Beschreibungsfeld leer. Das System akzeptiert die Fundmeldung trotzdem, sofern alle Pflichtfelder ausgefüllt sind.

## F-008: Fundbüros anzeigen

**Anforderung:**

Nach Eingabe eines Standorts oder Freigabe des aktuellen Standorts muss das System dem Finder und Verlierer die Möglichkeit bieten, Fundbüros in der Nähe inklusive Adresse, Entfernung und Öffnungszeiten anzuzeigen.

Akzeptanzkriterien:

1. **Erfolgsfall:** Ein Finder gibt „80331 München“ ein. Das System zeigt mindestens drei Fundbüros im Umkreis von 10 km mit Adresse, Entfernung und Öffnungszeiten an.

2. **Standortfreigabe:** Ein Finder erlaubt die Standortfreigabe. Das System ermittelt den aktuellen Standort und sortiert die Fundbüros nach Entfernung/Ankunftszeit aufsteigend.
3. **Standortfreigabe:** Ein Finder erlaubt die Standortbestimmung. Das System ermittelt den aktuellen Standort und sortiert die Fundbüros nach Entfernung aufsteigend.
4. **Standortfreigabe:** Ein Finder erlaubt die Standortbestimmung. Das System ermittelt den aktuellen Standort und sortiert die Fundbüros nach Entfernung aufsteigend.