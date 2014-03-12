public class BinarySearch {
    
    public static int rbsearchHelper( int n, int[] L, int lo, int hi ) {
	int nPos = -1;  
        int mp = (lo + hi) / 2; 

        if (lo > hi) 
	    return nPos;

        if ( L[mp] == n )
	    nPos = mp;

        else if ( L[mp] > n )
	    return rbsearchHelper( n, L, lo, mp-1 );
	    
        else if ( L[mp] < n ) 
	    return rbsearchHelper( n, L, mp+1, hi );
        
        return nPos;
    }
    
    public static int rbsearch( int n, int[] L ) {
	return rbsearchHelper(n,L,0,L.length-1);
    }

    
    public static int ibsearchHelper( int n, int[] L, int lo, int hi ) {
       	int nPos = -1;
	int mp; 
	
	while( lo <= hi ) { 
	    mp = (lo + hi) / 2;
	 
	    if ( L[mp] == n ) {
		nPos = mp;
		break; 
	    }
	    
	    else if ( L[mp] > n ) 
		hi = mp-1; 
	    
	    else if ( L[mp] < n ) 
		lo = mp+1;
	    
	}
	return nPos;
    }
    
    public static int ibsearch( int n, int[] L ) {
	return ibsearchHelper(n,L,0,L.length-1);
    }
    
    public static void main( String[] args ) {
	int[] m = new int[5];
	for ( int n = 0; n < 5; n++ ) {
	    m[n] = n;
	    System.out.print(m[n] + " ");
	}
	System.out.println();
	System.out.println(rbsearch(2,m));
	System.out.println(ibsearch(2,m));
	System.out.println(rbsearch(3,m));
	System.out.println(ibsearch(1,m));
    }
}
			   
