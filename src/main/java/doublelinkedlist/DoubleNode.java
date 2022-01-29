package doublelinkedlist;

public class DoubleNode<T> {

    private T content;
    DoubleNode<T> nextNode;
    DoubleNode<T> previousNode;

    public DoubleNode(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public DoubleNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoubleNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "content=" + content +
                '}';
    }
}
