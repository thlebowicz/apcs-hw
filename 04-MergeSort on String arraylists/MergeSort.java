import java.util.ArrayList;
import java.lang.Math;

public class MergeSort {
    
    //Takes two sorted arraylists and merges them
    private static ArrayList<String> merge( ArrayList<String> A, ArrayList<String> B ) {
	ArrayList<String> ret = new ArrayList<String>();
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

    public static ArrayList<String> mergesort( ArrayList<String> a ) { 
	if ( a.size() > 1 ) {
	    ArrayList<String> h1 = new ArrayList<String>();
	    ArrayList<String> h2 = new ArrayList<String>();
	    
	    for (int i = 0; i< (a.size()/2); i++) 
		h1.add(a.get(i)); 
	    
	    for (int c = (a.size()/2); c < a.size(); c++) 
		h2.add(a.get(c));
	    	    
	    ArrayList<String> R1 = mergesort(h1);
	    ArrayList<String> R2 = mergesort(h2);
	    a = merge(R1,R2);
	}
	return a; 
    }
	
    public static void main( String[] args ) {
	ArrayList<String> a = new ArrayList<String>();
	for ( int n = 0; n < 20; n++ ) {
	    a.add(""+(int)(100*Math.random()));
	}
	a = mergesort(a);
	System.out.println(a);
	for ( int n = 0; n < a.size(); n++) {
	    System.out.print(a.get(n) + " ");
	}
    }
}
