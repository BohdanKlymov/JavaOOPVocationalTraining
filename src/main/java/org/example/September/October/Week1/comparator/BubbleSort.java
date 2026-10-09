package org.example.September.October.Week1.comparator;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] givenArray = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = bubbleSort(givenArray);
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        Integer[] givenArray2 = {5, 2, 9, 1, 5, 6};
        Sorter<Integer> sorter = new Sorter<Integer>();
        Integer[] sortedArray2 = sorter.bubbleSort2(givenArray2, new IntegerComparator());
        for (int i : sortedArray2) {
            System.out.print(i + " ");
        }

        System.out.println();
        String[] givenArrayWords = {"Abubu", "Siiiuuu", "Au", "Nope", "Yes", "A"};
        Sorter<String> sorterWord = new Sorter<String>();
        String[] sortedArrayWords = sorterWord.bubbleSort2(givenArrayWords, new WordLenghtComparator());
        for (String word : sortedArrayWords) {
            System.out.print(word + " ");
        }

        System.out.println();

        Integer[] givenArray3 = {5, 2, 9, 1, 5, 6};
        Arrays.sort(givenArray3, new java.util.Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for (int i : givenArray3) {
            System.out.print(i + " ");
        }

        System.out.println();
        String[] givenArray4 = {"Abubu", "Siiiuuu", "Au", "Nope", "Yes", "A"};
        Arrays.sort(givenArray4, new java.util.Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String word : givenArray4) {
            System.out.print(word + " ");
        }
    }

    public static int[] bubbleSort(int[] givenArray) {
        int temp;
        for(int i=1; i<givenArray.length; i++) {
            for(int j=0; j<givenArray.length-i; j++) {
                if((givenArray[j])>(givenArray[j+1])) {
                    temp=givenArray[j];
                    givenArray[j]=givenArray[j+1];
                    givenArray[j+1]=temp;
                }
            }
        }
        return givenArray;
    }

    private static class IntegerComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer element1, Integer element2) {
            return element1 - element2;
        }
    }

    private static class WordLenghtComparator implements Comparator<String>{

        @Override
        public int compare(String element1, String element2) {
            return element1.length() - element2.length();
        }
    }
}
