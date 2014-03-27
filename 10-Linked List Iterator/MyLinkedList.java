import java.util.*;

public class MyLinkedList<E> implements Iterable {
    private Node<E> head;
    private Node<E> tail;
    private int length;
    
    public Iterator iterator() {
	Iterator<E> it = new myLLIterator(head);
	return it;
    }

    public MyLinkedList() {
	head = new Node<E>(null);
	tail = head;
	length = 0;
    }

    public void add( E s ) {
	Node<E> tmp = new Node<E>(s);
        tail.setNext(tmp);
	tail = tmp;
	length++;	
    }
    
    public String toString() {
	Node<E> tmp = head.getNext();
	String ret = "";
	while ( tmp != null ) {
	    ret += tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	return ret;
    }

    public void add( int i, E s ) {
	Node<E> tmp = new Node<E>(s);
	if ( i == length-1 ) {
	    add(tmp.getData());
	}
	else {
	    Node<E> front = head.getNext();
	    Node<E> back = head.getNext();
	    for ( int n = 0; n < i; n++ ) {
		back = front;
		front = front.getNext();
	    }
	    tmp.setNext(front);
	    back.setNext(tmp);
	    length++;
	}
    }
    
    public E get(int i) {
	Node<E> tmp = head.getNext();
	for (int n=0; n < i; n++ ) {
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }
    
  public Node getNode(int i) {
      Node<E> tmp = head.getNext();
      for (int n = 0; n < i; n++ ) {
	  tmp = tmp.getNext();
      }
      return tmp;
  }
    
    public String set( int i, E s ) {
	Node<E> tmp = new Node<E>(s);
	Node<E> oldNode = getNode(i);
	tmp.setNext(getNode(i+1));
	getNode(i-1).setNext(tmp);
	return "" + oldNode;
    }
    
    public E remove ( int i) {
	E oldNode = get(i);
	if ( i == length-1 )  
	    tail = getNode(i-1);
	getNode(i-1).setNext(getNode(i+1));
	length--;
	return oldNode;
    }
    
    public int find( String s ) {
	Node tmp = head;
	int pos = 0;
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
	return length;
    }
       
    public static void main( String[] args ) {
	MyLinkedList<String> L = new MyLinkedList<String>();
	L.add("A");
	L.add("B");
	L.add("C");
	L.add("D");
	/*System.out.println("After adding letters:");
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
	System.out.println("Position of test:");
	System.out.println(L.find("test"));
	System.out.println("Length of L:");
	System.out.println(L.length());
	L.remove(L.length()-1);
	System.out.println(L);
	System.out.println(L.length);
	L.add(L.length-1,"E");
	System.out.println(L);
	System.out.println(L.tail);
	System.out.println(L.length);*/
	System.out.println(L);
	for ( Object n : L ) {
	    System.out.println(n);
	}
	
    }
}
