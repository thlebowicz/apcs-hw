import java.util.Arrays;
public class MyStack {

    private String[] arr; 
    private int top;
    //Removed numElts after talking to Dionis

    public MyStack(){
	arr = new String[10];
	top = -1;
    }

    public  void push(String s){
	if ( top == arr.length-1 ) 
	    arr = Arrays.copyOf(arr,2*arr.length);
	top++;
	arr[top] = s;
    }
    
    public String pop() {
	String s = arr[top];
	/* arr[top] = null;
	   Removed after class discussion */
	top--;
	return s;
    }

    public String peek() {
	return arr[top];
    }

    public boolean isEmpty() {
	return top == -1;
    }

    public int getSize() {
	return top+1;
    }
    
    public String toString(){
	String tmp = "";
	for (int n = 0; n <= top; n++) 
	    tmp += arr[n] + ", ";
	return tmp;
    }
}
