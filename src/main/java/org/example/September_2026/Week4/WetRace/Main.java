package org.example.September_2026.Week4.WetRace;

public class Main {

//    Aufgabe Wettrennen
//    Für die Simulation eines Wettrennens sollen verschiedene Fahrzeugarten objektorientiert modelliert werden.
//    Da alle Fahrzeugtypen gemeinsame Eigenschaften haben, definieren wir uns zunächst eine Basisklasse Fahrzeug,
//    die als Oberklasse für die anderen Klassen dienen soll. Ein Fahrzeug hat folgende allgemeinen Merkmale:
//
//    Seine aktuelle Position (in km und der Einfachheit halber in nur einer Dimension)
//    Seine aktuelle Geschwindigkeit (in km/h)
//    Es kann bewegt werden (Methode bewege). Die Methode wird mit einem double-Parameter aufgerufen, der die Anzahl der Minuten angibt,
//    die sich das Fahrzeug mit der aktuellen Geschwindigkeit vorwärts bewegt. Der Methodenaufruf ändert natürlich die Position des Fahrzeugs,
//    wenn es mit einer von 0 verschiedenen Geschwindigkeit bewegt wird.
//    Man kann seine Geschwindigkeit setzen (Methode setzeGeschwindigkeit). Die Geschwindigkeit darf die Maximalgeschwindigkeit nicht überschreiten,
//    eine korrekte Ausführung sollte protokolliert werden.
//    Es kann seine Maximalgeschwindigkeit angeben (Methode getMaxGeschwindigkeit). Für ein Objekt der Klasse Fahrzeug soll die Maximalgeschwindigkeit 0 sein.
//    Es kann die Anzahl seiner Räder angeben.
//
//    Nun sollen einige konkrete Fahrzeuge definiert werden, indem entsprechende Klassen von Fahrzeug abgeleitet werden:
//
//    Ein Fahrrad ist ein Fahrzeug mit 2 Rädern und Maximalgeschwindigkeit 30 km/h.
//    Ein Auto ist ein Fahrzeug mit 4 Rädern und Maximalgeschwindigkeit 140 km/h.
//    Ein Rennwagen ist ein Auto mit Maximalgeschwindigkeit 220 km/h.
//    Ein Krankenwagen ist ein Auto mit einem zusätzlichen Blaulicht, das ein- oder ausgeschaltet sein kann (neues Attribut!).
//    Außerdem muss der Krankenwagen Methoden zum Ein- bzw. Ausschalten des Blaulichts anbieten.
//
//    Definieren Sie diese Klassen und nutzen Sie dabei so weit wie möglich die Vererbung von Eigenschaften aus!
//
//    Nun soll die eigentliche Simulation des Wettrennens in einer Klasse Wettrennen geschrieben werden. Erzeugen sie je ein Fahrzeug und setzen Sie dann die Geschwindigkeiten auf:
//
//    Fahrrad 20 km/h
//    Auto 150 km/h
//    Rennwagen 200 km/h
//    Krankenwagen 80 km/h
//
//    Dann sollen sich die Fahrzeuge bewegen. Der Gerechtigkeit halber geben wir dem Fahrrad einen Vorsprung von 4 Stunden.
//    Danach lassen Sie alle Fahrzeuge eine Stunde lang mit unveränderter Geschwindigkeit vorwärts fahren. Was fällt Ihnen beim Auto auf?
}
