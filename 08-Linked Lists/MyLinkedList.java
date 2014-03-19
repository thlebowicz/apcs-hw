public class MyLinkedList {
    private Node head;
    
    public MyLinkedList() {
	head = null;
    }
    public void add( String s ) {
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
    }
    
    public String toString() {
	Node tmp = head;
	String ret = "";
	while ( tmp != null ) {
	    ret += tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	return ret;
    }

    public void add( int i, String s ) {
	Node tmp = new Node(s);
	Node front = head;
	Node back = head;
	for ( int n = 0; n < i; n++ ) {
	    back = front;
	    front = front.getNext();
	}
	tmp.setNext(front);
	back.setNext(tmp);
    }

    public String get(int i) {
	Node tmp = head;
	for (int n=0; n < i; n++ ) {
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }
    
  public Node getNode(int i) {
	Node tmp = head;
	for (int n=0; n < i; n++ ) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }
    
    public String set( int i, String s ) {
	Node tmp = new Node(s);
	Node oldNode = getNode(i);
	tmp.setNext(getNode(i+1));
	getNode(i-1).setNext(tmp);
	return "" + oldNode;
    }

    public String remove ( int i) {
	String oldNode = get(i);
	getNode(i-1).setNext(getNode(i+1));
	return oldNode;
    }
    
    public int find( String s ) {
	Node tmp = head;
	int pos = 0;
	if ( head.getData().equals(s) )
	    return pos;
	pos++;
	tmp = head.getNext();
	while ( tmp != null && tmp != head ) {
	    if ( tmp.getData().equals(s) )
		return pos;
	    else {
		tmp = tmp.getNext();
		pos++;
	    }
	}
	return -1;
    }

    public int length() {
        int len = 0;
	if ( head == null ) 
	    return len;
	else if ( head.getNext() == null )
	    return len+1;
	else {
	    Node tmp = head.getNext();
	    len++;
	    while ( tmp != null && tmp != head ) {
		len++;
		tmp = tmp.getNext();
	    }
	    return len;
	}
    }
	

    
    public static void main( String[] args ) {
	MyLinkedList L = new MyLinkedList();
	L.add("D");
	L.add("C");
	L.add("B");
	L.add("A");
	System.out.println("After adding letters:");
	System.out.println(L);
	System.out.println("L.get(2):");
	System.out.println(L.get(2));
	L.set(2,"test");
	System.out.println("After setting 2 to test:");
	System.out.println(L);
	System.out.println("After adding hi at 2:");
	L.add(2,"hi!");
	System.out.println(L);
	L.remove(2);
	System.out.println("After removing string at index 2:");
	System.out.println(L);
	System.out.println("Position of first B:");
	System.out.println(L.find("B"));
	System.out.println("Length of L:");
	System.out.println(L.length());
    }
	
    



}
