package net.ivanzykov.datastructures.linkedlist;

// THIS IS THE CODE THAT WILL TEST YOUR SOLUTION
// DO NOT MAKE CHANGES TO THIS FILE

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());


        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */

    }

}
