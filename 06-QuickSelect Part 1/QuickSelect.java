import java.lang.Math;
import java.util.*;

//Special thanks to Lawrence Lim for his help with troubleshooting
public class QuickSelect { 

    public static int quickselect( int[] a, int k, int low, int high,int kill) {
	if (low == high) 
	    return a[high]; 
	
	else {
	    //Set random pivot and take the value at the pivot
	    int p = low + (int)((high-low) * Math.random());
	    p = a[p];
	    int[] tempArr = new int[high-low+1];
	    //Filling up tempArray
	    int left = 0;
	    int right = tempArr.length - 1; 
	    for (int n = low; n <= high; n++) {
		if (a[n] < p) { 
		    tempArr[left] = a[n];
		    left++;
		}
		else if (a[n] > p) {
		    tempArr[right] = a[n];
		    right--;
		}
	    }
	    for (int n=left; n<=right; n++) 
		tempArr[n] = p;
	    
	    for (int n = low; n <= high; n++) 
		a[n] = tempArr[n-low];
	    
	    int pIndex = low + left; 

	    if (pIndex == k) 
		return p;
	    else if ( pIndex > k )
		return quickselect(a,k,low,pIndex-1,kill+1);
	    else 
		return quickselect(a,k,pIndex+1,high,kill+1);
	}
    }
	    
    public static void main( String[] args ) {
	int[] test = {4,32,4324,78,3};
	System.out.println(quickselect(test,4,0,4,0));
    }
}
