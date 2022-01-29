package linkedlist;

public class LinkedList<T> {

    Node<T> entryReference;

    public LinkedList() {
        this.entryReference = null;
    }

    public boolean isEmpty(){
        return entryReference == null;
    }

    public int size(){
        int listSize = 0;
        Node<T> auxiliaryReference = entryReference;
        while (true){
            if (auxiliaryReference != null){
                listSize++;
                if (auxiliaryReference.getNextNode() != null){
                    auxiliaryReference = auxiliaryReference.getNextNode();
                } else{
                    break;
                }
            } else {
                break;
            }
        }
        return listSize;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);
        if (this.isEmpty()){
            entryReference = newNode;
            return;
        }
        Node<T> auxiliaryNode = entryReference;
        for (int i = 0; i < this.size()-1; i++) {
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        auxiliaryNode.setNextNode(newNode);
    }

    private Node<T> getNode(int index){
        indexValidation(index);
        Node<T> auxiliaryNode = entryReference;
        Node<T> returnNode = null;
            for (int i = 0; i <= index; i++) {
                returnNode = auxiliaryNode;
                auxiliaryNode = auxiliaryNode.getNextNode();
            }
            return returnNode;
    }

    private void indexValidation(int index){
        if (index >= size()){
            throw new IndexOutOfBoundsException("The greatest index in this list is " + (size()-1) + ".");
        }
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    public T remove(int index){
        Node<T> targetNode = this.getNode(index);
        if(index == 0){
            entryReference = targetNode.getNextNode();
            return targetNode.getContent();
        }
        Node<T> previousNode = getNode(index-1);
        previousNode.setNextNode(targetNode.getNextNode());
        return targetNode.getContent();
    }

    public String toString(){
        String strReturn = "";
        Node<T> auxiliaryNode = entryReference;
        for (int i = 0; i < this.size(); i++) {
            strReturn += "Node{" + auxiliaryNode.getContent() + "}] -->";
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        strReturn += "null";
        return strReturn;
    }
}
