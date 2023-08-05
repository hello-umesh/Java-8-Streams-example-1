package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrintAlternateJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.stream().filter(index -> index%2 ==0)
		.forEach(System.out::println);
		
		IntStream.range(0, list.size())
		.filter(index-> index%2==0)
        .forEach(index ->System.out.println(String.format("[%d] : %s", index, list.get(index))));

	}

}
