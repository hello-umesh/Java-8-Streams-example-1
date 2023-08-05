package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Misc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. find occurrence of an element in an array or list
		int a[] = {1, 3,56,34,3,1,67};
		
		List<Integer> list = Arrays.stream(a).filter(m -> m==2).boxed().collect(Collectors.toList());
		
		String[] str = {"q","g","q","f","w","q"};
		
		System.out.println(Arrays.stream(str).filter(m-> m.equals("q")).collect(Collectors.toList()));
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		Iterator<Map.Entry<Integer, String>> map = mp.entrySet().iterator();
		
		while (map.hasNext()){
			map.next();
		}
		
		
		for(Map.Entry<Integer, String> val : mp.entrySet()) {
			val.getKey();
			val.getValue();
		}

		//System.out.println("calling the overloaded methods" + new Misc().add(11, 11));  /
		// this will throw compilation error due to ambiguous call

		String str22 = "helyylogfyhrnjhelylogftuhfnnhello";
		String find = "hello";
		String[] abc = str22.split("hello");
		
		System.out.println(abc.length);
		
		String strNew = "race";
		System.out.println(strNew.chars().mapToObj(c -> (char) c).sorted() // stream of character
				.map(c->c.toString())//stream of string
				.collect(Collectors.joining()));
		
		String s1 = "race";
		System.out.println(Stream.of(s1.split("")).map(String::toUpperCase)
				.sorted().collect(Collectors.joining()));
		
		int i = 15623;
		IntSummaryStatistics nn = Stream.of(String.valueOf(i).split(""))
				.collect(Collectors.summarizingInt(Integer::parseInt));
        
		 int[] array = new int[] {5, 1, 7, 3, 9, 6};
         
	     int[] reversedArray = IntStream.rangeClosed(1, array.length)
	    		 .map(it -> array[array.length - it]).toArray();
	     
	     String str33 ="1234";
	     int xxuu = Stream.of(str33).map(Integer::parseInt).findAny().get();
	     System.out.println(xxuu);
	     
		
		String x = "abc";
		String y = "abc";
		String strxy = x.concat(y);
		System.out.println(x + "==" + strxy);
		
		System.out.println(10 * 20 + "Javatpoint");   
	     System.out.println("Javatpoint" + 10 * 20);  
	     

	     int arr[] = {1,0,1,0,1,0,1,0};
	     System.out.println(Arrays.stream(arr).sorted().boxed().collect(Collectors.toList()));
	     
	}
	
	public double add(int a, double b){
		return a+b;
	}
	public double add(double a, int b){
		return a+b;
	}

}
