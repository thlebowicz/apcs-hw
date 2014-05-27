import java.util.*;
public class SpeedTest { 
    
    public static void main(String[] args) {
	TreeMap tm = new TreeMap();
	TreeSet ts = new TreeSet();
	HashMap hm = new HashMap();
	HashSet hs = new HashSet();
	double time = 0;
       
	String key = "";
	time = System.currentTimeMillis(); 
	for (int i=0; i<1000000; i++) 
	    tm.put(""+i,i);
	time = System.currentTimeMillis() - time; 
	System.out.println("Time to add 10^6 elements to treemap: " + time);

	time = System.currentTimeMillis(); 
	for (int n=0; n<1000000; n++) 
	    hm.put(""+n,n);
	time = System.currentTimeMillis() - time; 
	System.out.println("Time to add 10^6 elements to hashmap: " + time);
	
	time = System.currentTimeMillis(); 
	for (int i=0; i<1000000; i++) 
	    ts.add(i);
	time = System.currentTimeMillis() - time;
	System.out.println("Time to add 10^6 elements to treeset: " + time);

	time = System.currentTimeMillis();
	for (int n=0; n<1000000; n++) 
	    hs.add(n);
	time = System.currentTimeMillis() - time;
	System.out.println("Time to add 10^6 elements to hashset: " + time);
    }
}

	
