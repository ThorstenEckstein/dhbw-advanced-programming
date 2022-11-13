<!-- +-----------------------------------------------------------------------+ -->
<!-- |                                                                       | -->
<!-- | Hochschule        : Duale Hochschule BaWü (Mannheim)                  | -->
<!-- | Fachbereich       : Studienbereich Wirtschaft, Wirtschaftsinformatik, | -->
<!-- |                     Appl. Management                                  | -->
<!-- | Lehrveranstaltung : Programmierung II (W3WI_109)                      | -->
<!-- | Lehrform          : Vorlesung, Übung, Laborübung, Case Study          | -->
<!-- | Prüfungsleistung  : Klausur oder Portfolio                            | -->
<!-- | Autor             : Thorsten Eckstein                                 | -->
<!-- |                                                                       | -->
<!-- | Lehrinhalte (Pflicht)                                                 | -->
<!-- |   Fortgeschrittene objektorientierte Konzepte: Generische Interfaces  | -->
<!-- |   und Klassen, Nutzung der Klassenbibliothek. Aufbau grafischer Ober- | -->
<!-- |   flächen: Layout, typische Komponenten für grafische Benutzungs-     | -->
<!-- |   schnittstellen, Ereignisbehandlung. Fortgeschrittene Programmier-   | -->
<!-- |   methodik: Parallele Programmierung mit Threads, Synchronisations- & | -->  
<!-- |   Kommunikationskonzepte, Ein- und Ausgabe über Streams.              | -->
<!-- |                                                                       | -->
<!-- | Lehrinhalte (Kür) - Über die Pflicht hinaus:                          | -->
<!-- |   - Design Prinzipien & Design Patterns                               | -->
<!-- |   - Code Qualität                                                     | -->
<!-- |   - TDD, JUnit & Mockito                                              | -->
<!-- |                                                                       | -->
<!-- |                 Woche   KW       Mo    -    So                        | -->
<!-- |                   1     07    13.02.23 - 19.02.23                     | -->
<!-- |                   2     08    20.02.23 - 26.02.23                     | -->
<!-- |                   3     09    27.02.23 - 05.03.23                     | -->
<!-- |                   4     10    06.03.23 - 12.03.23                     | -->
<!-- |                   5     11    13.03.23 - 19.03.23                     | -->
<!-- |                   6     12    20.03.23 - 26.03.23                     | -->
<!-- |                   7     13    27.03.23 - 02.04.23                     | -->
<!-- |                   8     14    03.04.23 - 09.04.23 (6.-10. Ostern)     | -->
<!-- |                   9     15    10.04.23 - 16.04.23                     | -->
<!-- |                   10    16    17.04.23 - 23.04.23                     | -->
<!-- |                   11    17    24.04.23 - 30.04.23                     | -->
<!-- |                   12    18    01.05.23 - 07.05.23                     | -->
<!-- |                                                                       | -->
<!-- +-----------------------------------------------------------------------+ -->


# Lehrkonzept Programmierung II

> Titel   : Programmierung II 

> Kontext : Zugüberwachung & -disposition im Störungsfall

**Inhalt**
```
  Woche 1  - Technisches & Fachliches Setup
  Woche 2  - Basics 1/2
  Woche 3  - Basics 2/2
  Woche 4  - Generics, Streaming & Funktionale Programmierung
  Woche 5  - Parallele Programmierung
  Woche 6  - Kommunikationskonzepte
  Woche 7  - Exceptions, Code Dokumentation
  Woche 8  - Datenbank & Persistenz
  Woche 9  - Java 17+ Neuere Programmierkonzepte
  Woche 10 - Clean Code 1/2
  Woche 11 - Clean Code 2/2
  Woche 12 - Prüfunsvorbereitung
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 1 - Technisches & Fachliches Setup

**Allgemeine Inhalte**
 * IDE, Git, Java (Installation, Nutzung, etc. ...)
 * Setup: Test-Driven-Development
 * Setup: Unit-Tests

**Fachlicher Kontext**
```
Vorbereitung: Darstellung des fachlichen Kontextes

 + Überwachungssystem in der Betriebsleitung
 + Zug, Triebfahrzeug (Tbf), Wagons (Spezialisierung Flügelzug)
 + Streckennetz
 + Störung, Weichenausfall, Abfahrt, Ankunft (z.B. verspätete Ankunft im Bahnhof)
 + Dispositionsmaßnahme, Umleitung
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 2 - Basics 1/2

**Allgemeine Inhalte**
 * Objekte & Klassen
 * Vererbung & Implementierung (Interfaces)
 * Abstrakte Klassen
 * Objektvertrag (hashCode, equals)

**Fachlicher Kontext**
```
 + Klassen erzeugen
 + Zug, Triebfahrzeug (Tbf), Wagons (Spezialisierung Flügelzug)
 + Strecke, Topologie (Streckennnetz)
 + Störung, Weichenausfall, Abfahrt, Ankunft (z.B. verspätete Ankunft im Bahnhof)
 + Dispositionsmaßnahme, Umleitung
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 3 - Basics 2/2

**Allgemeine Inhalte**
 * Sichtbarkeiten von Klassen, Members, Methoden, Modifier
 * Beziehungsarten (Besitz, Aufruf, Vererbung, ...) Aggregation vs. Komposition
 * Collections API

**Fachlicher Kontext**
```
 + Zug 1:n Wagon (besteht aus)
 + Zug 1:n Tbf
 + Flügel 2:1 Zug
 + Streckennetz 1:m Strecken
 + Strecke n:m Abschnitte
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 4 - Generics, Streaming & Funktionale Programmierung

**Allgemeine Inhalte**
 * Generics
 * Streaming API
 * Funktionale Programmierung mit Lambda-Ausdrücken

**Fachlicher Kontext**
```
 + ?
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 5 - Parallele Programmierung

**Allgemeine Inhalte**
 * Thread
 * Runnable
 * Enumerations

**Fachlicher Kontext**
```
 + Viele Züge fahren gleichzeitig im Streckennetz
 + parallele Überwachung fahrender Züge
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 6 - Kommunikationskonzepte

**Allgemeine Inhalte**
 * Beziehungsarten (Call, Inheritance, ...)
 * synchron vs. asynchron
 * synchron
   * Method Calls
   * REST (SOAP?)
   * RMI
 * asynchron
   * publish/subscribe
   * fire & forget

**Fachlicher Kontext**
```
 to be done
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 8 - Exceptions, Code Dokumentation

**Allgemeine Inhalte**

**Fachlicher Kontext**
```
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 8 - Datenbank & Persistenz

**Allgemeine Inhalte**
 * SQL vs. NoSQL Datenbanken
 * ORM Objektrelationales Mapping
 * Unit-Tests gegen In-Memory-Datenbank (H2)

**Fachlicher Kontext**
```
 + Speichern vom fachlichen Objektmodell (s.o.) in Datenbank
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 9 - Java 17+ Neuere Programmierkonzepte

**Allgemeine Inhalte**

**Fachlicher Kontext**
```
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 10 - Clean Code 1/2

**Allgemeine Inhalte**
 * OOP Best Practices
 * Design Prinzipien

**Fachlicher Kontext**
```
 to be done
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 11 - Clean Code 2/2

**Allgemeine Inhalte**
 * Design Patterns
 * Refactoring

**Fachlicher Kontext**:
```
 to be done
```


<!-- +----------------------------------------------------------------------+ -->
<!-- |                                                                      | -->
<!-- +----------------------------------------------------------------------+ -->
## Woche 12 - Prüfungsvorbereitung

**Allgemeine Inhalte**

**Fachlicher Kontext**
```
```


<!-- +----------------------------------------------------------------------+ -->
<!-- | ARCHIV :: SPÄTER ENTFERNEN                                           | -->
<!-- +----------------------------------------------------------------------+ -->

# Inhaltsbeispiele anderer Lehrveranstaltungen

## javatraining.de

> https://javatraining.de/schulungen/java-advanced/

**Inhalt**: Grundlagen der Java 8, d.h. Datentypen, Operatoren, Control Statements, Classes, sowie Vererbung, Interfaces und Exceptions. Tiefergreifend Mutithreaded Programming, Enumerations, Autoboxing und Annotations, I/O sowie Generis, Lambda Expressions, Collections und Networking, Stream API, Regular Expressions, Syntaxänderungen in Java 9-17, Datenbankzugriff mit Hibernate und JPA behandelt.

## it-schulungen.com

> https://www.it-schulungen.com/seminare/softwareentwicklung/java/java-fortgeschrittene-programmiertech.html

**Fortgeschrittene Themen der Sprache Java**: Generics, Reguläre Ausdrücke, Flexible Parameterlisten mit varargs, Annotationen, Enumerations, Datenbankprogrammierung, Funktionale Programmierung mit Lambda-Ausdrücken, Entwicklung mit Tools optimieren

**Code-Qualität**: Code-Qualität steigern, Guter und Schlechter Code, Projektaufbau, das Fundament muss passen, Statische Codeanalyse ins Projekt einbinden

**Code Prinzipien**: OOP Best Practices oder einfach nur das Grundwerkzeug eines Entwicklers, Design Prinzipien, Design Patterns, Domain Driven Design (DDD), Refactoring, Exception Handling, Exceptions in Java SE, Die verschiedenen Strategien, Eigene Exception-Hierarchie oder bestehende Exceptions verwenden, Wann verwende ich Checked- und wann Unchecked-Exceptions, Logging

**Performance**: maximieren, Was ist Performance?, Toolbasiertes Stressen und Messen, Manuell messen, Einflussfaktoren auf die Performance, Effiziente Programmiertechniken, Performance Benchmarks

**Tests**: Wozu Tests? Saubere und schnelle Tests mit JUnit und Mockito, Testautomatisierung