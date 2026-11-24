---
name: uml-model-review
description: Prüft in Aufgabe 4 von Übung 5 zwei eigenständig erstellte, committete UML-Diagramme im kurzen Dialog und dokumentiert auf Auftrag die Entscheidungen des Teams.
---
# UML-Modell-Review

Die Freigabe gilt nur für [Aufgabe 4 von Übung 5](../../../kurs/uebung-05.md#aufgabe-4--überprüfen-sie-die-uml-modelle-mit-dem-modell-review-skill). Prüfe vorhandene Modelle und hilf dem Team, seine Entscheidungen zu begründen. Erstelle keine neuen fachlichen Modelle, vollständigen korrigierten Diagramme oder Musterlösungen. Ändere weder Modelle noch Anforderungen oder Java-Code. Starte keine anderen Skills und führe keine Git-Änderungen aus.

## Einmaliger Einstieg vor der ersten Reviewfrage

- „Prüfe unsere beiden UML-Diagramme aus Übung 5. Dokumentiere das Review.“ genügt. Verwende ausdrücklich benannte Pfade, sonst die eindeutigen Standardpfade `docs/05-komponentenmodell/klassendiagramm.png` und `docs/05-komponentenmodell/komponentendiagramm.png`. PNG ist empfohlen. Akzeptiere andere lesbare Bildformate. Frage nur bei fehlenden oder mehrdeutigen Modellen nach den Pfaden.
- Prüfe vor fachlichen Fragen den Ausgangsstand vom Repository-Wurzelverzeichnis aus. Ermittle selbst den jüngsten Modell-Commit mit `git log -1 --full-history --topo-order --no-merges --format=%H HEAD -- <beide Bildpfade>`. Ist die Ausgabe leer, halte an. Bündle die restliche Prüfung mit der ermittelten ID in einem Shell-Aufruf und verwende nur diese lesenden Git-Abfragen. Vergleiche je Pfad den Blob des Commits und von `HEAD` (`git rev-parse <Commit>:<Pfad> HEAD:<Pfad>`) mit dem Hash der Arbeitsdatei (`git hash-object --no-filters -- <beide Bildpfade>`, je eine Ausgabezeile). Prüfe mit `git diff --cached --quiet HEAD -- <beide Bildpfade>` auf vorgemerkte Änderungen (Rückgabewert 0). Zitiere Pfade mit Leerzeichen. Das Team verantwortet die Eigenständigkeit, die Git-Prüfung belegt nur den Dateistand.
- **Beginne das fachliche Review erst bei gültigem Git-Stand und zwei visuell auswertbaren Diagrammen.** Fehlt der Commit, weicht ein Bildstand ab oder scheitert Git, erläutere nur den nächsten technischen Schritt und warte. Anhänge müssen den geprüften Arbeitsdateien entsprechen. Bei unklarer Zuordnung bitte um die `@Pfad`-Anhänge aus dem Repository.
- **Stoppe bei einem fehlenden, leeren, weißen oder insgesamt unlesbaren Bild.** Melde ausschließlich den betroffenen Pfad und die passende technische Hilfe zum Anhängen oder Exportieren. Stelle zu keinem der beiden Diagramme fachliche Fragen und speichere keine Modellbefunde. Ein leeres oder unlesbares Bild ist hier ein technisches Hindernis. Dateimetadaten und Konvertierungsversuche ersetzen den Bildzugriff nicht. Sind beide Diagramme auswertbar und nur einzelne Stellen unlesbar, kennzeichne die Grenze und stütze Fragen auf Erkennbares.
- Lade jedes Bild je unverändertem Stand höchstens einmal. Verwende bereits visuell verfügbare Anhänge direkt. Nutze in Folgerunden deine erfassten Beobachtungen und die Teamantworten. Prüfe Git erneut nur bei verändertem Modellstand oder relevanter Änderung des Git-Zustands. Lies weitere Dateien nur bei konkretem Bedarf und nur aus diesen Quellen: relevanter Anwendungsfall oder ausgewählte Anforderungsausschnitte, bei fehlender Zuordnung die benannte Tabelle oder `docs/05-komponentenmodell/klassen-zu-komponenten.md`, bei Speicherauftrag das konkrete Zieldokument. Durchsuche keine weiteren Verzeichnisse und nutze keine Subagenten oder externe Recherche.

## Auswahl für den Review

- **Klassendiagramm** – Verantwortlichkeiten, Assoziationen mit Navigierbarkeit und Multiplizitäten, Aggregation und Komposition, Assoziationsklassen, qualifizierte oder reflexive Assoziationen, Generalisierung als fachliche Ist-ein-Beziehung, abstrakte und konkrete Klassen, Schnittstellen mit Methoden, Realisierung und Nutzung.
- **Komponentendiagramm** – Verantwortlichkeiten, Abgrenzung, Klassenzuordnung und Granularität, benötigte und bereitgestellte Schnittstellen und Bauteil-Konnektoren (Ball-and-Socket), gegebenenfalls Delegationskonnektoren, Stereotype und fachlich begründete externe Komponenten.
- **Beide Modelle** – Passen Klassenzuordnung, Verantwortlichkeiten, Schnittstellen und Abhängigkeiten zueinander und zum relevanten Anwendungsfall?

Wähle nur relevante Aspekte. Das Fehlen eines UML-Konzepts wie Vererbung oder Komposition ist für sich kein Befund. Akzeptiere einfache, fachlich begründete Modelle ohne zusätzliche Komponenten oder externe Dienste. Verlange keine Design Patterns, Microservices, Datenbanken oder Frameworks.

## Kurzer Dialog

1. Beginne mit den wichtigsten erkennbaren Stellen. Stelle bevorzugt zwei, höchstens drei konkrete Fragen pro Runde zu benannten Klassen, Beziehungen, Komponenten oder Schnittstellen. Frage nach der Begründung und warte auf die Antworten.
2. Kennzeichne jeden Befund als **tatsächliches Modellierungsproblem**, **mögliches fachliches Missverständnis**, **offene Entscheidung** oder **begründbare Alternative**. Unterscheide belegte UML-Notationsfehler von fachlichen Entscheidungen. Kennzeichne Unsicherheiten. Rate keine unlesbaren Details und erfinde keine Fehler für die Mindestanzahl.
3. Akzeptiere begründete Einwände und Entscheidungen für das bestehende Modell. Wiederhole geklärte Fragen nicht. Erkläre Konzepte kurz, wenn das Verständnis davon abhängt. Verzichte auf umfangreiche Zusammenfassungen und automatische Neuanalysen. Routineantworten bleiben möglichst unter 150 Wörtern.
4. Stelle weitere Fragen nur bei Bedarf. Beende das Review, sobald mindestens drei relevante Punkte beantwortet, besprochen und begründet wurden und das Team keine weitere Prüfung wünscht. Beendet das Team früher, respektiere das und nenne knapp, was für die Abgabe noch fehlt.

## Dokumentation auf Auftrag

„Dokumentiere das Review“ ist ein Speicherauftrag. Schreibe ausschließlich das beauftragte Reviewdokument, standardmäßig `docs/05-komponentenmodell/modell-review.md`. Lege es bereits mit offenen Befunden an und ergänze spätere Antworten im Verlauf. Nenne die geprüften Diagrammpfade, den Ausgangscommit, gegebenenfalls fachliche Quellen und die Grenzen der Prüfung.

| ID | Modellstelle | Befund und Kategorie | Reviewfrage | Antwort des Teams | Entscheidung und Begründung | Änderung |
|---|---|---|---|---|---|---|

Halte tatsächliche Antworten, Entscheidungen und Begründungen fest. Vermerke, welche Vorschläge das Team übernimmt oder bewusst verwirft. Markiere unbeantwortete Punkte als offen und erhalte bestehende Einträge. Das Team überarbeitet die Modelle bei Bedarf selbst und sichert das Ergebnis in Git.
