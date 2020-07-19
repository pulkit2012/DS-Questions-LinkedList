package Questions;

public class DetectLengthOfLoop {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    public static int CountNodes(Node node) {
        Node temp = node;
        int num = 1;
        while (temp.next != node) {
            temp = temp.next;
            num++;
        }
        return num;
    }
    // Using Floyd's Algorithm
    public static int LoopLength(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return CountNodes(slow);
            }
        }
        return 0;
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
        DetectLengthOfLoop list = new DetectLengthOfLoop();
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        list.head.next.next.next.next = head.next.next;
        System.out.println(LoopLength(head));
    }
}
