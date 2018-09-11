# Einfache Latexvorlage

Dieses Projekt ist eine einfache Latexvorlage für Projekte wie z.B. Seminararbeiten.

```
│   bibliography.bib - Literaturverzeichnis
│   seminararbeit.tex - Root-Datei (hier werden weitere Kapitel eingefügt)
│
├───additionals - Ordner für "Nicht-Inhalt"-Teile der Arbeit
│       abstract.tex - Text des Abstracts
│       acronyms.tex - Sammlung von Abkürzungen (& Abkürzungsverzeichnis)
│       deckblatt.tex - Deckblatt mit Titel & Co.
│       erklaerung.tex - Selbstständigkeitserklärung
│       simpleTitle.tex - Kurzer Titel (gemeinsam mit dem ersten Kapitel)
│       sperrvermerk.tex - Sperrvermerk
│
├───assets - Ordner für Zusätzliche Dateien
│   ├───img - Bilder
│   │       casLogo.jpg
│   │       placeholder.png
│   │
│   └───listings - Quellcode
│           hello-world.java
│           quicksort.py
│
├───content - Eigentlicher Inhalt
│       01_Einleitung.tex
│       02_Kapitel.tex
│       03_Fazit.tex
│
└───settings - Einstellungen
        basicPackages.tex - Grundlegende Pakete
        graphics.tex - Bilder und andere Grafiken
        metadata.tex - Metadaten (z.B. Autor, Titel, Datum)
        preamble.tex - Latex-Preambel (wird in seminararbeit.tex importiert)
        text.tex - Texteinstellungen, Farben, ...
        tools.tex - Hilfreiche Tools
        verzeichnisse.tex - Einstellungen für Literaur- & Abkürzungsverzeichnis
```