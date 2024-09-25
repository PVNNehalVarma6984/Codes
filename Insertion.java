package Dsa.LinkedLists;

import java.util.*;

public class Insertion {
    Node head;

    // Node class definition
    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertatbeg(int data) {
        Node Start = new Node(data);
        if (head == null) {
            head = Start;
            return;
        }
        Node temp = Start;
        temp.next = head;
        head = Start;

    }

    // Method to traverse and print the linked list
    public void traverse() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        System.out.println("Linked list:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insertion list = new Insertion();

        // Taking user input for the linked list elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insertAtEnd(data);
        }

        // Displaying the linked list
        list.traverse();

        scanner.close();
    }
}
