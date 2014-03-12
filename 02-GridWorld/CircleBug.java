//Thomas Hlebowicz
//Grid World Exercises Part 2
//MKS22X Mr. Zamansky Period 1

import info.gridworld.actor.Bug; 

public class CircleBug extends Bug { 
    
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

	    /*Because the turn method is called only once,
	    the bug will turn 45 degreees each time and draw 
	    out an octagon instead of a square. */

	    steps = 0;
	}
    }
}
