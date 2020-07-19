package Questions;

import java.util.HashSet;

public class DetectLoop {
    static class Node {
        int data;
        Node next;
    }

    static Node head;

    //Using Hashing...
    public static boolean LoopDetect1(Node head) {
        HashSet<Node> set = new HashSet<Node>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    //Using Floyd's Algorithm
    public static boolean LoopDetect2(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
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
        DetectLoop list = new DetectLoop();
        push(20);
        push(4);
        push(15);
        push(10);
        list.head.next.next.next.next = list.head;
        System.out.println(LoopDetect1(head) ? "Loop Detected Method1" : "Loop Not Detected Method1");
        System.out.println(LoopDetect2(head) ? "Loop Detected Method2" : "Loop Not Detected Method2");
    }
}
