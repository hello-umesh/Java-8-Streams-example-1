package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NullSFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("C", null, "B", "D", null, "A", "E");

		List<String> sortedList = names.stream()
		    .sorted(Comparator.nullsFirst(Comparator.naturalOrder()))
		    .collect(Collectors.toList());

		System.out.println(sortedList); 
		
		List<String> names2 = Arrays.asList("C", null, "B", "D", null, "A", "E");

		List<String> sortedList2 = names.stream()
		    .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
		    .collect(Collectors.toList());

		System.out.println(sortedList2);  //[A, B, C, D, E, null, null]
		
		/*
		 * sortedEmployeeList = getEmployeeListWithNullDates().stream()
		 * .sorted(Comparator.comparing(Employee::getDateOfBirth,
		 * Comparator.nullsFirst(Comparator.naturalOrder())))
		 * .collect(Collectors.toList());
		 */
		
		/*
		 * List<Employee> sortedEmployeeList = getEmployeeListWithNullObjects()
		 * .stream() .sorted(Comparator.nullsFirst(new DateOfBirthComparator()))
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(sortedEmployeeList);
		 * 
		 * 
		 * private static List<Employee> getEmployeeListWithNullObjects() {
		 * List<Employee> empList = new ArrayList<>(); empList.add(new Employee(1, "A",
		 * LocalDate.of(1992, 1, 1), 30000d)); empList.add(null); empList.add(new
		 * Employee(3, "C", LocalDate.of(1992, 9, 1), 50000d)); empList.add(null);
		 * empList.add(new Employee(5, "E", LocalDate.of(1992, 8, 1), 60000d)); return
		 * empList; }
		 */
		
		
		/*
		 * sortedEmployeeList = getEmployeeListWithNullDates().stream()
		 * .sorted(Comparator.comparing(Employee::getDateOfBirth,
		 * Comparator.nullsFirst(Comparator.naturalOrder())))
		 * .collect(Collectors.toList());
		 */

	}
	
	public class Employee 
	{
	    private long id;
	    private String name;
	    private LocalDate dateOfBirth;
	    private double salary;

	    //constructors, setters and getters are hidden for brevity

	    @Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", dateOfBirth="
	            + dateOfBirth + ", salary=" + salary + "]";
	    }
	}

}
