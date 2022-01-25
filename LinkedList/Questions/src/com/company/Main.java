package com.company;

public class Main {

    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.createLL(1);
//        ll.insertNode(9);
//        ll.insertNode(5);
//        ll.insertNode(10);
//        ll.insertNode(2);
//        ll.insertNode(6);
//        ll.insertNode(15);
//        ll.insertNode(2);
//        ll.traverseLL();
//        Questions q = new Questions();
//        q.deleteDuplicates(ll);
//        ll.traverseLL();
//
//        Node nth = q.nthFromLast(ll, 3);
//        System.out.println(nth.value);
//
//        ll = q.partition(ll, 6);
//        ll.traverseLL();

        LinkedList llA = new LinkedList();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);

        LinkedList llB = new LinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);
        Questions q = new Questions();
//        LinkedList result = q.sumLists(llA, llB);
//        result.traverseLL();
        q.addSameNode(llA, llB, 7);
        q.addSameNode(llA, llB, 2);
        q.addSameNode(llA, llB, 1);
        Node inter = q.findInterSection(llA, llB);
        System.out.println(inter.value);
    }
}
