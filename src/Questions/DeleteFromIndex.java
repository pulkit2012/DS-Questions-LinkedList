package Questions;

import java.util.Scanner;

public class DeleteFromIndex {
    static class Node {
        int data;
        Node next;
    }
    static Node head = null;
    //Create Your Method
    public static void DeleteAtPos(int index){
        Node temp = head;
        Node prev = null;
        if(index < 0){
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        else if(index == 0){
            head = temp.next;
        }
        else {
            while (temp != null && index > 0){
                prev = temp;
                temp = temp.next;
                index--;
            }
            if(temp == null){
                return;
            }
            prev.next = temp.next;
        }
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
        push(5);
        push(6);
        push(7);
        System.out.println("Given linked list ");
        printList(head);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Index");
        DeleteAtPos(in.nextInt());
        printList(head);
    }
}
