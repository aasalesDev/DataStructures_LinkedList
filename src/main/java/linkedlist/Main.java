package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();

        System.out.println("\n=====Adding Elements to the List=====");
        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");
        myLinkedList.add("Four");
        myLinkedList.add("Five");

        System.out.println("\n=====Printing Elements by Index=====");
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));

        System.out.println("\n=====Trying to Print an Element of an Non-Existent Index=====");
        System.out.println(myLinkedList.get(5));

        System.out.println("\n=====Printing the Entire List=====");
        System.out.println(myLinkedList);

        System.out.println("\n=====Removing an Element from the List=====");
        System.out.println(myLinkedList.remove(4));

        System.out.println("\n============End============");
    }
}
