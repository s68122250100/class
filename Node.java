class Node {
    private int data;
    private Node next;
    private int count;
    // Constructors
    public Node(int dataValue) {
        data = dataValue;
        next = null;
        ++count;
    }

    public Node(int dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
        ++count;
    }
    public int getcount() {
        return count;
    }
    public int getData() {
        return data;
    }

    public void setData(int dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }
}