//Thomas Hlebowicz period 1

public class Knight {
    
    private int[][] board; 
    private int moves;
    private boolean solved; 
    private int xLen;
    private int yLen;
    
    public Knight( int x, int y ) {
	moves = 0;
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
		if ( board[x][y] >= 10 ) 
		    ret += " ";
		else 
		    ret += "  ";
	    }	   
	    
	    ret += "\n";
	}
	return ret;
    }

    public void solve(int x, int y) {
		
	if ( moves == xLen * yLen ) 
	    solved = true; 
	    
	else if ( ( x>=0 && y>=0 && y<yLen && x<xLen ) && board[x][y] == 0) {
	    moves++;
	    board[x][y] = moves; 
   
	    if (!solved) 
		solve(x+1,y+2);
	    if (!solved) 
		solve(x+1,y-2);
	    if (!solved) 
		solve(x-1,y+2);
	    if (!solved) 
		solve(x-1,y-2);
	    if (!solved) 
		solve(x+2,y-1);
	    if (!solved) 
		solve(x+2,y+1);
	    if (!solved) 
		solve(x-2,y-1);
	    if (!solved) 
		solve(x-2,y+1);

	    if (!solved) {
		board[x][y] = 0;
		moves--;
	    }
	}
    }
    
    public static void main( String[] args ) {
	Knight k = new Knight(5,5);
	k.solve(0,0);
	System.out.println(k);
	if (k.solved) 
	    System.out.println("solved");
    }
}
