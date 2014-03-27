public class Node {
    private String data;
    private Node next;
    public Node(String s) {
	data = s;
    }
    public void setData(String s) { 
	data = s;
    }
    public String getData() {
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