/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;

/**
 *
 * @author rashid.khitilov
 */
public class LlRemoveLastFirstNode {

    static class Node {

        int data;
        Node next;

        Node(int tmp) {
            data = tmp;
        }
    }

    static Node removeFirstNode(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head; 
        head = head.next; 
        return head;
    }
    static Node removeLastNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    static void printLinkedList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(23);
        Node n2 = new Node(29);
        Node n3 = new Node(29);
        Node n4 = new Node(45);
        Node n5 = new Node(45);
        Node n6 = new Node(45);
        Node n7 = new Node(54);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        System.out.println(
                "Initial linked list : ");
        printLinkedList(n1);
//        n1 = removeLastNode(n1);
        n1 = removeFirstNode(n1);

        System.out.println();

        System.out.println(
                "Linked list after removing last node: ");
        printLinkedList(n1);
        
        
        
        System.out.println("0--------------------------0");
        
        LinkedList<String> list = new LinkedList<String>(); 
  
        // Using add() method to add elements in the list 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("10"); 
        list.add("20");
        list.removeFirst();
        
    }
}
