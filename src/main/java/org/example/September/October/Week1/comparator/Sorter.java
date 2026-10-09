package org.example.September.October.Week1.comparator;

public class Sorter<T>{
    public T[] bubbleSort2(T[] givenArray, Comparator<T> comparator) {
        for(int i=1; i<givenArray.length; i++) {
            for(int j=0; j<givenArray.length-i; j++) {
                if(comparator.compare(givenArray[j], givenArray[j+1])>0) {
                    T temp=givenArray[j];
                    givenArray[j]=givenArray[j+1];
                    givenArray[j+1]=temp;
                }
            }
        }
        return givenArray;
    }
}
