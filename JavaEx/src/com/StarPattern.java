package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		String n = "abcdefghu";
		
		for( int i=1 ; i< n.length() ; i++ )
			 for( int j= 1 ; j<= i ; j++) {
				 System.out.println("J=" +j);
			 }
	int arr[] = {1,0,1,0,1,0};
	System.out.println(IntStream.of(arr).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
	
	List<Integer> list = new ArrayList<>();
	
	System.out.println(Arrays.stream(arr).average().getAsDouble());
	
	Collections.reverse(list);
	//list.add
	}

}
