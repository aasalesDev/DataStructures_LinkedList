package doublelinkedlist;

public class DoubleLinkedList<T> {

    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;

    private int listSize;

    public DoubleLinkedList() {
        this.listSize = 0;
        this.firstNode = null;
        this.lastNode = null;
    }

    public int size(){
        return this.listSize;
    }

    private DoubleNode<T> getDoubleNode(int index){
        DoubleNode<T> auxiliaryDoubleNode = firstNode;
        for (int i = 0; (i < index) && (auxiliaryDoubleNode != null); i++) {
            auxiliaryDoubleNode = auxiliaryDoubleNode.getNextNode();
        }
        return auxiliaryDoubleNode;
    }

    public T getDoubleNodeContent(int index){
        return this.getDoubleNode(index).getContent();
    }

    public void add(T element){
        DoubleNode<T> newDoubleNode = new DoubleNode<>(element);
        newDoubleNode.setNextNode(null);
        newDoubleNode.setPreviousNode(lastNode);
        if(firstNode == null){
            firstNode = newDoubleNode;
        }
        if(lastNode != null){
            lastNode.setNextNode(newDoubleNode);
        }
        lastNode = newDoubleNode;
        this.listSize++;
    }

    public void add(int index, T element){
        DoubleNode<T> auxiliaryNode = getDoubleNode(index);
        DoubleNode<T> newDoubleNode = new DoubleNode<>(element);
        newDoubleNode.setNextNode(auxiliaryNode);
        if(newDoubleNode.getNextNode() != null){
            newDoubleNode.setPreviousNode(auxiliaryNode.getPreviousNode());
            newDoubleNode.getNextNode().setNextNode(newDoubleNode);
        }else {
            newDoubleNode.setPreviousNode(lastNode);
            lastNode = newDoubleNode;
        }
        if (index == 0){
            firstNode = newDoubleNode;
        }else {
            newDoubleNode.getPreviousNode().setNextNode(newDoubleNode);
        }
        this.listSize++;
    }

    public void remove (int index){
        if(index ==0){
            firstNode = firstNode.getNextNode();
            if(firstNode != null){
                firstNode.setPreviousNode(null                                                    );
            }
        }else{
           DoubleNode<T> auxiliaryNode = getDoubleNode(index);
           auxiliaryNode.getPreviousNode().setNextNode(auxiliaryNode.getNextNode());
           if(auxiliaryNode != lastNode){
               auxiliaryNode.getNextNode().setPreviousNode(auxiliaryNode.getPreviousNode());
           } else {
               lastNode = auxiliaryNode;
           }
        }
        this.listSize--;
    }

    public String toString(){
        String strReturn = "";
        DoubleNode<T> auxiliaryNode = firstNode;
        for (int i = 0; i < size() ; i++) {
            strReturn += "Node [{Content: " + auxiliaryNode.getContent() + "}] --> ";
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        strReturn += "null";
        return strReturn;
    }
}
