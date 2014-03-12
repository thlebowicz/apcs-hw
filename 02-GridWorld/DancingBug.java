//Thomas Hlebowicz
//Grid World Exercises Part 2
//MKS22X Mr. Zamansky Period 1

import info.gridworld.actor.Bug; 

public class DancingBug extends Bug { 
    
    private int[] turns;
    private int step;
    
    public DancingBug( int[] turnList ) {
	turns = turnList;
	step = 0;
    }
    
    public void turn( int n ) {
	for ( int i = 0; i < n; i++ ) 
	    turn();
    }

    public void act() {
        if ( step == turns.length )
	    step = 0;
	turn( turns[step] );
	step++;
	super.act(); 
    }
}


