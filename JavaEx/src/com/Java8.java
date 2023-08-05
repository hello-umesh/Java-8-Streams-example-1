package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

		map.put("First", 10);
		map.put("Second", 20);
		map.put("Third", 30);
		map.put("Fourth", 40);

		Iterator<Integer> iterator = map.values().iterator();

		while (iterator.hasNext()) {
		    Integer key = iterator.next();
		    map.put("Fifth", 50);
		    System.out.println(key);
		}
		
		List<Integer> withDupes = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50);
		System.out.println("Distincts: ");
		System.out.println(withDupes.stream().distinct().collect(Collectors.toList()));
		
		double sum = 0;
		int  n=10;
		for(int i =1;i<n;n++) {
			sum +=1/(Math.pow(i, 2));
		}
		System.out.println("sum is:" +sum);
	}

}
