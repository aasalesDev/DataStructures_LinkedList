package circularlinkedlist;

public class Main {
    public static void main(String[] args) {

        CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();

        circularLinkedList.add("One");
        circularLinkedList.add("Two");
        circularLinkedList.add("Three");
        circularLinkedList.add("Four");
        circularLinkedList.add("Five");
        circularLinkedList.add("Six");
        circularLinkedList.add("Seven");
        System.out.println("\n=================PRINTING THE LIST================\n");
        System.out.println(circularLinkedList);

        System.out.println("\n=================PRINTING AN ELEMENT================\n");
        //There will not be index out of bounds exception - the list is circular - endless...
        System.out.println(circularLinkedList.get(100));

        System.out.println("\n=================END================\n");
    }
}
