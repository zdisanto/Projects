//************************************************************
// PitPet.java					author: Zo DiSanto
//
// a PitPet is loosely inspired from Tamagotchi where you can  
// water, feed, dust, and even sing to your PitPet.
//************************************************************
import java.util.Scanner;

public class PitPet {
public static void main(String[] args) {
	//define a scanner
	Scanner input = new Scanner(System.in);
	
	
	//INTRO:
	System.out.println("Welcome to PitPet. Press any key to continue the dialog.");
	String ent = input.nextLine();
	System.out.println("Zzzzz...");
	ent = input.nextLine();
	System.out.println("*knock knock*");
	ent = input.nextLine();
	System.out.println("Someone is at your door...");
	ent = input.nextLine();
	System.out.println("You go to open it but no one was there.");
	ent = input.nextLine();
	System.out.println("You look down and there is a box at your feet.");
	ent = input.nextLine();
	System.out.println("You look around but see no one.");
	ent = input.nextLine();
	System.out.println("You decide to take the box inside to open it.");
	ent = input.nextLine();
	System.out.println("Inside is a small pot, some soil, a lamp, a spray bottle, and in the middle, a little pit.");
	ent = input.nextLine();
	System.out.println("You pot the pit and spray it with a bit of water.");
	ent = input.nextLine();
	System.out.println("Where would you like to place your place?");
	System.out.println("Type 1 if you choose to place it under your bed.");
	System.out.println("Type 2 if you choose to place it in the middle of your room.");
	System.out.println("Type 3 if you choose to place it on your desk.");
	System.out.println("Type 4 if you choose to place it by your window.");
	String place = input.nextLine();
	
	//get user input for a name, type, and color
	System.out.println("Please enter a name for your new PitPet: ");
	String name = input.nextLine();
	System.out.println("What type of tamagotchi is " + name + "? You can choose a duck, bear, fresh prince, or temple guard.");
	String type = input.nextLine();
	type = input.nextLine();
	
	System.out.println("What color should " + name + " be?");
	String color = input.nextLine();
	
	//create tamagotchi object
	PitPetStats pitpet = new PitPetStats(name, type, color);

	//print out the tamagotchi's current status
	pitpet.displayStats();
	}
}