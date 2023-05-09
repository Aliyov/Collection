package Map;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		//Create new hashMap
		HashMap<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("Ali", 4406792);
		phoneBook.put("Emin", 139137);
		phoneBook.put("Etimad", 78127182);
		phoneBook.put("Altun", 1267128);
		
		// get the phone number of Ali
		int aliPhoneNumber = phoneBook.get("Ali");
		System.out.println("Ali phone number: " + aliPhoneNumber);
		
		//Check if phone book contains Bob?
		boolean containsBob = phoneBook.containsKey("Bob");
		System.out.println("Does the phone book contain Bob? " + containsBob);
		
		//remove an entry from text book
		phoneBook.remove("Emin");
		
		//Print all
		for(String name : phoneBook.keySet()) {
			int phoneNumber = phoneBook.get(name);
			System.out.println(name + "'s phone number is " + phoneNumber);
		}
		
		
	}

}
