package org.example.September.October.Week1;

public class Stack <T> {
    private Element<T> top;


    public T peek() {
        if (top == null) {
            return null;
        }
        return top.contents;
    }

    public boolean push (T element) {
        Element<T> newElement = new Element<>(element);

        if (top != null) {
            newElement.next = top;
        }

        top = newElement;

        return true;
    }

    public T pop() {
        if (top == null) {
            return null;
        }

        T value = top.contents;
        top = top.next;

        return value;
    }

    private static class Element<T> {
        T contents;
        Element<T> next;

        Element(T contents) {
            this.contents = contents;
            this.next = null;
        }
    }

}
