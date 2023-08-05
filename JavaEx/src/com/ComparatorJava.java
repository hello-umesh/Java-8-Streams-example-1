package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorJava {
    public static void sortByName(List<SuperHero> superHeroes) {
        // Comparator to sort by name ascending
        Comparator<SuperHero> nameComparator = (SuperHero s1, SuperHero s2) ->
        {
            return s1.getName().compareTo(s2.getName());
        };
        
        superHeroes.sort(nameComparator);
    }
    
    public static void sortByAge(List<SuperHero> superHeroes) {
        // Comparator to sort by age ascending
        Comparator<SuperHero> ageComparator = (SuperHero s1, SuperHero s2) -> 
        {
            return s1.getAge() - s2.getAge();
        };
        
        superHeroes.sort(ageComparator);
    }
    
    public static void main(String[] args) {
        List<SuperHero> superHeroes = new ArrayList<>();

        superHeroes.add(new SuperHero("2", "Iron Man", 35));
        superHeroes.add(new SuperHero("1", "Captain America", 25));
        superHeroes.add(new SuperHero("3", "Hulk", 20));

        System.out.println("Sorting By Name Ascending...");
        sortByName(superHeroes);
        superHeroes.forEach(superHero -> 
                            System.out.println(superHero.toString()));
        
        System.out.println("");
        
        System.out.println("Sorting By Age Ascending...");
        sortByAge(superHeroes);
        superHeroes.forEach(superHero -> 
                            System.out.println(superHero.toString()));
    }
}

class SuperHero {
    private final String id;
    private final String name;
    private final int age;
    
    /* class constructor */
    public SuperHero(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public String getId() { return this.id; } // getId function
    
    public String getName() { return this.name; } // getName function
    
    public int getAge() { return this.age; } // getAge function
    
    @Override
    public String toString() {
        return String.format("ID: %s | name: %s | Age: %d", id, name, age);
    }
}

