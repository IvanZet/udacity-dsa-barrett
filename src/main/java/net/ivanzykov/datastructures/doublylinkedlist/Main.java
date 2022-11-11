package net.ivanzykov.datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);


        System.out.println(myDLL.get(3).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */

    }
}
