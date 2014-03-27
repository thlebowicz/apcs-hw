import java.util.*;

public class myLLIterator<E> implements Iterator<E> { 

    private Node<E> currentNode;
    
    public myLLIterator ( Node<E> n ) { 
	currentNode = n; 
    }

    public boolean hasNext() { 
	return currentNode.getNext() != null;
    }
    
    public E next() { 
	currentNode = currentNode.getNext();
	return currentNode.getData();
    }
    
    public void remove() { return; }

    public static void main( String[] args ) {
	Node<String> n = new Node<String>("test");
	Iterator<String> it = new myLLIterator(n);
	System.out.println(it.hasNext());
	n.setNext(new Node<String>("s"));
	System.out.println(it.next());
    }
}
