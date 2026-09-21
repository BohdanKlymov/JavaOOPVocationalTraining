package org.example.September_2026.Week3.SnakeGame;

import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

public class Main {

//    Implementiere das in https://openbook.rheinwerk-verlag.de/javainsel/03_005.html#u3.5 beschriebene Snake Spiel mit folgenden Änderungen
//
//    Nutze als Tasten w,a,s,d anstelle der im Code verwendeten
//    Das Programm, das sich bisher nur in der main-Methode befindet, soll in verschiedene Methoden aufgespalten werden.
//    das Feld soll auf ein 30*30er vergrößert werden
//    Spieler, Schlange, Gold und Tür sollen auf Zufallskoordinaten gesetzt werden. (Methode Math.random())
//    verwende anstelle der Klasse java.awt.Point eine eigene geschriebene Klasse Point (Bei der equals Methode bitte einmal vorher Rückfragen)

    public static void main( String[] args ) throws Exception {
        Gameplay gameplay = new Gameplay();

        Scanner scanner = new Scanner(System.in);
        boolean playerIsAlive = true;

        while ( playerIsAlive ) {

            gameplay.printTheField();

            // Status feststellen

            playerIsAlive = gameplay.checkStatus();

            if (playerIsAlive) {
                String move = scanner.nextLine();

                switch (move) {

                    // Spielfeld ist im Bereich 0/0 .. 29/29

                    case "w" : gameplay.moveUp(); break;

                    case "s" : gameplay.moveDown(); break;

                    case "a" : gameplay.moveLeft(); break;

                    case "d" : gameplay.moveRight(); break;

                }

                // Schlange bewegt sich in Richtung Spieler

                gameplay.snakeMovesToPlayer();
            }


        }

        scanner.close();
    }

}
