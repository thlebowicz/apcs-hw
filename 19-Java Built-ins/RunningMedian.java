import java.util.*;
public class RunningMedian {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    boolean evenNum;
    
    public RunningMedian() {
	minHeap = new PriorityQueue();
	maxHeap = new PriorityQueue(20,Collections.reverseOrder());
	evenNum = true;
    }

    public void add(int n) {
	Integer i = new Integer(n);
	evenNum = !(evenNum);
	if (minHeap.size() < maxHeap.size() + 1) 
	    minHeap.add(i);
	else
	    maxHeap.add(i);
    }

    public int findMedian() {
	if (evenNum)
	    return (minHeap.peek().intValue() + maxHeap.peek().intValue())/2;
	return maxHeap.peek().intValue();
    }

    public int removeMedian() {
	int ret=0;
	if (minHeap.size() + maxHeap.size() < 1 || !(evenNum))
	    ret = maxHeap.poll().intValue();
	else 
	    ret = (minHeap.poll().intValue() + maxHeap.poll().intValue()) / 2;
	return ret;
    }
    
    public static void main(String[] args) {
	RunningMedian rm = new RunningMedian();
	rm.add(5);
	rm.add(6);
	rm.add(7);
	rm.add(8);
	System.out.println(rm.evenNum);
	System.out.println(rm.findMedian());
    }

}
	    
