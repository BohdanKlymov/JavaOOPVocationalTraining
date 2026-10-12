package org.example.october.week2;

import java.io.*;
import java.util.Scanner;

public class ExceptionsPlayGround {
    public static void main(String[] args) {
//        System.out.println(1 / 0);

//        String s = null;
//        System.out.println(s.toString());

        try {
            System.out.println(readFile("./Test.txt"));

        } catch (FileNotFoundException e) {
            System.err.println("Text.txt not found");
        }

        try {
            writeCounterToFile(10, "./OutTest.txt");
        } catch (FileNotFoundException e) {
            System.err.println("OutTest.txt was not written");
        }
    }

    public static String readFile(String name) throws FileNotFoundException {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(new File(name)))));
        String result = "";

        while (scanner.hasNext()) {
            result += scanner.nextLine() + "\n";
        }
        scanner.close();
        return result;
    }

    public static void writeCounterToFile(int counter, String name) throws FileNotFoundException {
        PrintWriter printer = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(name))));

        for(int index = 0; index < counter + 1; index++) {
            printer.println(index);
        }

        printer.flush();
        printer.close();
    }
}
