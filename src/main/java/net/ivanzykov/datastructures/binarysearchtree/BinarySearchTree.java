package net.ivanzykov.datastructures.binarysearchtree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    private Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * Breadth First Search. Uses ArrayDeque instead of LinkedList because Java
     * documentation favours the first one. Uses ArrayDeque.offer() and ArrayDeque.poll()
     * instead of add() and remove() because the first two are defined in Queue interface.
     *
     * @return  list of integers representing the values of nodes in the tree
     */
    public List<Integer> BFS() {
        BinarySearchTree.Node currentNode = root;
        Queue<Node> queue = new ArrayDeque<>();
        List<Integer> results = new ArrayList<>();
        queue.offer(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.poll();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
        return results;
    }
}
