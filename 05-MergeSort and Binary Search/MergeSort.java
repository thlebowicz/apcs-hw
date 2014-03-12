import java.util.ArrayList;
import java.lang.Math;

public class MergeSort {
    
    //Takes two sorted arraylists and merges them
    private static ArrayList<Comparable> merge( ArrayList<Comparable> A, ArrayList<Comparable> B ) {
	ArrayList<Comparable> ret = new ArrayList<Comparable>();
	int aPos = 0;
	int bPos = 0;
	int retPos = 0;
	
	while ( retPos < A.size()+B.size() ) {
	    
	    if ( aPos == A.size() ) {
		ret.add(B.get(bPos));
		bPos++;
	    }
	    else if ( bPos == B.size() ) {
		ret.add(A.get(aPos));
		aPos++;
	    }
	    else if ( A.get(aPos).compareTo( B.get(bPos) ) <= 0 ) {
		ret.add(A.get(aPos));
		aPos++;
	    }
	    else {
	        ret.add(B.get(bPos));
		bPos++;
	    }
	    retPos++;
	}
	return ret;
    }

    public static ArrayList<Comparable> mergesort( ArrayList<Comparable> a ) { 
	if ( a.size() > 1 ) {
	    ArrayList<Comparable> h1 = new ArrayList<Comparable>();
	    ArrayList<Comparable> h2 = new ArrayList<Comparable>();
	    
	    for (int i = 0; i< (a.size()/2); i++) 
		h1.add(a.get(i)); 
	    
	    for (int c = (a.size()/2); c < a.size(); c++) 
		h2.add(a.get(c));
	    	    
	    ArrayList<Comparable> R1 = mergesort(h1);
	    ArrayList<Comparable> R2 = mergesort(h2);
	    a = merge(R1,R2);
	}
	return a; 
    }
	
    public static void main( String[] args ) {
	//Tests array of integers
	ArrayList<Comparable> a = new ArrayList<Comparable>();
	for ( int n = 0; n < 20; n++ ) {
	    a.add(""+(new Integer((int)(100*Math.random()))));
	}
	System.out.println(a);
	a = mergesort(a);
	for ( int n = 0; n < a.size(); n++) {
	    System.out.print(a.get(n) + " ");
	}
	System.out.println("\n");
	
	//Tests array of strings
	ArrayList<Comparable> b = new ArrayList<Comparable>();
	b.add("z");
	b.add("e");
	b.add("asd");
	b.add("fgdfgf");
	b.add("zey");
	System.out.println(b);
	b = mergesort(b);
	for ( int n = 0; n < b.size(); n++) {
	    System.out.print(b.get(n) + " ");
	}
	System.out.println("\n");
	
	//Tests array of Persons
	ArrayList<Comparable> c = new ArrayList<Comparable>();
	c.add(new Person("John",10));
	c.add(new Person("Z",21));
	c.add(new Person("Jack",15));
	c.add(new Person("James",13));
	c.add(new Person("X",100));
	System.out.println(c);
	c = mergesort(c);
	for ( int n = 0; n < c.size(); n++) {
	    System.out.print(c.get(n) + " ");
	}    
    }
}
