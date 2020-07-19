package Questions;

public class RemvDupliSorted {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    //Create Your Method
    public static void DeletedSorted(){
        Node temp = head;
        while (temp != null){
            Node temp2 = temp;
            while(temp2 != null && temp.data == temp2.data){
                temp2 = temp2.next;
            }
            temp.next = temp2;
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
        push(2);
        push(3);
        push(3);
        push(3);
        push(4);
        // push(5);
        System.out.println("Given linked list ");
        printList(head);
        System.out.println("Removed duplicates");
        DeletedSorted();
        printList(head);
    }
}
