import java.util.*;

public class QuickSort {

    public static Integer[] QuickSort( Integer[] A, int low, int high ) {

	if (A.length <= 1){ 
	    return A;
	}
	else {
	  
	    Random rng = new Random();
	    int p = rng.nextInt(A.length);
	    ArrayList<Integer> leftArr = new ArrayList<Integer>();
	    ArrayList<Integer> rightArr = new ArrayList<Integer>();
	 
	    for (int n = low; n <= high; n++) {
		if ( n!=p ) {
		    if (A[n] <= A[p]) 
			leftArr.add(A[n]);
		    else 
			rightArr.add(A[n]);
		}
	    }
    
	    Integer[] ret = new Integer[A.length];
	    Integer[] left = QuickSort( leftArr.toArray(new Integer[]{}), 0, leftArr.size()-1 );
	    Integer[] right = QuickSort( rightArr.toArray(new Integer[]{}), 0, rightArr.size()-1 );
	    
	    for (int n = 0; n < left.length; n++)
		ret[n] = left[n];
	    
	    ret[left.length] = A[p];
	    
	    for (int n = left.length + 1; n < ret.length; n++)
		ret[n] = right[n-(1+left.length)];
	  
	    return ret;
	}
    }

    public static void main( String[] args ) {
	Integer[] test = new Integer[10];
	Random rng = new Random();
	for( int n = 0; n < test.length; n++ ) 
	    test[n] = rng.nextInt(500);
       	
	System.out.print("[ ");
	for( int n = 0; n < test.length; n++ ) 
	    System.out.print(test[n] + " ");
	System.out.println(" ]");
	
	Integer[] ret = QuickSort(test,0,test.length-1);

	System.out.print("[ ");
	for( int n = 0; n < ret.length; n++ ) 
	    System.out.print(ret[n] + " ");
	    System.out.println(" ]");
    }
}
	
