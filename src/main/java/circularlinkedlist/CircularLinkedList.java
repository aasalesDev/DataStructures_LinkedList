package circularlinkedlist;

public class CircularLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public int size(){
        return this.listSize;
    }

    public boolean isEmpty(){
        return this.listSize == 0;
    }

    private Node<T> getNode(int index){
        if(this.isEmpty()){
            System.out.println("This list is Empty.");
        }
        if (index == 0){
            return tail;
        }
        Node<T> auxiliaryNode = tail;
        for (int i = 0; (i < index) && (auxiliaryNode != null); i++) {
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        return auxiliaryNode;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }

    public void remove(int index){
        if (index >= size()){
            System.out.println("There are no items at index " + index);
        }
        Node<T> auxiliaryNode = this.tail;
        if(index == 0){
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        }else if (index == 1) {
            this.tail.setNextNode(this.tail.getNextNode());
        } else{
            for (int i = 0; i < index-1; i++) {
                auxiliaryNode = auxiliaryNode.getNextNode();
            }
            auxiliaryNode.setNextNode(auxiliaryNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    public void add(T content){
        Node<T> auxiliaryNode = new Node<T>(content);
        if(this.listSize == 0){
            this.tail = auxiliaryNode;
            this.head = auxiliaryNode;
            this.tail.setNextNode(this.head);
        } else {
            auxiliaryNode.setNextNode(this.tail);
            this.head.setNextNode(auxiliaryNode);
            this.tail = auxiliaryNode;
        }
        this.listSize++;
    }

    public String toString(){
        String strReturn = "";
        Node<T> auxiliaryNode = this.tail;
        for (int i = 0; i < size()-1; i++) {
            auxiliaryNode = auxiliaryNode.getNextNode();
            strReturn += "Node: [{" + auxiliaryNode.toString() + "}] --> ";
        }
        strReturn += isEmpty() ? "[]" : "(back to beginning)";
        return strReturn;
    }

}
