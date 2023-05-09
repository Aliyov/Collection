import java.util.*;
public class ArrListExample1 {

	public static void main(String[] args) {
		//Creating an array list 
		List<String> fruits = new ArrayList<>();
		
		
		//Addind elements to list
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Mango");
		fruits.add("BlueBerry");
		fruits.add("Orange");
		fruits.add("Strawberry");
		fruits.add("Peaces");
		
		//print the list
		
		System.out.println("Fruits: " +fruits);
		
		//Accessing first element of array
		
		System.out.println("Fruit in first position: " + fruits.get(0));
		
		//remove 2,3 fruits from the list
		
		fruits.remove(2);
		fruits.remove(2);
		System.out.println("Fruits: " +fruits);
		
		//Set first fruit to grape
		fruits.set(0, "Grapes");
		System.out.println("Fruits: " +fruits);
		
		// Getting the size of the ArrayList
		System.out.println("Size of fruits ArrayList: " + fruits.size());
		
		//Sort by alphabetical order
		Collections.sort(fruits);
		System.out.println("Sorted Fruits: " +fruits);
		
		//List line by line
		fruits.forEach(System.out::println);
		
	}

}
