public class Node {
    private int data;
    private Node left;
    private Node right; 
    public Node(int s) {
	data = s;
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
    public int getData() {
	return data;
    }
    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
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
