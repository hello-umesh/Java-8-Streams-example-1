package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
        map.put("anil",1000);
        map.put("ankit",1200);
        map.put("bhavna",1300);
        map.put("james",1400);
        map.put("micael",1500);
        map.put("tom",1600);
        map.put("daniel",1700);
		
        Map.Entry<String,Integer> finalResult = map.entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> -entry.getValue())) // minus make it to do in desc order
                .toList()
                .get(1); // index starts from 0
        
        Map.Entry<String,Integer> finalResultAnotherWay = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())) // minus make it to do in desc order
                .toList()
                .get(1); 
        

		LinkedHashMap<String, Integer> sortedMap = map.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		    .collect(Collectors.toMap(
		        Map.Entry::getKey,
		        Map.Entry::getValue,
		        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("anil",1000);
        map2.put("ankit",1200);
        map2.put("bhavna",1200);
        map2.put("james",1200);
        map2.put("micael",1000);
        map2.put("tom",1300);
        map2.put("daniel",1300);
        
        // invert the map as below -
        //finalResult = [1000=[micael, anil], 1200=[ankit, james, bhavna], 1300=[daniel, tom]]
        
        Map<Integer,List<String>> interimResult = 
		   map2.entrySet()
		    .stream()
		    .collect(Collectors.groupingBy(entry ->entry.getValue(),
		          Collectors.mapping(entry -> entry.getKey(),Collectors.toList())
		    ));
        
        
        // Now we just need to sort the map based on keys now. This can be easily done with below line of code.

        List<Map.Entry<Integer, List<String>>> finalResult2 = map2.entrySet()
        	      .stream()
        	      .collect(Collectors.groupingBy(entry ->entry.getValue(),
        	          Collectors.mapping(entry -> entry.getKey(),Collectors.toList())
        	          ))
        	      .entrySet()
        	      .stream()
        	      .sorted(Comparator.comparing(it -> -it.getKey())) // minus sign for decreasing order
        	      .toList();
        
        
        // final code
        
        Map.Entry<Integer,List<String>> finalResult3 = map2.entrySet()
                .stream()
                .collect(Collectors.groupingBy(entry ->entry.getValue(),
                                Collectors.mapping(entry -> entry.getKey(),Collectors.toList())
                                ))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(it -> it.getKey()))
                .toList()
                .get(1);
	}

}
