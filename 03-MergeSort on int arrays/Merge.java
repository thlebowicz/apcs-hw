public class Merge {
    
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
		retPos++;
	    }
	    else if ( bPos == B.length ) {
		ret[retPos] = A[aPos];
		aPos++;
		retPos++;
	    }
	    else if ( A[aPos] <= B[bPos] ) {
		ret[retPos] = A[aPos];
		aPos++;
		retPos++;
	    }
	    else {
		ret[retPos] = B[bPos];
		bPos++;
		retPos++;
	    }
	}
	return ret;
    }

    public static void main( String[] args ) {
	int[] x = { 1, 3, 5, 7, 9};
	int[] y = { 2, 4, 6, 8, 10,12,13,14};
	int[] z = merge(x,y);
	System.out.print("[ ");
	for ( int c = 0; c < z.length; c++ ) {
	    System.out.print(z[c]+" ");
	}
	System.out.print("]");
	}
}
