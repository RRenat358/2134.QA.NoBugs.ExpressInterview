package ru.rrenat358.lesson_04;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lesson042 {
    public static void main(String[] args) {

        Node linkedList;


        Node node1 = new Node("01", null);
        Node node2 = new Node("02", node1);
        Node node3 = new Node("03", node2);


        node1.printNode();
        node2.printNode();
        node3.printNode();

        // 01 > 02 > 03

        rewertNods(node3);
        System.out.println("================");

        node1.printNode();
        node2.printNode();
        node3.printNode();


    }

    public static Node rewertNods(Node node) {

        Node currentNode = node;
        Node nextNode = node.next;
        node = nextNode;

        return node;
    }



}


