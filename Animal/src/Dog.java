
public class Dog extends Animal implements Pet {
	//For class dog eating, sleeping and cuddling +10 vitality
	//Moving decreases the vitality 10*number of limbs :D
	//Making noise decreases -10
	private String name;
	
	public Dog(String name,String color) {
		super(color, 4);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void cuddling() {
		if(!isAlive()) {
			System.out.println("I AM DEAD");
			System.out.println(" ");
		}else if(vitality+10>maxVitality) {
			vitality = maxVitality;
			System.out.println("I love cuddling");
			makeNoise();
			System.out.println(" ");
		}else {
			vitality = vitality + 10;
			System.out.println("I love cuddling");
			makeNoise();
			System.out.println(" ");
		}
		
	}

	@Override
	public void eat() {
		if(!isAlive()) {
			System.out.println("Too late... I am dead :(");
			System.out.println(" ");
		}else if(vitality+10>maxVitality) {
			vitality = maxVitality;
			System.out.println("Food is good!");
			System.out.println(" ");
		}else {
			vitality = vitality + 10;
			System.out.println("Food is good!");
			System.out.println(" ");
		}
	}

	@Override
	public void sleep() {
		if(!isAlive()) {
			System.out.println("I am already sleeping. Forever...");
			System.out.println(" ");
		}else if(vitality+10>maxVitality) {
			vitality = maxVitality;
			System.out.println("ZZZZZ... Good Morning!");
			System.out.println(" ");
		}else {
			vitality = vitality + 10;
			System.out.println("ZZZZ.... Good Morning!");
			System.out.println(" ");
		}
		
	}

	@Override
	public void move() {
		if(!isAlive()) {
			System.out.println("Too late... I am dead :(");
			System.out.println(" ");
		}else {
			System.out.println("I am running in circlessss");
			System.out.println(" ");
			vitality = vitality - 10*numberOfLimbs;
		}
		
	}

	@Override
	public void makeNoise() {
		if(!isAlive()) {
			System.out.println("Too late... I am dead :(");
			System.out.println(" ");
		}else {
			System.out.println("WOOF WOOF");
			System.out.println(" ");
			vitality = vitality -10;
		}
	}

	
	
	
}
