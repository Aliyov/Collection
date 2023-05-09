package Map;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Person> people = new HashMap<>();
		
		people.put("ALCSMT", new Person("Alice","Smith"));
		people.put("RBTGRN", new Person("Robert","Green"));
		
		if(!people.containsKey("BTGRN")) {
			System.out.println("NOT FOUND!");
		}
		
		Person bob = people.get("RBTGRN");
		
		int populationSize = people.size();
		
		
		for(Person p: people.values()) {
			System.out.println(p);
		}
		
		
		
		for(String ssn: people.keySet()) {
			System.out.println(ssn);
		}

	}

}
