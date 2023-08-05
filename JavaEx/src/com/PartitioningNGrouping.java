package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningNGrouping {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of",
				 "strings", "to", "use", "as", "a", "demo");
				Map<Boolean, List<String>> lengthMap = strings.stream()
				 .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));
				lengthMap.forEach((key,value) -> System.out.printf("%5s: %s%n", key, value));

		List<String> strings2 = Arrays.asList("this", "is", "a", "long", "list", "of",
				 "strings", "to", "use", "as", "a", "demo");
				Map<Integer, List<String>> lengthMap2 = strings2.stream()
				 .collect(Collectors.groupingBy(String::length));
				lengthMap2.forEach((k,v) -> System.out.printf("%d: %s%n", k, v));
				
		
				/*
				 * Map<String, Integer> sortedByValueDesc = mapEx.entrySet() .stream()
				 * .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				 * .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
				 * LinkedHashMap::new));
				 */

	}

}
