public class Node {
    private int data;
    private Node left;
    private Node right; 
    private Node prev;
    public Node(int s) {
	data = s;
	left = null;
	right = null;
	prev = null;
    }
    public void setData(int s) {
	data = s;
    }
    public void setLeft(Node s) { 
	left = s;
    }
    public void setRight(Node s) {
	right = s;
    }
    public void setPrev(Node s) {
	prev = s;
    }
    public int getData() {
	return data;
    }
    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
    }
    public Node getPrev() {
	return prev;
    }
    public boolean hasLeft() {
	return left == null;
    }
    public boolean hasRight() {
	return right == null;
    }
   
    public String toString() { 
	return "Data: "+data+" Left/Right: " + left + " " + right;
    }
}
