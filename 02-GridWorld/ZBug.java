//Thomas Hlebowicz
//Grid World Exercises Part 2
//MKS22X Mr. Zamansky Period 1

import info.gridworld.actor.Bug; 

public class ZBug extends Bug { 
    
    private int steps;
    private int sidelength;
    private int sideCtr;
    
    public ZBug( int length ) {
	steps = 0;
	sideLength = length;
	setDirection(90);
	sideCtr = 1; 
    }
    
    public void act() {
	if ( sideCtr < 4 ) {
	    
	    if ( steps < sideLength && canMove() ) {
		move();
		steps ++;
	    }
	    else {
		
		steps = 0;
		
		if ( sideCtr == 1 ) {
		    setDirection(225);
		}
		else if ( sideCtr == 2 ) {
		    setDirection(90);
		}
		sideCtr++; 
	    }

	}
    }
}
