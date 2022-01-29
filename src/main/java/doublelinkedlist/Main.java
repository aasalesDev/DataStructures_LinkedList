package doublelinkedlist;

public class Main {
    public static void main(String[] args) {

        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add("One");
        doubleLinkedList.add("Two");
        doubleLinkedList.add("Three");
        doubleLinkedList.add("Four");
        doubleLinkedList.add("Five");
        doubleLinkedList.add("Six");
        doubleLinkedList.add("Seven");

        System.out.println("\n=============PRINTING THE LIST===================\n");
        System.out.println(doubleLinkedList);
        System.out.println("=============REMOVING AN ITEM===================\n");
        doubleLinkedList.remove(4);
        System.out.println(doubleLinkedList);
        System.out.println("=============ADDING THE ITEM AGAIN===================\n");
        doubleLinkedList.add(4, "Five");
        System.out.println(doubleLinkedList);
        System.out.println("=============THAT'S ALL FOLKS===================\n");
    }
}
