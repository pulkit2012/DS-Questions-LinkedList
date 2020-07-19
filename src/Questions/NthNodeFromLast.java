package Questions;

public class NthNodeFromLast {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    //Method Using simple size property
    public static int NthNodeFromLast(int n) {
        Node temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int index = size - n;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    //Method using 2 pointers complexity O(n)
    public static int NthNodeFromLast2(int n){
        Node ref = head;
        Node main = head;
        while (n > 0){
            if(ref == null){
                throw new IndexOutOfBoundsException(Integer.toString(n));
            }
            ref = ref.next;
            n--;
        }
        while (ref != null){
            main = main.next;
            ref = ref.next;
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
        push(4);
        push(5);
        push(6);
        push(7);
        System.out.println("Given linked list ");
        printList(head);
        System.out.println("using method 1 == " + NthNodeFromLast(3));
        System.out.println("using method 2 == " + NthNodeFromLast2(3));

    }
}
