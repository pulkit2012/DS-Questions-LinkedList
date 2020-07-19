package Questions;

public class MiddleElement {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;

    //Simple Method using size of the list
    public static int MiddleElement() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < size / 2; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    //Method Using Pointers
    public static int MiddleElement2() {
        Node ref = head;
        Node main = head;
        while (ref != null && ref.next != null) {
            ref = ref.next.next;
            main = main.next;
        }
        return main.data;
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
        push(5);
        push(3);
        push(2);
        // push(5);
        System.out.println("Given linked list ");
        printList(head);
        System.out.println("Middle Element using first Method " + MiddleElement());
        System.out.println("Middle Element using Second Method " + MiddleElement2());


    }
}
