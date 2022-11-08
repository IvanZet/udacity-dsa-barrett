package net.ivanzykov.datastructures.linkedlist;

// THIS IS THE CODE THAT WILL TEST YOUR SOLUTION
// DO NOT MAKE CHANGES TO THIS FILE

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */

    }

}
