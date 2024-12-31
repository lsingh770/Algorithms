package org.algos;

import org.algos.linkedList.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        sampleForLinkedList();
        sampleForMergeList();
    }

    public static void sampleForLinkedList(){
        var list = new LinkedList();
        list.insertAtFirstPos(3);
        list.insertAtFirstPos(0);
        list.insertAtFirstPos(1);
        list.insertAtFirstPos(2);
        list.insertAtFirstPos(4);
        list.insertAtFirstPos(20);
        list.insertAtLastPos(19);
        list.insertAtDesiredLocation(3,23);
        list.display();
    }

    public static void sampleForMergeList(){
        var list1 = new LinkedList();
        list1.insertAtFirstPos(3);
        list1.insertAtFirstPos(2);
        list1.insertAtFirstPos(1);

        var list2 = new LinkedList();
        list2.insertAtFirstPos(4);
        list2.insertAtFirstPos(3);
        list2.insertAtFirstPos(1);

        var list = new LinkedList();
        list = list.mergeListSequential(list1, list2);
        list.display();
    }
}