package Questions;

import java.util.Scanner;

public class DeleteSpecific {

    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    //Create Your Method
    public static void DeleteGiven(int key){
       Node temp = head;
       Node prev = null;
       if(temp != null && temp.data == key){
            head = temp.next;
            return;
       }
       while(temp != null && temp.data != key){
           prev = temp;
           temp = temp.next;
       }
       if(temp == null){
           return;
       }
       prev.next = temp.next;
    }

    static void push(int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        // push(5);
        System.out.println("Given linked list ");
        printList(head);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to delete");
        DeleteGiven(in.nextInt());
        printList(head);
    }
}


