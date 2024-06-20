package Searching_Algorithm;


import java.util.*;

public class Frequency_Elements {

	public static void main(String[] args) {
		
		int[] a= {10,20,14,10,16,14,12,12,10};
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<a.length; i++) {
			if(map.containsKey(a[i])) {
				int count = map.get(a[i])+1;
				map.put(a[i],count);
			}
			else {
				map.put(a[i],1);
			}
		}
		System.out.println(map);
		
	}
}
