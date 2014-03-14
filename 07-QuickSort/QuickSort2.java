import java.util.*;
public class QuickSort2 {    
    //QuickSort working only within the parameter array
    public static void swap( int[] a, int p1, int p2 ) {
	int oldVal = a[p1];
	a[p1] = a[p2];
	a[p2] = oldVal;
    }
    public static int partition( int[] A, int L, int R, int p ) {
	int wall = L;
	int pIndex = R;
	swap(A,R,p);
       
	for ( int i = L; i < R; i++ ) {
	    if ( A[i] <= A[pIndex] ) {
		swap(A,i,wall);
		wall++;
	    }	   
	}
        swap(A,pIndex,wall);
	return wall;
    }
    public static int[] QuickSort( int[] A, int low, int high ) {
	if ( high > low ) {
	    Random rng = new Random();
	    int p = low + rng.nextInt(high - low);
	    p = partition(A,low,high,p);
	    QuickSort(A,low,p-1);
	    QuickSort(A,p+1,high);
	}
	return A;
    }
    
    public static void main( String[] args) {
	int[] test = new int[10];
	Random rng = new Random();
	for( int n = 0; n < test.length; n++ ) 
	    test[n] = rng.nextInt(500);
	test = QuickSort(test,0,(test.length)-1);
	System.out.println(Arrays.toString(test));
    }
}
        
