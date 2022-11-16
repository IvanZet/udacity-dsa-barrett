package net.ivanzykov.datastructures.hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        // HASH METHOD MUST BE SET TO PUBLIC FOR THESE LINES TO WORK
        System.out.println( myHashTable.hash("paint") );
        System.out.println( myHashTable.hash("bolts") );
        System.out.println( myHashTable.hash("nails") );
        System.out.println( myHashTable.hash("stuff") );
        System.out.println( myHashTable.hash("lumber") );

        /*
            EXPECTED OUTPUT:
            ----------------
            2
            4
            6
            5
            6

        */


    }
}
