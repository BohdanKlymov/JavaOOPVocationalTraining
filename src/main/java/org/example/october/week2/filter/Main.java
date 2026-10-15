package org.example.october.week2.filter;

import java.util.ArrayList;
import java.util.List;

//    Aufgabe Filter:

//    a) Schreibe eine Methode FilterPositiv, die eine übergebende Liste von Typ int nach positiven Zahlen filtert (sprich alle negativen Zahlen werden herausgefiltert)
//          und diese gefilterte Liste zurückgibt.
//    b) Schreib eine Methode FilterGroßbuchstaben, die eine übergebende Liste von Typ char nach Großbuchstaben filtert und diese zurückgibt
//    c) Schreibe ein generisches Interface Filter mit der Methode Filter.
//    d) Schreib eine Methode Filter die das Interface nutzt
//    e) Löse Aufgabe a und b) unter der Verwendung des Filters mit privaten Klassen
//    f) Löse Aufgabe a und b) mit List.stream().filter unter Verwendung einer anonymen Klasse.

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-5, 3, -2, 8, 0, 4);

//        ??????????????
        List<Integer> positivNumbers = filter(numbers, new FilterPositiv());

        System.out.println(positivNumbers);


        List<Character> letters = List.of('N', 'p', 'O', 'T', 'j', 'e');

        List<Character> upperLetters = filter(letters, new Filter<Character>() {
            @Override
            public boolean filter(Character element) {
                return Character.isUpperCase(element);
            }
        });

        System.out.println(upperLetters);
    }


    public static <T> List<T> filter(List<T> list, Filter<T> filter) {

        List<T> result = new ArrayList<>();

        for (T element : list) {
            if (filter.filter(element)) {
                result.add(element);
            }
        }

        return result;
    }

//    ?????????
    private static class FilterPositiv implements Filter<Integer>{

        @Override
        public boolean filter(Integer element) {
            return element > 0;
        }
    }
}
