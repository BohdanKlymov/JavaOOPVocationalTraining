package org.example.September_2026.October.Week1.Customers;

public class Snake<T> {
    private Element<T> beginn;
    private Element<T> end;

    private static class Element<T> {
        T contents;
        Element<T> next;

        Element(T contents) {
            this.contents = contents;
            this.next = null;
        }
    }

    public boolean offer(T element) {
        Element<T> newElement = new Element<>(element);

        if (beginn == null) {
            beginn = newElement;
        } else {
            end.next = newElement;
        }
        
        end = newElement;
        
        return true;
    }

    public T poll(){
        if (beginn == null) {
            return null;
        }

        T value = beginn.contents;
        beginn = beginn.next;

        if (beginn == null) {
            end = null;
        }

        return value;
    }

    public T peek() {
        if (beginn == null) {
            return null;
        }
        return beginn.contents;
    }
}
