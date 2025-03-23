public class Linked_List {

    // Represents a node in the linked list.
    private static class Node {
        int data;
        Node next;

        // Constructor to create a node with a given value.
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // First node in the list

    public Linked_List() {
        head = null; // Start with an empty list
    }

    // Adds a new node at the beginning of the list.
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Link new node to the existing head
        head = newNode; // Update head to the new node
    }

    // Adds a new node at the end of the list.
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set the new node as head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Move to the last node
            }
            current.next = newNode; // Attach new node at the end
        }
    }

    // Removes the first node from the list.
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            head = head.next; // Move head to the next node
        }
    }

    // Displays the list elements.
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of list
    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);

        System.out.println("Linked List after insertions:");
        list.printList(); // Expected: 20 -> 10 -> 30 -> null

        list.deleteFromBeginning();
        System.out.println("Linked List after deleting first node:");
        list.printList(); // Expected: 10 -> 30 -> null
    }
}
