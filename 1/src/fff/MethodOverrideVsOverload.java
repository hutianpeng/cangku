package fff;

import java.util.ArrayList;
import java.util.LinkedList;

public class MethodOverrideVsOverload {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		long startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
		    arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long durationA = endTime - startTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
		    linkedList.add(i);
		}
		endTime = System.nanoTime();
		long durationB = endTime - startTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
		    arrayList.get(i);
		}
		endTime = System.nanoTime();
		long durationC = endTime - startTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {     
		    linkedList.get(i); 
		} 
		endTime = System.nanoTime();
		long durationD = endTime - startTime; 

		/*startTime = System.nanoTime(); 
		for (int i = 9999; i >=0; i--) {
		    arrayList.remove(i);
		}
		endTime = System.nanoTime();
		long durationE = endTime - startTime;

		startTime = System.nanoTime(); 
		for (int i = 9999; i >=0; i--) {
		    linkedList.remove(i);
		}
		endTime = System.nanoTime();
		long durationF = endTime - startTime;*/
		
		//iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
		 startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			 arrayList.remove(i);
		}
		 endTime = System.nanoTime();
		 long durationX = endTime - startTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			   linkedList.remove(i);
		}
		 endTime = System.nanoTime();
		 long durationY = endTime - startTime;
		
		
		System.out.println(durationA);
		System.out.println(durationB);
		System.out.println(durationC);
		System.out.println(durationD);
		//System.out.println(durationE);
		//System.out.println(durationF);
		System.out.println();
		System.out.println(durationX);
		System.out.println(durationY);
	}
	}