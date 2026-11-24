# Übung 5 – Klassendiagramm, Komponentendiagramm und Modell-Review, WS 2026/27

Software Engineering 1 · Prof. Dr. Sebastian Dünnebeil · Hochschule München

Grundlage: veröffentlichtes Übungsblatt 5 (WS 2026/27), Aufgaben 1–4. Die folgenden Aufgaben geben den Inhalt des Übungsblatts wieder. Die allgemeinen Arbeitsregeln stehen in [AGENTS.md](../AGENTS.md); für die Teamarbeit gilt die [Git-Anleitung](git-teamarbeit.md).

**KI-Freigabe:** Erstellen und verfeinern Sie Ihre Modelle in den Aufgaben 1–3 eigenständig. Erst nachdem beide Diagramme vorliegen und in einem eigenen Commit gesichert wurden, ist in Aufgabe 4 das kritische Modell-Review mit `/uml-model-review` freigegeben. Der Agent darf auf Auftrag die Review-Befunde und die Entscheidungen des Teams dokumentieren, aber keine fertigen korrigierten Diagramme erzeugen. Die Freigaben der vorherigen Übungen werden dadurch nicht allgemein erweitert. Eine Implementierung der neuen Modellierungskonzepte in Java ist nicht Gegenstand dieses Übungsblatts.

## Aufgabe 1 – Verfeinern Sie Ihr Klassendiagramm

Überprüfen Sie, ob Sie mit den neu gelernten Konzepten (spezielle Assoziationen, Generalisierung, Schnittstellen) Ihr Design verbessern können. Lassen Sie – wenn angebracht – die Konzepte in folgender Reihenfolge in Ihre Klassendiagramme einfließen:

1. Überprüfen Sie, ob Sie Assoziationen überarbeiten und anpassen können (Navigationsrichtungen, Verwendung von Aggregation, Kompositionen, Assoziationsklassen, qualifizierte bzw. reflexive Assoziationen).
2. Überprüfen Sie, ob Sie Teile Ihres Modells generalisieren können.
3. Entscheiden Sie, ob Sie für die Generalisierung abstrakte Superklassen bilden möchten oder Objekte der Superklasse instanziieren möchten.
4. Definieren Sie Schnittstellen, die ausgewählte Klassen realisieren sollen. Versehen Sie die Schnittstellen mit Methoden und zeichnen Sie Realisierung und Nutzung ein.

## Aufgabe 2 – Erstellen Sie ein Komponentendiagramm

Identifizieren und benennen Sie wichtige Komponenten, aus denen Ihre Anwendung bestehen soll. Sie können auch extern entwickelte Komponenten einbinden (z. B. einen Zahlungsdienstleister). Zeichnen Sie ein vorläufiges UML-Komponentendiagramm.

1. Bilden Sie aus Ihrem Klassendiagramm eine oder mehrere Komponenten.
2. Fügen Sie Komponenten hinzu, die bisher nicht im Klassendiagramm vorhanden sind.
3. Binden Sie die Klassen Ihres Klassendiagramms in die gebildeten Komponenten ein (es genügt, wenn Sie die Klassen beispielsweise in einer Tabelle den Komponenten zuordnen).
4. Definieren Sie zusätzliche Komponenten, die Sie für ein funktionsfähiges System benötigen könnten, und versehen Sie diese mit passenden Stereotypen.

## Aufgabe 3 – Definieren Sie die Schnittstellen der Komponenten

Definieren Sie, über welche Schnittstellen Ihre Komponenten miteinander interagieren sollen. Verwenden Sie zu diesem Zweck einen Bauteil-Konnektor (Ball-and-Socket-Symbol).

1. Fügen Sie zuerst alle Schnittstellen ein, die Ihre Komponenten **benötigen**.
2. Fügen Sie dann die Schnittstellen hinzu, die von den Komponenten realisiert bzw. **bereitgestellt** werden.
3. Verbinden Sie die Bauteil-Konnektoren Ihrer Komponenten und fügen Sie – wenn nötig – Delegationskonnektoren ein.

## Aufgabe 4 – Überprüfen Sie die UML-Modelle mit dem Modell-Review-Skill

Sie haben Ihr Klassendiagramm um neue Konzepte der Objektorientierung erweitert und ein Komponentendiagramm mit Schnittstellen erstellt. Überprüfen Sie nun Ihre Modelle mit Unterstützung eines KI-basierten Review-Skills.

Ziel ist es, mögliche Modellierungsfehler und Missverständnisse zu erkennen, offene Entwurfsentscheidungen zu diskutieren und Ihre Entscheidungen nachvollziehbar zu dokumentieren.

1. **Modelle bereitstellen:** Stellen Sie sicher, dass Ihr erweitertes Klassendiagramm und Ihr Komponentendiagramm als gut lesbare Bilddateien in Ihrem GitHub-Team-Repository vorliegen. Beide Diagramme müssen bereits vor dem KI-Review in einem eigenen Commit gesichert worden sein.
2. **Modell-Review starten:** Starten Sie Copilot im Terminal Ihrer Entwicklungsumgebung. Rufen Sie den neuen Skill `/uml-model-review` auf und geben Sie die beiden Diagramme an. Der Agent überprüft ausgewählte Aspekte der UML-Notation und die fachliche Konsistenz der Modelle. Er stellt Ihnen höchstens drei konkrete Fragen pro Runde.
3. **Fragen beantworten:** Diskutieren Sie die Fragen gemeinsam im Team. Überlegen Sie insbesondere:
  - Ist die modellierte Vererbung fachlich sinnvoll und korrekt dargestellt?
  - Sind die Verantwortlichkeiten der Klassen und Komponenten nachvollziehbar?
  - Sind die bereitgestellten und benötigten Schnittstellen richtig zugeordnet?
  - Passen Klassen- und Komponentendiagramm zueinander und zu Ihrem Anwendungsfall?
4. **Erkenntnisse dokumentieren:** Lassen Sie die Fragen und Review-Befunde in einem Reviewdokument festhalten. Dokumentieren Sie zu mindestens drei besprochenen Punkten Ihre Antwort, die getroffene Entscheidung und eine kurze Begründung. Unterscheiden Sie dabei zwischen tatsächlichen Modellierungsproblemen, möglichen fachlichen Missverständnissen, offenen Entscheidungen und begründbaren Alternativen.
5. **Modelle gegebenenfalls verbessern:** Entscheiden Sie selbst, ob Ihre Diagramme angepasst werden müssen. Halten Sie fest, welche Vorschläge Sie übernommen oder bewusst verworfen haben und warum. Speichern Sie das Reviewdokument und gegebenenfalls überarbeitete Diagramme in einem weiteren Commit in Ihrem Team-Repository.

**Wichtig:** Der Agent soll Ihre Modelle kritisch hinterfragen, aber keine fertigen, korrigierten Diagramme erzeugen. Nicht jede Abweichung von einem KI-Vorschlag ist ein Fehler. Die fachlichen Entscheidungen treffen Sie selbst.

## Abgabe

Erweitertes Klassendiagramm, Komponentendiagramm und Reviewdokument im Team-Repository. Die ursprünglichen Modelle und die späteren Änderungen müssen anhand der Git-Historie nachvollziehbar bleiben.

---

## Empfohlene Durchführung im Repository

Die folgenden Pfade, Befehle und die Berichtstruktur sind organisatorische Empfehlungen zur Umsetzung des veröffentlichten Übungsblatts, keine zusätzlichen fachlichen Abgabeanforderungen. Sie setzen voraus, dass der Kurs den neuen Skill und die zugehörigen Freigaben bereitgestellt hat.

### Arbeitsstand und Ablage

Übernehmen Sie die aktualisierte Lehrvorlage gemäß [Git-Teamarbeit](git-teamarbeit.md) und verwenden Sie für diese Übung beispielsweise `uebung-05-team` als gemeinsamen Übungsbranch. Bewahren Sie das ursprüngliche Klassendiagramm und gegebenenfalls das Ist-Diagramm aus Übung 4 unverändert auf. Für das neue Modell bietet sich ein eigener Ordner an:

```text
docs/05-komponentenmodell/
  klassendiagramm.png
  komponentendiagramm.png
  klassen-zu-komponenten.md   # falls Zuordnung separat dokumentiert wird
  modell-review.md           # entsteht erst im Review
```

Andere eindeutige Dateinamen und gut lesbare Bildformate sind möglich. Wenn Sie die Zuordnung der Klassen zu Komponenten in einer separaten Tabelle dokumentieren, stellen Sie diese für den Review ebenfalls bereit. Nutzen Sie den für die Modelle relevanten eigenen Anwendungsfall als fachliche Referenz. Die bestehende Java-Demo aus Übung 4 muss für diese Modellierungsaufgabe nicht angepasst werden.

### Vor dem KI-Review

Prüfen Sie die Bilder selbst auf Lesbarkeit (insbesondere Namen, Methoden, Beziehungen, Multiplizitäten und Schnittstellensymbole). Sichern Sie die fertigen eigenen Modelle gemeinsam in einem Commit. Beispiel im normalen IDE-Terminal für den oben empfohlenen Ordner und Branch:

```bash
git status
git add docs/05-komponentenmodell/klassendiagramm.png docs/05-komponentenmodell/komponentendiagramm.png
# Falls vorhanden: auch die eigene Zuordnungstabelle gezielt mit git add vormerken.
git diff --cached --stat
git commit -m "Eigene UML-Modelle fuer Uebung 5"
git push origin uebung-05-team
```

Prüfen Sie vor dem Commit sämtliche vorgemerkten Dateien und vor dem Push das Teamziel. Bei anderen Dateinamen oder Branches passen Sie die Befehle an. Bei Git-Fehlern stoppen und technische Hilfe holen. Ein Commit dokumentiert den Stand, nicht die Urheberschaft.

### Modell-Review mit Copilot

Starten Sie eine neue Copilot-Sitzung im Team-Repository. Beispielauftrag, sofern der Skill installiert und erkannt wird:

```text
/uml-model-review
Prüfe unsere selbst erstellten und vor dem Review committeten Diagramme:
@docs/05-komponentenmodell/klassendiagramm.png
@docs/05-komponentenmodell/komponentendiagramm.png
Stelle uns höchstens drei konkrete Fragen pro Runde.
Beziehe bei Bedarf unseren relevanten Anwendungsfall und unsere
separate Klassenzuordnung ein (wir geben dir die jeweiligen Pfade).
Halte die Fragen, Befunde und unsere Entscheidungen auf unseren Auftrag
in docs/05-komponentenmodell/modell-review.md fest.
Erzeuge oder korrigiere keine Diagramme und ändere keinen Code.
```

Kontrollieren Sie, dass Copilot tatsächlich beide Bilder als Bildanlagen erkennt und lesen kann. Ein Dateipfad allein garantiert keine Bildverarbeitung. Bei fehlendem Bildzugriff oder nicht erkanntem Skill holen Sie technische Hilfe. Der Agent soll keine unlesbaren Symbole oder fehlenden fachlichen Informationen erraten. Diskutieren Sie die Fragen im Team, bevor die nächste Runde beginnt.

### Review dokumentieren

Eine mögliche knappe Struktur für das Reviewdokument:

- Prüfgrundlage: Diagrammpfade, Ausgangscommit, gegebenenfalls Zuordnungstabelle und Anwendungsfall.
- Grenzen: unlesbare Stellen, fehlender Kontext oder nicht geprüfte Aspekte.

| ID | Modellstelle / Quelle | Befund und Kategorie | Reviewfrage | Antwort des Teams | Entscheidung und Begründung | Umgang mit Vorschlag / Änderung |
|---|---|---|---|---|---|---|
| R-01 | | | | | | |
| R-02 | | | | | | |
| R-03 | | | | | | |

Kategorien gemäß Aufgabenblatt: tatsächliches Modellierungsproblem, mögliches fachliches Missverständnis, offene Entscheidung, begründbare Alternative. Die Antwort, Entscheidung und Begründung stammen vom Team; offene Punkte bleiben als offen erkennbar. Auch eine begründete Entscheidung gegen eine Änderung ist ein gültiges Ergebnis.

### Nach dem Review

Überarbeiten Sie Ihre Diagramme bei Bedarf selbst. Sichern Sie das Reviewdokument und gegebenenfalls die Änderungen in einem weiteren Commit. Verwenden Sie den üblichen Pull-Request- und Team-Review-Ablauf der [Git-Anleitung](git-teamarbeit.md). Wählen Sie eine Merge-Art, die die getrennten Modell- und Review-Commits erhält (kein Squash-Merge). Copilot führt keinen Commit, Push oder Merge automatisch aus.
