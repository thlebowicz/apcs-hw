//Thomas Hlebowicz
//Grid World Exercises Part 2
//MKS22X Mr. Zamansky Period 1

import info.gridworld.actor.Bug; 

public class SpiralBug extends Bug { 
    
    private int steps;
    private int sideLength;
    
    public CircleBug( int length ) {
	steps = 0;
	sideLength = length;
    }
    
    public void act() {
	if ( steps < sideLength && canMove() ) {
	    move();
	    steps ++;
	}
	else {
	    turn();
	    turn();
	    steps = 0;
	    sideLength++; 
	    /*Bug moves makes a side one larger
	      than the previous side every time it moves. */
	}
    }
}
