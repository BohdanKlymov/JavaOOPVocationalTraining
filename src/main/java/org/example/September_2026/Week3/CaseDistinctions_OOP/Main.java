package org.example.September_2026.Week3.CaseDistinctions_OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("You can choose an animal:");
        System.out.println("1. Dog, 2. Cat, 3. Kiwi, 4. Deer, 5. Octopus, 6. Wallaby, 7. Seal, 8. Shark, 9. Tiger, 10. Gorilla");
        System.out.print("Print the number to see more information: ");

        Scanner scanner = new Scanner(System.in);
        int animalNum = scanner.nextInt();

        switch (animalNum) {
            case 1:
                Animal dog = new Animal(4, false, false, "Eventual");
                dog.printInformation();
                break;

            case 2:
                Animal cat = new Animal(4, false, false, "false");
                cat.printInformation();
                break;

            case 3:
                Animal kiwi = new Animal(2, false, true, "false");
                kiwi.printInformation();
                break;

            case 4:
                Animal deer = new Animal(4, false, false, "false");
                deer.printInformation();
                break;

            case 5:
                Animal octopus = new Animal(8, false, false, "eventual");
                octopus.printInformation();
                break;

            case 6:
                Animal wallaby = new Animal(2, false, false, "false");
                wallaby.printInformation();
                break;

            case 7:
                Animal seal = new Animal(0, false, false, "false");
                seal.printInformation();
                break;

            case 8:
                Animal shark = new Animal(0, false, false, "true");
                shark.printInformation();
                break;

            case 9:
                Animal tiger = new Animal(4, false, false, "true");
                tiger.printInformation();
                break;


            case 10:
                Animal gorilla = new Animal(4, false, false, "eventual");
                gorilla.printInformation();
                System.out.println(gorilla.hashCode());
                System.out.println(gorilla.toString());
                System.out.println(gorilla.equals(gorilla));
                System.out.println(gorilla==gorilla);
                System.out.println(gorilla.equals(scanner));

                Animal gorilla2 = new Animal(4, false, false, "eventual");
                System.out.println(gorilla2.hashCode());
                System.out.println(gorilla2.toString());
                System.out.println(gorilla.equals(gorilla2));
                System.out.println(gorilla==gorilla2);


        }
        scanner.close();
    }

}
