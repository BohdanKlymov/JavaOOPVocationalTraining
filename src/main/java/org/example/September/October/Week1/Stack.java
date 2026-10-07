package org.example.September.October.Week1;

public class Stack {
    private Element<Integer> top;


    public Integer peek() {
        if (top == null) {
            return null;
        }
        return top.contents;
    }

    public boolean push (Integer element) {
        Element<Integer> newElement = new Element<>(element);

        if (top != null) {
            newElement.next = top;
        }

        top = newElement;

        return true;
    }

    public Integer pop() {
        if (top == null) {
            return null;
        }

        Integer value = top.contents;
        top = top.next;

        return value;
    }

    private static class Element<Integer> {
        Integer contents;
        Element<Integer> next;

        Element(Integer contents) {
            this.contents = contents;
            this.next = null;
        }
    }

}
