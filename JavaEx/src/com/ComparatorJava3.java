package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorJava3 {

	public static void main(String[] args) {
		// Converting a Stream into a Collection
		// Use the toList, toSet, or toCollection methods in the Collectors utility class.
		
		
		// 1.
		List<String> superHeroes =
				 Stream.of("Mr. Furious", "The Blue Raja", "The Shoveler",
				 "The Bowler", "Invisible Boy", "The Spleen", "The Sphinx")
				 .collect(Collectors.toList());
		System.out.println(superHeroes);
		
		// 2.
		Set<String> villains =
				 Stream.of("Casanova Frankenstein", "The Disco Boys",
				 "The Not-So-Goodie Mob", "The Suits", "The Suzies",
				 "The Furriers", "The Furriers")
				 .collect(Collectors.toSet());
		System.out.println(villains);
		
		//Both of these examples used the default data structures—ArrayList for List, and
		//HashSet for Set. If you wish to specify a particular data structure, you should use the
		//Collectors.toCollection method, which takes a Supplier as an argument.
		
		//3.
		List<String> actors =
				 Stream.of("Hank Azaria", "Janeane Garofalo", "William H. Macy",
				 "Paul Reubens", "Ben Stiller", "Kel Mitchell", "Wes Studi")
				 .collect(Collectors.toCollection(LinkedList::new));
				
		
		// 4.
		// The Collectors class also contains a method to create an array of objects. There are
		// two overloads of the toArray method:
		// Object[] toArray();
		// <A> A[] toArray(IntFunction<A[]> generator);
		
		// The former returns an array containing the elements of this stream, but without spec‐
		//ifying the type. The latter takes a function that produces a new array of desired type
		//with length equal to the size of the stream, and is easiest to use with an array con‐
		//structor reference as shown in Example 4-11.
		//Example 4-11. Creating an array
		
		String[] wannabes =
		 Stream.of("The Waffler", "Reverse Psychologist", "PMS Avenger")
		 .toArray(String[]::new);
		
		// Array constructor reference as a Supplier
		
		/* Set<Actor> actors = mysteryMen.getActors();
		Map<String, String> actorMap = actors.stream()
		 .collect(Collectors.toMap(Actor::getName, Actor::getRole));
		actorMap.forEach((key,value) ->
		 System.out.printf("%s played %s%n", key, value)); */
		
	}

}
