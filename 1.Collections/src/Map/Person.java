package Map;


public class Person {
	public String name;
	public String surname;
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String toString() {
		return "Name is:" + name + "\nSurname is: "+surname;
	}
}
