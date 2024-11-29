package ru.rrenat358.lesson_04;

public class Node {

    String value;
    Node next;

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    void printNode() {
        System.out.println("Current node: " + value);
        if (next == null) {
            System.out.println("Next node: non \n");
        } else {
            System.out.println("Next node: " + getNext().value + " \n");
        }

    }



}
