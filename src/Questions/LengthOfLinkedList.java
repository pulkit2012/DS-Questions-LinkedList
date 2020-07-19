package Questions;

public class LengthOfLinkedList {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    //Create Your Method
    public static int getCount(){
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
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
        System.out.println("Size of given linked list is " + getCount());
    }
}
