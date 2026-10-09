package org.example.September.October.Week1.comparator;

public interface Comparator<T> {
    /**
     *
     * @param element1
     * @param element2
     * @return negativ if element1 < element2, 0 if element1 = element2, positiv if element1 > element2
     */
    int compare(T element1, T element2);
}
