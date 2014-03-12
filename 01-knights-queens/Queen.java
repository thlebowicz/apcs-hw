//Thomas Hlebowicz period 1

public class Queen {
    
    private int[][] board;
    private boolean solved; 
    private int numQ; //Number of queens on board
    private int xLen;
    private int yLen;
    
    public Queen( int x, int y ) {
	board = new int[x][y];
	xLen = x;
	yLen = y; 
	for( int c = 0; c < x; c++ ) {
	    for( int i = 0; i < y; i++ ) {
		board[c][i] = 0;
	    }
	}
    }

     public String toString() {
	String ret = "";
	for( int x = 0; x < board.length; x++ ) {
	    for( int y = 0; y < board[x].length; y++ ) {
		ret += ( board[x][y]);
	        ret += " "; 
	    }	   
	    
	    ret += "\n";
	}
	return ret;
    }

    //Marks space as being threatened by a queen
    public void set(int x,int y) {
	if ( ! (board[x][y] == 9)) {
	    board[x][y] = 1;
	}
    }	   
    /*Called evertime a queen is placed to mark all the spaces
      threatened by that queen */
    public void fill(int x, int y) {
	for (int c = 0; c < yLen; c++){ 
	    set(x,c);
	}
	for (int r = 0; r < xLen; r++) {
	    set(r,y);
	}
	int x2 = x+1;
	int y2 = y+1;
	while ( x2 < xLen && y2 < yLen ) {
	    set(x2,y2);
	    x2++;
	    y2++;
	}
	x2 = x-1;
	y2 = y-1;
	while ( x2 >= 0 && y2 >= 0 ) {
	    set(x2,y2);
	    x2--;
	    y2--;
	}
	x2 = x-1;
	y2 = y+1;
	while ( x2 >= 0 && y2 < yLen ) {
	    set(x2,y2);
	    x2--;
	    y2++;
	}
	x2 = x+1;
	y2 = y-1;
	while ( x2 < xLen && y2 >= 0 ) {
	    set(x2,y2);
	    x2++;
	    y2--;
	}
    }

    public void solve(int x, int y) {
	//Number of queens on board = n
	if ( numQ == xLen ) 
	    solved = true; 
        //Checks if you're able to place queen on current space
	else if (  board[x][y] == 0 ) {
	    fill(x,y);
	    board[x][y] = 9;
	    numQ++;
	    //Attempts to call solve for every spot on the board
	    for ( int r =0; r < xLen; r++ ) {
		for ( int c = 0; c < yLen; c++ ) {
		    if (!solved) 
			solve(r,c);
		    
		}
	    }
	    /* Though I got my code to work for the 5x5 example, I had 
	       trouble extending it to larger boards. Essentially my solve
	       places a queen in the first non-"threatened" spot on the board
	       available, but doesn't go back to try another configuration if
	       the program runs into a dead-end. */
	}
    }
    public static void main( String[] args ) {
	Queen q = new Queen(5,5);
	q.solve(0,0);
	System.out.println(q+"\n");
	if (q.solved) 
	    System.out.println("Solved");
	
    }
}
