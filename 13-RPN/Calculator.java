import java.util.Scanner;
public class Calculator {
   
    public static boolean isOperation(String s) {
	return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }

    public static void main( String[] args ) {
	MyStack stack = new MyStack();
	Scanner sc = new Scanner(System.in);
	while ( true ) {
	    String input = sc.next();
	    try {
		double in = Double.parseDouble(input);
		stack.push(""+in);
	    }
	    catch ( Exception ex ) { 
		if (!isOperation(input)) 
		    System.out.println("Invalid input");
		else {
		    boolean r = false;
		    double ret = 0;
		    double a = Double.parseDouble(stack.pop());
		    double b;
		    try { 
			b = Double.parseDouble(stack.pop());
		    }
		    catch ( Exception exx ) {
			b = 0;
		    }
		    if ( input.equals("+") ) {
			ret = a+b;		
		    }
		    else if ( input.equals("-") ) {
			ret = b-a;		   
		    }   		
		    else if ( input.equals("*") ) {
			ret = a*b;		  
		    }
		    else if ( input.equals("/") ) {
			if (b!=0) 
			    ret = b/a;		    
			else
			    ret = a;		   
		    }
		    stack.push(""+ret);
		    System.out.println(ret);       	
		}
	    }
	}
    }  
}
	
    

	    
	
	
