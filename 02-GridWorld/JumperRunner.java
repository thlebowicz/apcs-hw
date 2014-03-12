//Thomas Hlebowicz period 1

import info.gridworld.actor.ActorWorld; 
import info.gridworld.actor.Bug; 
import info.gridworld.actor.Rock; 
import info.gridworld.actor.Flower; 

public class JumperRunner { 
 
    public static void main(String[] args) { 

	ActorWorld world = new ActorWorld(); 
	world.add( new Bug() ); 
	world.add( new Flower() ); 
	world.add( new Rock() ); 
	world.add( new Jumper() ); 
	world.show(); 
    }
}
