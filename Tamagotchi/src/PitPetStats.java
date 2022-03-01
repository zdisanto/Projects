public class PitPetStats {
	//define defaults
	String name;
	String type; 
	String color;
	int age;
	int happiness;
	int hunger;
	boolean sick;
	
	//create object
	public PitPetStats(String name, String type, String color) {
		this.name = name;
		this.type = type;
		this.color = color;
		age = 0;
		happiness = 1;
		hunger = 1;
		sick = false;
	}

	//display stats
	public void displayStats() {
		System.out.println("Your tamogotchi's name is " + name + ".");
		System.out.println("Your tamogotchi is a " + type + ".");
		System.out.println("The tamogotchi is " + color + ".");
		System.out.println("The tamogotchi's age is " + age + ".");
		System.out.println("The tamogotchi's happiness is " + happiness + ".");
		System.out.println("The tamogotchi's hunger is " + hunger + ".");
	}

	//name
	public String getName(String newName) {
		name = newName;
		return name;
	}
	//type
	public String getType(String newType) {
		type = newType;
		return type;
	}
	//color
	public String getColor(String newColor) {
		color = newColor;
		return color;
	}
	//age
	public int getAge(int newAge) {
		age = newAge;
		return age;
	}
	//happiness level
	public int getHappiness(int newHappiness) {
		happiness = newHappiness;
		return happiness;
	}
	//hunger level
	public int getHunger(int newHunger) {
		hunger = newHunger;
		return hunger;
	}
	//sick or not
	public boolean getSick(boolean sickness) {
		sick = sickness;
		return sick;
	}
}
