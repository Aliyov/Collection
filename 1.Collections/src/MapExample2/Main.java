package MapExample2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Map<String, Person> people = new HashMap<>();
		people.put("ALCSMT", new Person("Alice","Smith"));
		people.put("RBTGRN", new Person("Robert","Green"));
		
		//Print all people
		for(Person p: people.values()) {
			System.out.println(p);
		}
		// Print all SSNs
		for (String ssn : people.keySet()) {
            System.out.println(ssn);
		}
		//System

	}

}
