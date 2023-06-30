public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        System.out.println("\nLinked List:");
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(8);

        myLinkedList.reverse();
        myLinkedList.printList();

    }
}