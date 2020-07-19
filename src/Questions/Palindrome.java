package Questions;

import java.util.Stack;

public class Palindrome {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    //Using Stack
    public static boolean PalindromeChecker(){
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (!stack.isEmpty()){
            if(temp.data != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
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
        // push(5);
        System.out.println("Given linked list ");
        printList(head);
        System.out.println(PalindromeChecker() ? "Palindrome" : "not Palindrome");
    }
}
