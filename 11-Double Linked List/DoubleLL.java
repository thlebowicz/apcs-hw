//Thomas Hlebowicz and Malcolm Wells

public class DoubleLL<E>{
    private class Node<E>{
	E data;
	Node<E> next,prev;
	public Node(E d){
	    this.data = d;
	}
	public String toString(){
	    return ""+data;
	}
	public void setData(E d){data=d;}
	public E getData(){return data;}
	public void setNext(Node<E> n){next=n;}
	public Node<E> getNext(){return next;}
	public void setPrev(Node<E> n){prev=n;}
	public Node<E> getPrev(){return prev;}
    }
    private Node<E> current;
    public void insert(E d){
	Node<E> n = new Node<E>(d);
	if(current == null){
	    current = n;
	    n.setNext(n);
	    n.setPrev(n);
	} else {
	    current.prev.setNext(n);
	    n.prev = current.prev;
	    n.next = current;
	    current.prev = n;
	    current = n;
	}
    }
    public E getCurrent(){
	return current.getData();
    }
    public void forward(){
	if(current.getNext() != null)
	    current = current.getNext();
    }
    public void back(){
	if(current.getPrev() != null)
	    current = current.getPrev();
    }
    public String toString(){
	if(current == null){
	    return "";
	}
	Node<E> tmp = current.getNext();
	String s = current.getData()+"";
	while(tmp != current){
	    s += " "+tmp.getData();
	    tmp = tmp.getNext();
	}
	return s;
    }
    public E delete(){
	E x = null;
	if(current.getNext() == current){
	    x = current.data;
	    current = null;
	} else {
	    current.prev.setNext(current.next);
	    current.next.setPrev(current.prev);
	    x = current.data;
	    current = current.next;
	}
	return x;
    }
    public int find(E val){
	Node<E> tmp = current.prev;
	int i = 0;
	while(current != tmp){
	    if(current.data == val){
		return i;
	    }
	    current = current.next;
	    i++;
	}
	return -1;
    }
    public static void main(String[]args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	//First test up to here
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L); 
	//then test to here
	L.delete();
	System.out.println(L); 
	System.out.println(L.find("hello"));
	
    }
}
