/**
 * 
 */
package algoPrep1;


import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import javax.net.ssl.SSLException;

/**
 * @author pranaysadarangani
 *
 */


public class AlgoPrep1 {
	
	//Comparator anonymous class implementation
	public static Comparator<LRUClass> idComparator = new Comparator<LRUClass>(){
		
		@Override
		public int compare(LRUClass obj1, LRUClass obj2) {
			// TODO Auto-generated method stub
			
	    	if (obj1.currentTime < obj2.currentTime)
	            return 1;
	        else if (obj1.currentTime > obj2.currentTime)
	            return -1;
	        return 0;
	        
		}
			
	};
	
	
	/*
	 
	class LRUClassComparator implements Comparator<LRUClass> {
	    
	    // Overriding compare()method of Comparator 
	    // for descending order of currentTime
	    public int compare(LRUClass obj1, LRUClass obj2) {
	        
	    	if (obj1.currentTime < obj2.currentTime)
	            return 1;
	        else if (obj1.currentTime > obj2.currentTime)
	            return -1;
	        return 0;
	        }
	}
	
	*/
	
	static class LRUClass {
		
		int iValue;
		long currentTime;
		
		LRUClass(int iValueNew)
		{
			iValue = iValueNew;
			currentTime = System.currentTimeMillis();
			System.out.println(currentTime);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	LRU
		//	Least Recently Used
		//	You have a set of numbers say 10 and 5 slots in which to put them in
		//	Put the first 5 numbers in the 5 available slots.
		//	Each queue has 2 values the number and the current clock time when the item was inserted in the priority queue
		//	The queue is prioritized by the time in the most recent order
		
		//System.out.println(System.currentTimeMillis());
		
		PriorityQueue<LRUClass> lruQueue = new PriorityQueue<LRUClass>(10,idComparator);
		
		LRUClass objLRUClass3 = new LRUClass(3);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		LRUClass objLRUClass4 = new LRUClass(4);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LRUClass objLRUClass2 = new LRUClass(2);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		LRUClass objLRUClass1 = new LRUClass(1);
		
		lruQueue.add(objLRUClass1);
		lruQueue.add(objLRUClass2);
		lruQueue.add(objLRUClass3);
		lruQueue.add(objLRUClass4);
		
		System.out.println(" ----- ");
		System.out.println(lruQueue.poll().currentTime);
		System.out.println(lruQueue.poll().currentTime);
		System.out.println(lruQueue.poll().currentTime);
		System.out.println(lruQueue.poll().currentTime);
			
		
		//System.out.println(System.currentTimeMillis());
		
		
		
	}
	
	

}




