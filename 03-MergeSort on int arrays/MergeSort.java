public class MergeSort {
    
    //Takes two sorted arrays and merges them
    private static int[] merge( int[] A, int[] B ) {
	int[] ret = new int[A.length + B.length];
	int aPos = 0;
	int bPos = 0;
	int retPos = 0;
	
	while ( retPos < ret.length ) {
	    
	    if ( aPos == A.length ) {
		ret[retPos] = B[bPos];
		bPos++;
	    }
	    else if ( bPos == B.length ) {
		ret[retPos] = A[aPos];
		aPos++;
	    }
	    else if ( A[aPos] <= B[bPos] ) {
		ret[retPos] = A[aPos];
		aPos++;
	    }
	    else {
		ret[retPos] = B[bPos];
		bPos++;
	    }
	    retPos++;
	}
	return ret;
    }
  

    
    public static int[] mergesort( int[] a ) { 
	if ( a.length > 1 ) {
	    int[] h1 = new int[a.length / 2];
	    int[] h2 = new int[a.length - (a.length / 2)];
	    
	    for (int i = 0; i< (a.length/2); i++) 
		h1[i] = a[i];
	    
	    for (int c = (a.length/2); c < a.length; c++) 
		h2[c-(a.length/2)] = a[c];
	    	    
	    int[] R1 = mergesort(h1);
	    int[] R2 = mergesort(h2);
	    a = merge(R1,R2);
	}
	return a; 
    }
	

    public static void main( String[] args ) {
	int[] a = {5,4,3,2,1,12,3123,12,3123,32543,6,547,65,4235,35};
	a = mergesort(a);
	for ( int n = 0; n < a.length; n++) {
	    System.out.print(a[n] + " ");
	}

}
}
