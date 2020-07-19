package Questions;

import java.util.HashSet;

public class RemvDupliUnsorted {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    //Using Two Loops
    public static void RemoveDupli(){
       Node temp = head;
       Node temp2 = null;
       while (temp != null && temp.next != null){
           temp2 = temp;
           while(temp2.next != null){
               if(temp.data == temp2.next.data){
                   temp2.next = temp2.next.next;
               }
               else {
                   temp2 = temp2.next;
               }
           }
           temp = temp.next;
       }
    }
    //Using Hashing....
    public static void RemoveDupli2(){
        Node temp = head;
        Node prev = null;
        HashSet<Integer> set = new HashSet<>();
        while (temp != null){
            if(set.contains(temp.data)){
                prev.next = temp.next;
            }
            else {
                set.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
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
        push(3);
        push(2);
        push(1);
        System.out.println("Given linked list ");
        printList(head);
        RemoveDupli2();
        printList(head);
        push(3);
        push(2);
        push(1);
        printList(head);
        RemoveDupli();
        printList(head);

    }
}
