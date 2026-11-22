# Übung 1 – Software Engineering 1 (Wintersemester 2026/2027)

Fallstudie: **Fundbüro-App**

---

## Aufgabe 1 – Wahl einer Fallstudie

> Diskutieren Sie mit Ihrem Sitznachbarn, welche der vorgeschlagenen Fallstudien Sie bearbeiten wollen. Legen Sie sich für diese Übung auf eine Fallstudie fest. (Die Zusammenarbeit von drei Personen ist nur möglich, wenn nur eine ungerade Zahl von Studierenden in der Übung anwesend ist). Sie können die Fallstudie und die Gruppe bis zum 28.10.2026 noch ändern.

**Gewählte Fallstudie:** Fundbüro-App

## Aufgabe 2 – Einrichten Ihrer Entwicklungsumgebung (20 Minuten)

> Installieren oder aktivieren Sie eine Entwicklungsumgebung, empfohlen sind Visual Studio Code oder IntelliJ. Das folgende Repository enthält Installationshinweise und einfache Beispiele der Fahrkarten-App (https://github.com/HMFK07/Uebung1_SWE1). Laden Sie das Repository als ZIP-Datei herunter, entpacken Sie es in einen Ordner, öffnen Sie den Ordner mit Ihrer Entwicklungsumgebung und führen Sie den Code aus.
>
> Wenn Sie sich mit Ihrer @hm.edu Adresse ein Konto bei GitHub erstellen, können Sie GitHub Copilot kostenlos nutzen. Installieren Sie die Copilot CLI. Starten Sie in Ihrer IDE ein Terminal und geben Sie *copilot* ein.
>
> Versuchen Sie den Code zu verstehen. Lassen Sie sich jene Teile, die Sie nicht verstehen, im Chat erklären. Erweitern Sie den Code durch Nutzung des Chats, so dass es ein einfaches Benutzerkonto enthält.

---

## Aufgabe 3 – Erstellen Sie Personas für die wichtigsten Nutzergruppen Ihres Systems (30 Minuten)

> Personas helfen Ihnen, sich in die Perspektive eines Nutzers zu versetzen, der mit Ihrem System interagieren soll. Entwickeln Sie dazu mindestens zwei Personas für Ihre Case Study, um eine konkrete Perspektive einzunehmen: Definieren Sie z.B.:
>
> - Demografische Daten,
> - Bedürfnisse,
> - Probleme und Herausforderungen,
> - Verhalten in der Vergangenheit,
> - Ziele,
> - Qualitätswahrnehmung.
>
> Nutzen Sie die Persona als Grundlage für spätere Szenarien und Anwendungsfälle, um realistische Nutzungssituationen zu gestalten.

### Persona 1

**Name:** Anna
**Geschlecht:** Frau
**Alter:** 22
**Tätigkeit:** Student bei der HM
**Wohnort:** München
**Staatsangehörigkeit:** Deutsch

**Bedürfnisse:** Uni und mini job nimmt veil zeit auf während die Woche - Will nicht viel zahlen - Muss immer mit öffentlichen verkehr pendeln - Hat ihren Schlüssel verloren und muss den dringend finden. Bevorzugt eine App oder Website wo sie schauen kann ob ihr Schlüssel irgendwo gefunden ist, oder schauen kann welche fundbüros gibt. App soll schnell und intuitive sein.

**Probleme und Herausforderungen:** Anna hat auf den Heimweg von der Uni gemärkt, dass sie irgendwo Ihren Schlüssel verloren hat- Sie hat noch nie was verloren und weiß überhaupt nicht wo hin - rüft ihre Mutter an und wird empfohlen erst zu schauen wo sie war und beim fund Büro nach zu fragen - Sie weiß nicht ob sie das in der bahn, Hochschule München, beim Bäcker oder sonnst irgendwo verloren hat. Sie ist komplett gestresst. Es ist schon 18:00 Uhr und bald macht alles zu. Hat nicht viel zeit.

**Ziele:** Anna muss Ihren Schlüssel finden sonnst kommt sie nicht in ihre Wohnung. Geht erstmal ihre schritte zurück. Schaut bei der Hochschule, und beim Bäcker. S bahn und u bahn machen kein sinn zu schauen.

**Qualitätswahrnehmung:** Einfach, zuverlässig, schnell, privat (Datenschutz), Integration mit Google Maps (und andere Apps)

### Persona 2

**Name:** Giovanni
**Geschlecht:** Man
**Alter:** 78
**Tätigkeit:** In Rente
**Wohnort:** München
**Staatsangehörigkeit:** Italienisch

**Bedürfnisse:** Hat seine Geldbörse verloren und kann nicht vorstellen wo. Er würde gerne nachsehen ob die irgendwo gefunden würde. Ehr kann nicht gut gehen, und will nicht ständig zu die Fundbüros pendeln. Er würde daher gerne online mit seinen Tablet recherchieren ob seine Geldbörse irgendwo gefunden würde.

**Probleme und Herausforderungen:** Giovanni hat keinen Smartphone, aber er hat einen tablet. Er kommt kaum klar mit google maps und tüt sich schwer mit Internet browsing. Er rüft seinen Sohn an, der ihn alles telefonische erklären muss. Er hat seine verloren Gelbörse vor der Haustür gemärkt. Er ist auch tram und bus gefahren. Giovanni kann nicht so gut gehen. Giovanni kennt sich nicht gut mit sein tablet aus, und braucht telefonische von sein sohn in Berlin. Er kann auch nicht so gut Deutsch. Er hat eine gmx email, und hat zugang zu die, weiß aber seine passwörter nicht (er macht das auch nie auf).

**Ziele:** Giovanni will schauen wo die fund Büros sind so das er dahin gehen kann. Es ist spät abends und die laden schliessen gleich. Daher wurde er gerne irgendwo anrufen, oder online schauen (auf dieses tolle ding was Internet heißt).

**Qualitätswahrnehmung:** Für Ihn wäre eine hochqualitative App oder Website, was wo ehr erst mal auch Italianisch sich recherchieren kann, ob irgendwo seine Geldbürse gefunden wurde. Er muss das leicht finden können, mit telefonische Hilfe von seinen Sohn. Konto soll leicht. Erstellbar sein mit beschränkt Date.

### Persona 3: Thomas Weber – Finder

**Demografie:** 45 Jahre, Angestellter, pendelt mit ÖPNV
**Rolle:** Hat einen Gegenstand gefunden
**Bedürfnisse:** Fund schnell melden; Kontakt zur echten Eigentümer/in herstellen; keine langen Formulare, Will Nächstliegendes Fundbüro einfach finden
**Probleme:** Unsicher, wohin mit dem Fundstück; möchte keinen persönlichen Kontakt am Straßenrand
**Verhalten:** Nutzt digitale Dienste, wenn sie wenig Aufwand verursachen
**Ziele:** Gefundenen Gegenstand sicher und unkompliziert abgeben bzw. zurückgeben
**Qualitätswahrnehmung:** Wichtig sind klare Schritte, Vertrauen, Schutz der Privatsphäre und schnelle Vermittlung

---

## Aufgabe 4 – Schreiben Sie ein Szenario, in der die Persona Ihre Anwendung ausführt

> Wählen Sie eine Kernfunktionalität Ihrer Case Study.
>
> Formulieren für die Funktionalität ein Szenario. Beschreiben Sie eine narrative Geschichte, die die Interaktion zwischen Benutzer und dem System im Detail darstellt. Szenarien ermöglichen es, sich in die Situation des Benutzers zu versetzen und zu verstehen, wie sie mit dem System interagieren.
>
> Fassen Sie am Ende folgende Punkte kurz zusammen:
>
> - Name des Szenarios
> - Beteiligte Persona
> - Übergeordnetes Ziel
> - Was zur Zielerreichung nötig ist
> - Problem mit dem bestehenden System
> - Mögliche Problemlösungen

### Szenario 1 (Giovanni)

Giovanni hat seine Geldbörse verloren und kann sich nicht erinnern wo. Er war den ganzen Tag unterwegs und bemerkt erst Abends zuhause das Ihm seine Geldbörse fehlt. Er würde sich gerne erkundigen ob sie irgendwo gefunden würde. Erstmals ruft er sein Technik-affinen Sohn an für Hilfe und fragt ihm ob es durch das Internet eine Lösung gibt. Der Sohn schaut Online für eine Fundbüro App in München und entdeckt <<Insert Name Here>> und erklärt ihm wie sie funktioniert. Mithilfe seines Sohns lädt er die Fundbüro App auf sein Tablet und öffnet die App. Auf der Startseite mit zwei möglichkeiten: Ich habe was verloren, Ich habe was gefunden. Dazu ein button um die Sprache umzustellen. Er klickt auf Italienisch und "Ich habe was verloren". Er muss seine Daten (Name, Telefonnummer) eingeben und wie er bei einem Fund Benachrichtigt werden will (Text/Anruf). Er meldet was er verloren hat, Datum und Uhrzeit (falls er es weiß) und sein Tagesablauf von möglichen verluststellen. Seine angaben werden bestätigt, er kann den fortschritt von seinem fall auf der App verfolgen oder wird per Text/Anruf benachrichtigt.

### Szenario 2 (Thomas)

Stichpunkte:
- Thomas findet
- Öffnet app
- meldet verlust
- Nächstes Fundbüro wird angezeigt

Thomas Weber pendelt per ÖPNV nach hause, er findet an der Bushaltestelle eine Geldbörse, er hebt sie auf schaut rein und sieht, dass sie einem Mann namens Giovanni gehört. Er will sie abgeben damit sie wieder zu Giovanni gelangt, aber die Zeit um nach ihm zu suchen und zu finden hat er nicht dazu kennt er Giovanni nicht und will nicht unnötig mit einer fremden Person in Kontakt kommen. Zum Glück hat Thomas von einer App gehört die ihm dabei helfen soll. Er lädt die <<Insert name here>> App runter und öffnet sie. Er klickt auf "Ich habe was Gefunden", Ihm wird angezeigt dass er Gleich eine Verlustmeldung erstellen kann und Welche Fundbüros in der Nähe sind. er tut beides. Er meldet was, wo, wann und Lädt ein foto der Geldbörse hoch, er bestätigt den Fund und macht sich auf dem weg zu dem nächstliegendem Fundbüro um es abzugeben....

---

## Aufgabe 5 – Schreiben und analysieren Sie User Stories

> User-Stories sind Schilderungen, die mehr ins Detail gehen und die einen einzelnen Aspekt, den ein Benutzer von einem Softwaresystem erwartet, ausführlicher und strukturierter darstellen. Schreiben Sie mindestens fünf User Stories im Format:
>
> **Als <Rolle> <möchte / will / muss> ich <etwas tun>, damit <Grund>**
>
> Beispiel: Als Nutzer des Bestellsystems muss ich mich anmelden, um alle Trinkgelder korrekt zu erfassen und anschließend auf meine Person zu verbuchen.

### Finder / Verlierer

1. Als Finder möchte ich Fundbüros in meiner Nähe inklusive Öffnungszeiten und Route sehen, damit ich die Fundsache schnell abgeben kann
2. Als Finder möchte ich eine Fundsache anonym ohne direkten Kontakt zum Eigentümer, damit ich meine Privatsphäre schützen kann
3. Als Finder möchte ich nach der Abgabe eine digitale Bestätigung erhalten, damit ich nachweisen kann, wann und wo ich die Fundsache übergeben habe.
4. Als Verlierer möchte ich eine Verlustmeldung erstellen und Fundsachen anhand von Gegenstandsart, Ort, Datum und Foto suchen, damit ich mein verlorenes Eigentum wiederfinden kann.
5. Als Verlierer möchte ich Fundbüros in meiner Nähe inklusive Öffnungszeiten und Route sehen, damit ich Schnell mein Eigentum abholen kann.
6. Als Verlierer und Finder möchte ich die Möglichkeit ein Foto vom verloren gegenstand hochladen so das KI den Gegenstand identifizieren kann
7. Als Verlierer und Finder möchte ich die Möglichkeit auszuwählen ob ich mit die andere Person mich treffen will, oder ob ich das bei ein Fund Büro abgeben/abholen will.
8. Als Verlierer und Finder möchte ich das die App mir ein guten Treffpunkt vorschlägt.
9. Als Verlierer und Finder möchte ich die Möglichkeit, die andere person durch einen Chat zu reden.
10. Als Verlierer und Finder muss ich verpflichtet sein, Wertvolle Gegenstände, Reisepässe, Ausweise, Bankkarten, Geldbörsen, usw. bei einem Fundbüro abzugeben, damit die Identität des berechtigten Eigentümer geprüft wird und Missbrauch, Betrug und Datenschutzrisiken vermieden werden.
11. Als Verlierer will ich benachrichtigt werden, per Notifikation, wenn mein verlorener Gegenstand gefunden ist.
12. Als Finder möchte ich bei der Fundmeldung auswählen, ob ich Finderlohn geltend machen möchte, damit der Verlierer vor einer Rückgabe weiß, ob und in welcher Höhe ein Anspruch besteht.
13. Als Betreiber möchte ich, dass Fotos von Schlüsseln und Dokumenten nicht öffentlich angezeigt oder automatisch unkenntlich gemacht werden, damit niemand Schlüssel nachmachen oder Daten missbrauchen kann.
14. Als Verlierer möchte ich mein Eigentum durch Fragen zu versteckten Merkmalen nachweisen, damit nur ich den Gegenstand bekomme.
15. Als Verlierer möchte ich den Status meiner Meldung sehen (offen / möglicher Treffer / bestätigt / abgeholt), damit ich weiß, wo der Fall steht.
16. Als Verlierer möchte ich meine Verlustmeldung nachträglich bearbeiten oder ergänzen, damit mir später eingefallene Details das Matching verbessern.
17. Als Verlierer und Finder möchte ich das die App KI sagt wenn die Gegenstand Beschreibung
18. Als Verlierer will ich die Möglichkeit per Foto das verlorene Eigentum zu bestätigen bevor einer möglichen Übergabe.
19. Als Finder möchte ich eine Fundmeldung erstellen, auch wenn ich den Gegenstand vor Ort liegen lasse (z. B. ein Fahrrad), damit der Verlierer trotzdem weiß, wo er ist.
20. Als Finder möchte ich erfahren, ob der Gegenstand zurückgegeben wurde, damit ich weiß, dass sich mein Aufwand gelohnt hat.
21. Als Nutzer möchte ich die andere Person melden oder blockieren können, damit ich mich bei Missbrauch schützen kann.
22. Als Nutzer möchte ich meine Daten und Meldungen löschen können, damit meine Daten nicht unnötig gespeichert bleiben (DSGVO).

### Fundbüro

23. Als Fundbüro-Mitarbeiter möchte ich abgegebene Gegenstände in der App erfassen, damit sie ins Matching einfließen.
24. Als Fundbüro-Mitarbeiter möchte ich eine Abholung per QR-Code bestätigen, damit die Übergabe dokumentiert ist und der Finder seine Bestätigung bekommt
25. Als Fundbüro-Mitarbeiter möchte ich, dass Fälle nach Ablauf der Aufbewahrungsfrist markiert werden, damit ich weiß, was mit dem Gegenstand passieren soll.

### Betreiber

26. Als Betreiber möchte ich, dass Fotos von Schlüsseln und Dokumenten nicht öffentlich angezeigt oder automatisch unkenntlich gemacht werden, damit niemand Schlüssel nachmachen oder Daten missbrauchen kann.

---

## Aufgabe 6 – Anwendungsfalldiagramm (30 Minuten)

> Sammeln Sie mit Ihrem Sitznachbarn die Anwendungsfälle und Akteure Ihrer Fallstudie. Gruppieren Sie die Anwendungsfälle innerhalb Ihrer Systemgrenzen und assoziieren Sie die Anwendungsfälle mit den Akteuren und untereinander. Überlegen Sie, ob Anwendungsfälle aufgeteilt, zusammengefasst oder Teile generalisiert werden können. Wenn Sie mehr als 10 Anwendungsfälle gefunden haben, versuchen Sie sich auf die wichtigsten Anwendungsfälle zu konzentrieren. Jeder Kursteilnehmer sollte ein Anwendungsfalldiagramm erstellen, auch wenn Sie sich in der Gruppe absprechen.

Das Anwendungsfalldiagramm „Fundbüro App“ liegt in Textform in der Datei [`anwendungsfalldiagramm.csv`](anwendungsfalldiagramm.csv) (Akteure, Anwendungsfälle, Assoziationen, «include»/«extend»-Beziehungen).

---

## Aufgabe 7 – Anwendungsfall Detaillieren

> Überführen Sie das Szenario anschließend in einen strukturierten Anwendungsfall. Definieren Sie für den Anwendungsfall folgende Aspekte:
>
> - Anwendungsfall-Name
> - Akteur(e)
> - Ziel
> - Vorbedingungen
> - Nachbedingung
> - Hauptablauf
> - Alternativer Ablauf
> - Ausnahmen
> - Beteiligte Systeme

### Anwendungsfall-Name

*(nicht ausgefüllt)*

### Akteur(e)

- Primär: Verlierer (Giovanni)
- Sekundär: KI Dienst, Benachrichtigungsdienst

### Ziel

Der Verlierer will seinen verlorenen Gegenstand einfach melden (am besten in seiner Sprache). Er will das er benachrichtigt wird, sobald der Gegenstand gefunden ist.

### Vorbedingung

1. Der Verlierer verliert seinen Gegenstand
2. Die App wird heruntergeladen und geöffnet
3. Das gerät hat eine Internetverbindung

### Nachbedingung

**Erfolg:** Die Verlustmeldung wird erfolgreich angenommen durch die App, und die Matching Funktion ist Aktiviert. Der Verlierer kann den aktuellen Status seinen verloren Gegenstand ansehen, und wird bei einen match notifiziert. Der Verlierer kann dann entscheiden ob er das bei ein Fundbüro abholen will oder ob er mit den Finder einen Austausch Treffpunkt ausmachen will (via chat).

**Fehlschlag:** Die Verlustmeldung wird nicht aufgenommen und Verlierer wird benachrichtigt.

### Hauptablauf

1. Der Verlierer ladet die app runter oder öffnet die Website.
2. Der Verlierer landet auf die home page, mit 2 Auswahlmöglichkeiten (Ich habe was verloren, ich habe was gefunden) sowie auch Sprache Änderung button.
3. Der Verlierer wählt auf der Startseite die Sprach Italienisch.
4. Der Verlierer wählt "Ich habe was verloren"
5. Der Verlierer gibt name und Telefonnummer ein und wählt "Anruf" als Benachrichtigungsart.
6. Das System legt ein Konto ohne Passwort an und bestätigt die Telefonnummer per Code.
7. Das System öffnet eine Ki chat box, Der Ki fragt "Bitte beschreiben sie was sie verloren haben"
8. Der Verlierer typt eine, Ich habe meine Geldbörse verloren.
9. Der KI Chat-Assistent fragt nach, über details: zbw. Uhrzeit, Farbe, potentieller Ort, und ob der Verlierer möglicherweise ein photo vom verloreren Gegenstand hochladen kann.
10. Die KI erstellt ein Profil des verlorenen Gegenstands und stellt es der Person, die ihn verloren hat, in Form einer Zusammenfassung zur Bestätigung bereit.
11. Nach der Bestätigung teilt die KI dem Nutzer mit, ob eine potenzielle match gefunden wurde oder nicht. Ist dies nicht der Fall, informiert die KI den Nutzer darüber, dass er per Benachrichtigung verständigt wird, sobald eine potenzielle match vorliegt.
12. Wird einen match gefunden, ermittelt die KI (basierend auf dem Gegenstand der unterlegenen Seite sowie der prozentualen Stärke der Übereinstimmung), ob zusätzliche Informationen generiert werden müssen. Dabei werden Faktoren berücksichtigt wie etwa die Anzahl der bereits existierenden ähnlichen Gegenstände, die Objektbeschreibung, das Vorhandensein spezifischer individueller Merkmale sowie die Frage, ob es sich um einen besonders wertvollen Gegenstand handelt.
13. Sobald die KI davon überzeugt ist, dass eine mögliche Übereinstimmung vorliegt, sendet sie ein Foto (falls vorhanden) an die Person, die den Gegenstand verloren hat, mit der Bitte zu bestätigen, ob es sich tatsächlich um ihr verlorenes Eigentum handelt. Der Nutzer kann daraufhin „Ja" oder „Nein" auswählen. Wählt er „Nein", fragt die KI nach, ob er sich sicher sei. Bestätigt der Nutzer, dass es sich nicht um seinen Gegenstand handelt, vermerkt die KI dies entsprechend. Bestätigt er hingegen, dass es sich um seinen Gegenstand handelt, bietet die App dem Finder zwei Möglichkeiten: den Eigentümer zu kontaktieren (sofern sich der Gegenstand noch im Besitz des Finders befindet) oder ihn bei einem Fundbüro abzugeben.
14. Wenn die verlierende Person auf die Chat-Option tippt, öffnet sich ein Chat-Fenster, in dem sie der Person, die den Gegenstand gefunden hat, eine Nachricht schreiben kann, um ein Treffen zur Übergabe zu vereinbaren. Der Treffpunkt lässt sich über eine Karte in der App festlegen; dabei schlägt die App automatisch öffentliche Orte vor, die etwa auf halbem Weg zwischen den jeweiligen Standorten der beiden Beteiligten liegen. Auch hier gilt die Richtlinie der App: Tauscht keine echten Telefonnummern aus und trefft euch ausschließlich an öffentlichen Orten.
15. Nach vereingung. eine übergabestelle, gibt die app eine adresse was einen maps app wie google oder apple maps öffnen kann.
16. Bei der Übergabe vom Gegenstand wird ein QR-Code geönnt, die beiden Parteien gibt eine Bestätigung. Fals die Übergabe beim Fundbüro sich findet, bleibt dieses QR-Code-Konzept das gleiche.

### Alternativer Ablauf

- **5 Alternativ:** Die Person, die den Gegenstand verloren hat, besitzt bereits ein Konto. Sie meldet sich mithilfe ihrer Telefonnummer und eines Verifizierungscodes an.
- **6 Alternativ:** Bei der angegebenen Telefonnummer handelt es sich um einen Festnetzanschluss. Das System verifiziert die Nummer über einen automatisierten Anruf anstelle einer SMS.
- **9 Alternativ:** Die Person, die den Gegenstand verloren hat, kennt weder den genauen Zeitpunkt noch den Ort. Die KI schlägt einen Zeitrahmen vor (z. B. „heute", „gestern") und bietet eine Liste mit Verkehrsmitteln und Routen an (z. B. Straßenbahn 19, Bus 53).
- **9 Alternativ (2):** Die Person, die den Gegenstand verloren hat, verfügt über kein Foto. Die KI stellt gezielte Fragen zu besonderen Merkmalen, wie etwa der Marke, Gebrauchsspuren oder dem Inhalt.
- **10 Alternativ:** Die Zusammenfassung ist fehlerhaft oder unvollständig. Die Person, die den Gegenstand verloren hat, gibt Korrekturen über den Chat ein. Die KI aktualisiert das Profil und zeigt es erneut an.
- **11 Alternativ:** Es wurde keine Übereinstimmung gefunden. Die Verlustmeldung bleibt mit dem Status „offen" aktiv. Die App zeigt zudem (basierend auf den möglichen Verlustorten) Fundbüros in der Nähe an, inklusive deren Öffnungszeiten und Telefonnummern. Sollte später eine Übereinstimmung gefunden werden, wird der Nutzer telefonisch benachrichtigt. Ende des Anwendungsfalls.
- **12 Alternativ:** Es gibt mehrere ähnliche Gegenstände, oder die Übereinstimmung ist nicht eindeutig. Die KI fragt den Nutzer nach spezifischen, weniger offensichtlichen Details und vergleicht die Antworten mit den Angaben der Person, die den Gegenstand gefunden hat. Nur wenn die Antworten übereinstimmen, wird der Prozess mit Schritt 13 fortgesetzt. Andernfalls erfolgt das weitere Vorgehen wie in 11a beschrieben.
- **13 Alternativ:** Der Nutzer wählt Nein aus und bestätigt diese Auswahl. Die KI vermerkt, dass es sich nicht um den gesuchten Gegenstand handelt, und schließt ihn von zukünftigen Ergebnissen aus. Die Verlustmeldung bleibt aktiv. Es liegt kein Foto des gefundenen Gegenstands vor. Die Bestätigung basiert ausschließlich auf den Fragen zu den Erkennungsmerkmalen.
- **13 Alternativ (2):** Es handelt sich um einen sensiblen Gegenstand (z. B. Geldbörse, Ausweis, Bankkarte, Schlüssel oder andere Wertsachen). Die App bietet keine Chat-Funktion und unterstützt keine persönlichen Treffen. Stattdessen wird das Fundbüro angezeigt, bei dem der Gegenstand abgegeben wurde (oder abgegeben werden soll), zusammen mit den jeweiligen Öffnungszeiten.
- **13 Alternativ (3):** Der Finder entscheidet sich, den Gegenstand bei einem Fundbüro abzugeben (oder hat dies bereits getan). Die Person, die den Gegenstand verloren hat, wird benachrichtigt und erhält den Standort des Fundbüros angezeigt.
- **14 Alternativ:** Der Finder reagiert nicht (z. B. innerhalb von 24 Stunden), oder die beiden Parteien können sich nicht auf einen Treffpunkt einigen. Die App schlägt vor, dass der Finder den Gegenstand bei einem nahegelegenen Fundbüro abgibt.
- **14 Alternativ (2):** Die Person, die den Gegenstand verloren hat, ist in ihrer Mobilität eingeschränkt (wie etwa Giovanni). Sie kann einen Treffpunkt vorschlagen, der näher an ihrem eigenen Standort liegt (anstatt eines Treffpunkts auf halbem Weg), oder ein für sie günstig gelegenes Fundbüro angeben.
- **16 Alternativ:** Der QR-Code kann nicht gescannt werden. In diesem Fall kann eine der Parteien einen sechsstelligen Code eingeben, der ebenfalls in der App angezeigt wird.

### Ausnahmen

- **5 Ausnahme:** Die Telefonnummer ist ungültig. Das System zeigt einen Hinweis an und fordert eine erneute Eingabe.
- **7 Ausnahme:** Der KI-Dienst ist nicht erreichbar. Die App wechselt zu einem einfachen Formular mit Kategorie, Beschreibung, Datum und Ort.
- **11 Ausnahme:** Der Benachrichtigungsdienst fällt aus. Der Status ist in der App sichtbar, und das System wiederholt die Benachrichtigung später.
- Der Verlierer bricht ab. Es werden keine Daten gespeichert.

### Beteiligte Systeme

- **Fundbüro-App / Website:** Frontend mit Startseite, Sprachauswahl, Chat-Oberfläche und Statusanzeige
- **Backend mit Datenbank:** speichert Konten, Verlust- und Fundmeldungen sowie Match-Status
- **SMS-/Telefon-Verifizierungsdienst:** bestätigt die Telefonnummer per Code oder automatischem Anruf
- **KI-Chat-Assistent (Sprachmodell):** führt das Gespräch, fragt Details nach und erstellt das Profil des Gegenstands
- **KI-Matching und Bilderkennung:** vergleicht Verlust- und Fundmeldungen, berechnet die Übereinstimmung und wertet Fotos aus
- **Übersetzungs- und Sprachmodul:** zeigt Oberfläche und KI-Antworten auf Italienisch an
- **Benachrichtigungsdienst:** Push, SMS und automatischer Anruf bei einem Match
- **Chat-Dienst:** anonymer Nachrichtenaustausch zwischen Verlierer und Finder, ohne echte Telefonnummern
- **Kartendienst (Google Maps / Apple Maps API):** schlägt öffentliche Treffpunkte vor, zeigt Fundbüros und öffnet die Route
- **QR-Code-Dienst:** erzeugt und prüft den Übergabe-Code
- **Fundbüro-System:** Ansicht für Mitarbeiter, die Abgaben erfassen und Abholungen per QR-Code bestätigen
