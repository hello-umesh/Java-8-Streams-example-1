package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorJava2 {

	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Golfer> golfers = Arrays.asList(
				 new Golfer("Jack", "Nicklaus", 68),
				 new Golfer("Tiger", "Woods", 70),
				 new Golfer("Tom", "Watson", 70),
				 new Golfer("Ty", "Webb", 68),
				 new Golfer("Bubba", "Watson", 70)
				);
		List<Golfer> gList = golfers.stream()
		 .sorted(Comparator.comparingInt(Golfer::getScore)
				 .thenComparing(Golfer::getLast)
				 .thenComparing(Golfer::getFirst))
		 .collect(Collectors.toList());
		
		System.out.println(gList);

		List<String> sampleStrings =
				 Arrays.asList("this", "is", "a", "list", "of", "strings");
		
		List<String> list = sampleStrings.stream()
		 .sorted(Comparator.comparing(String::length)
		 .thenComparing(Comparator.naturalOrder()))
		 .collect(Collectors.toList());

		System.out.println(list);
	}

}

 class Golfer {
	 private String first;
	 private String last;
	 private int score;
	 // ... other methods ...
	 Golfer(){}
	 Golfer(String first, String last, int score) {
		 this.first = first;
		 this.last = last;
		 this.score = score;
	 }
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return this.first +" " + this.last + " " + this.score;
	}
	}

