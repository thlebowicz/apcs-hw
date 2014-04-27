public class BST {
    private node root;
    
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
    public void insert( int i ) {
	Node n = new Node(i);
	Node tmp = root;
	while ( true ) {
	    if ( n.getData() == tmp.getData() ) 
		break;
	    else if ( n.getData() < tmp.getData() ) {
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