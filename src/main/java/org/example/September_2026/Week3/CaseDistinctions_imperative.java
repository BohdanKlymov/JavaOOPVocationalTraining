package org.example.September_2026.Week3;
import java.util.Scanner;

public class CaseDistinctions_imperative {

//    Aufgabe 2: Fallunterscheidungen (20 Punkte).
//    Der Dortmunder Tierpark hat beschlossen, ein Programm schreiben zu lassen, das Besuchern
//    Auskünfte über die im Zoo vorhandenen Tiere geben kann. Die Implementierung übernimmt
//    das Startup symmediaAzubis, welches aus Auszubildene der Fachinformatik-Anwendungsentwicklung der symmedia GmbH besteht, die
//    gerade ihre ersten Java-Kenntnisse erworben haben. In der ersten Ausbaustufe gibt ihre Implementierung zu einem Tier lediglich einige elementare Eigenschaften aus. Wird das Programm
//    mit dem Parameter „Spinne“ aufgerufen, lautet die Ausgabe
//
//8 Beine
//    flugfähig: nein
//    hat Federn: nein
//    gefährlich für Menschen: eventuell
//
//    In seiner Implementierung benutzt das Team Fallunterscheidungen.
//            a) Schreiben Sie ein solches Programm, wie es das Team getan
//                  hat. Es sollte für insgesamt 10 verschiedene Tiere Auskunft über die obigen vier Eigenschaften liefern können. Die 10 Tie sind die oben beschriebene Spinne und 9 weitere frei wählbare.
//                  Achtung: Bei dieser Aufgabe geht es noch nicht um objektorientierte Programmierung, sondern um Java-Grundlagen. Lösen Sie die Aufgabe daher rein imperativ mit nur einer Klasse,
//                  in deren main-Methode sich das komplette Programm befindet.
//            b) Halten Sie das Vorgehen für praxistauglich? Wo sehen Sie Fehlerquellen?
//                  (Eine Lösung zur Vermeidung dieser Fehlerquellen brauchen Sie nicht benennen. Diese werden Sie später im Kurs kennenlernen. Wenn Sie möchten, können Sie natürlich auch jetzt schon darüber nachdenken.)
//            c) schreiben Sie eine alternative Lösung, in der die Klasse Tier implementiert und verwendet wird. Male auch das Klassendiagramm zu der Klasse Tier auf Papier.

    public static void main(String[] args) {

        System.out.println("You can choose an animal:");
        System.out.println("1. Spider, 2. Owl, 3. Snake, 4. Frog, 5. Octopus, 6. Wallaby, 7. Seal, 8. Shark, 9. Tiger, 10. Gorilla");
        System.out.print("Print the number to see more information: ");

        Scanner scanner = new Scanner(System.in);
        int animalNum = scanner.nextInt();

        switch (animalNum) {
            case 1:
                System.out.println("Legs: " + 8);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + "eventual");
                break;

            case 2:
                System.out.println("Legs: " + 2);
                System.out.println("airworthy: " + true);
                System.out.println("hasFeathers: " + true);
                System.out.println("isDangerousForPeople: " + false);
                break;

            case 3:
                System.out.println("Legs: " + 0);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + "eventual");
                break;

            case 4:
                System.out.println("Legs: " + 4);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + false);
                break;

            case 5:
                System.out.println("Legs: " + 8);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + "eventual");
                break;

            case 6:
                System.out.println("Legs: " + 2);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + false);
                break;

            case 7:
                System.out.println("Legs: " + 0);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + false);
                break;

            case 8:
                System.out.println("Legs: " + 0);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + true);
                break;

            case 9:
                System.out.println("Legs: " + 4);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + true);
                break;

            case 10:
                System.out.println("Legs: " + 4);
                System.out.println("airworthy: " + false);
                System.out.println("hasFeathers: " + false);
                System.out.println("isDangerousForPeople: " + "eventual");
                break;
        }
        scanner.close();
    }
}
