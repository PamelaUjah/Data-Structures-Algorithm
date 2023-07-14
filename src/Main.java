import LinkedLists.CodingExercise.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        System.out.println("\nLinked List:");
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        myLinkedList.reverse();
        myLinkedList.printList();

    }
}