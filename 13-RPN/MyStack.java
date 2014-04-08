import java.util.Arrays;
public class MyStack {

    private String[] arr; 
    private int numElts;
    private int top;

    public MyStack(){
	arr = new String[10];
	top = -1;
	numElts = 0;
    }

    public  void push(String s){
	if ( top == arr.length-1 ) 
	    arr = Arrays.copyOf(arr,2*arr.length);
	top++;
	arr[top] = s;
	numElts++;
    }
    
    public String pop() {
	String s = arr[top];
	arr[top] = null;
	top--;
	numElts--;
	return s;
    }

    public String peek() {
	return arr[top];
    }

    public boolean isEmpty() {
	return top == -1;
    }

    public int getSize() {
	return numElts;
    }
    
    public String toString(){
	String tmp = "";
	for (int n = 0; n <= top; n++) 
	    tmp += arr[n] + ", ";
	return tmp;
    }
}
