package net.ivanzykov.datastructures.linkedlist;

// THIS IS THE CODE THAT WILL TEST YOUR SOLUTION
// DO NOT MAKE CHANGES TO THIS FILE

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Linked List before set():");
        myLinkedList.printList();

        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            Linked List before set():
            0
            1
            2
            3

            Linked List after set():
            0
            1
            99
            3

        */

    }

}
