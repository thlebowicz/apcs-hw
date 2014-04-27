public class BST {
    private Node root;
    
    public BST() {
	root = null;
    }   
    public void insert( int i ) {
	Node n = new Node(i);
	Node tmp = root;
	while ( true ) {
	    if ( i == tmp.getData() ) 
		break;
	    else if ( i < tmp.getData() ) {
		if ( !tmp.hasLeft() ) {
		    tmp.setLeft(n);
		    break;
	    }
		else 
		    tmp = tmp.getLeft();
	    }
	    else {
		if ( !tmp.hasRight() ) { 
		    tmp.setRight(n);
		    break;
		}
		else 
		    tmp = tmp.getRight();
	    }
	}
    }
    public Node search(int x) {
	Node p = root;
	while ( p!=null && p.getData()!=x ) {
	    if ( p.getData() > x ) 
		p = p.getLeft();
	    else 
		p = p.getRight();
	}
	return p;
    }
    public Node search2(Node c, int x) {
	if (c.getData() == x)  
	    return c; 
	else if (x < c.getData() && c.hasLeft())  
	    return search2(c.getLeft(),x);
	else if (x > c.getData() && c.hasRight())
	    return search2(c.getRight(),x);
	else
	    return null;
    }
}
