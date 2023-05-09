
public class Horse extends Animal implements Pet, Vehicle {
	public Horse(String color) {
		super(color,4);
	}

	@Override
	public void cuddling() {
		if(!isAlive()) {
			System.out.println("I AM DEAD");
			System.out.println(" ");
		}else if(vitality+15>maxVitality) {
			vitality = maxVitality;
			System.out.println("I love cuddling");
			System.out.println(" ");
		}else {
			vitality = vitality + 15;
			System.out.println("I love cuddling");
			System.out.println(" ");
		}
		
	}

	@Override
	public void eat() {
		if(!isAlive()) {
			System.out.println("Too late... I am dead :(");
			System.out.println(" ");
		}else if(vitality+20>maxVitality) {
			vitality = maxVitality;
			System.out.println("Food is good!");
			System.out.println(" ");
		}else {
			vitality = vitality + 20;
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
			System.out.println("Aheaddd!!!!!");
			System.out.println(" ");
			vitality = vitality - 12*numberOfLimbs;
		}
		
	}

	@Override
	public void makeNoise() {
		if(!isAlive()) {
			System.out.println("Too late... I am dead :(");
			System.out.println(" ");
		}else {
			System.out.println("HIIIIII");
			System.out.println(" ");
			vitality = vitality -10;
		}
	}

	@Override
	public void ride() {
		System.out.println("You are riding this horse.");
		move();
	}

	@Override
	public void getOff() {
		System.out.println("Getting off the horse.");
		cuddling();	
	}

	
}
