import java.util.*;
public class QuickSort3 {    
    //QuickSort working only within the parameter array
    public static void swap( int[] a, int p1, int p2 ) {
	int oldVal = a[p1];
	a[p1] = a[p2];
	a[p2] = oldVal;
    }
    public static int partition( int[] A, int L, int R, int p ) {
	int Lwall = L;
	int pVal = A[p];
       
	for ( int i = L; i <= R; i++ ) {
	    if ( A[i] < pVal ) {
		swap(A,i,Lwall);
		Lwall++;
	    }	
	}
	int Rwall = Lwall; 
	
	for ( int j = L; j <= R; j++ ) {
	    if ( A[j] == pVal ) {
		swap(A,j,Rwall);
		Rwall++;
	    }
	}
	return (Lwall + Rwall) / 2;
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
	double a = System.currentTimeMillis();
	int[] test = new int[1000];
	Random rng = new Random();
	for( int n = 0; n < test.length; n++ ) 
	    test[n] = rng.nextInt(1000);
	test = QuickSort(test,0,(test.length)-1);
	System.out.println(Arrays.toString(test));
	System.out.println(System.currentTimeMillis() - a);
    }

}
        
