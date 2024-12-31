package org.algos.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    /**
     * Method to insert value at first position in the list
     */
    public void insertAtFirstPos(int val) {
        var node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    /**
     * Method to insert value at last position in list
     */
    public void insertAtLastPos(int val) {

        if(tail == null){
            insertAtFirstPos(val);
            return;
        }

        var node = new Node(val);
        tail.next = node;
        tail = tail.next;
        size += 1;
    }

    /**
     * Method to insert node at desired location in list
     */
    public void insertAtDesiredLocation(int position, int val) {
        var node = new Node(val);
        var tmp = head;

        if (position == 1) {
            insertAtFirstPos(val);
            return;
        }

        for (int i = 1; i < position - 1; i++) {
            tmp = tmp.next;
        }
        node.next = tmp.next;
        tmp.next = node;
    }

    /**
     * Method to display list
     */
    public void display() {
        var temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private static class Node {
        private final int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }
}