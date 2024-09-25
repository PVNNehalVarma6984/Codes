/*Given a Singly Linked List a0 -> a1 -> a2 -> .. -> a(n-1) -> an. The task is to reorder it to a0 -> an -> a1 -> a(n-1) -> a2 -> a(n-2) -> ..



Input

First line contains a single integer N - the size of the list

Second line contains N space separated integers - the nodes in the list (Insertion at beginning)



Constraints

1 <= N <= 10000

1 <= X <= 10000 where X = value of node



Output

Print the list after reordering.



Sample Input

5

1 2 3 4 5



Sample output

5 1 4 2 3



Explanation

Original List: 5 -> 4 -> 3 -> 2 -> 1

Modified List: 5 -> 1 -> 4 -> 2 -> 3 */
package Dsa.LinkedLists;

import java.util.*;

public class HalfRevese {
    Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HalfRevese h = new HalfRevese();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            h.InsertatEnd(k);
        }
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    void InsertatEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }
}
