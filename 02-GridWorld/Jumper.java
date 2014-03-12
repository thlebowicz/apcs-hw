//Thomas Hlebowicz period 1

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Jumper extends Actor {
    
    public Jumper( Color c ) {
	setColor(c);
    }

    public void act() {
	if ( canJump() )
	    jump();
	else
	    turn();
    }

    public void turn() {
	setDirection( getDirection() + Location.HALF_RIGHT );
    }

    public void jump() {
       Grid<Actor> grid = getGrid();
       if ( grid == null ) 
	   return;
       
       Location loc = getLocation(); 
       Location one = loc.getAdjacentLocation( getDirection() ); 
       Location two = one.getAdjacentLocation( getDirection() ); 
       
       if ( grid.isValid( moveloc2 ) ) 
	   moveTo( two ); 
       else 
	   turn();
    } 

    public boolean canJump() { 
	Grid<Actor> grid = getGrid(); 
	if ( grid == null ) 
	    return false; 
	
	Location loc = getLocation(); 
	Location one = loc.getAdjacentLocation(getDirection()); 
	Location two = one.getAdjacentLocation(getDirection()); 

	if ( (! grid.isValid(one)) || (! grid.isValid(two)) ) 
	    return false; 
	
	Actor neighbor = grid.get( one ); 
	if ( !( neighbor == null || neighbor instanceof Flower 
		|| neighbor instanceof Rock )) 
	    return false; 
       
	neighbor = grid.get(two); 
	if (!( neighbor == null || neighbor instanceof Flower ) )
	    return false;
	
	return true;; 
    } 
}
