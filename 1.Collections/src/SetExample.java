import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		//Creating hashSet and adding elements
		Set<String> names = new HashSet<>();
		names.add("Bob");
		names.add("Ali");
		names.add("John");
		names.add("Nadim");
		
		//Creeating LinkedHashSet and adding elements
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Kiwi");
		
		//Creating treeSet and adding elements
		Set<String> cars = new TreeSet<>();
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("Fiat");
		cars.add("Tata");
		
		
		System.out.println("HashSet: " + names);
        System.out.println("LinkedHashSet: " + fruits);
        System.out.println("TreeSet: " + cars);
        
        List<String> boys = new LinkedList<>();
        boys.add("Ali");
        boys.add("EMin");
        boys.add("Baba");
        boys.add("Muzu");
        
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()) {
        	String name = namesIterator.next();
        	System.out.println("Here is names:" + name);
        }
	}

}
