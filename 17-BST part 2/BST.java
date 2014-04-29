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
		return;
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
	n.setPrev(tmp);
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
    public void delete(int x) {
        Node n = search(x); 
	if ( n == null ) { return; } //x isnt in the tree
	else if (n.hasLeft() && n.hasRight()) { // 2 child case
	    Node tmp = n.getLeft();
	    while ( tmp.getRight() != null )  
		tmp = tmp.getRight(); 
	    tmp.getPrev().setRight(null);
	    tmp.setRight(n.getRight());
	    tmp.setLeft(n.getLeft());
	    tmp.setPrev(n.getPrev());
	    if ( n == root )  // special case for the root
		root = tmp;
	    else { // else if its not the root
		if ( n.getPrev().getRight().getData() == n.getData() )
		    n.getPrev().setRight(tmp);
		else
		    n.getPrev().setLeft(tmp);
	    }
	}
	else { // 0 and 1 child cases
	    if ( n.hasRight() ) {
		if ( n.getPrev().getRight().getData() == n.getData() )
		    n.getPrev().setRight(n.getRight());
		else 
		    n.getPrev().setLeft(n.getRight());
	    }
	    else {
		if ( n.getPrev().getRight().getData() == n.getData() ) 
		    n.getPrev().setRight(n.getLeft());
		else
		    n.getPrev().setLeft(n.getLeft());
	    }
	}
    }		
}
