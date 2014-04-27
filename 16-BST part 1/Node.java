public class Node {
    private String data;
    private Node left;
    private Node right; 
    public Node(String s) {
	data = s;
    }
    public void setData(String s) {
	data = s;
    }
    public void setLeft(Node s) { 
	left = s;
    }
    public void setRight(Node s) {
	right = s;
    }
    public String getData() {
	return data;
    }
    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
    }
   
    public String toString() { 
	return "Data: "+data+" Left/Right: " + left + " " + right;
    }
    public static void main( String[] args ) {
	Node n = new Node("root");
	n.setLeft(new Node("left"));
	n.setRight(new Node("right"));
	System.out.println(n.getLeft());
	System.out.println(n.getRight());
    }
}