public class Node<E> {
    private E data;
    private Node next;
    public Node(E s) {
	data = s;
    }
    public void setData(E s) { 
	data = s;
    }
    public E getData() {
	return data;
    }
    public Node getNext() {
	return next;
    }
    public void setNext(Node n) {
	next = n;
    }
    public String toString() { 
	return "Data: "+data+" Next: "+next;
    }
}
