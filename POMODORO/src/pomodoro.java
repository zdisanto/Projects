//************************************************************
// pomodoro.java					author: Zo DiSanto
//
// creates a timer in set intervals with a set 
// break to achieve better efficiency when studying.
//************************************************************

import java.util.Scanner;
class pomodoro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// variables:
		int inputSt; //inputSt = input for study time
		int inputBr; //inputBr = input for break time
		
		//Studying time:
		System.out.println("========================================");
		System.out.println("    Welcome to the POMODORO Timer!		");
		System.out.println("========================================");
		System.out.println(" How long would you like to study for?  ");
		System.out.println("Type: ");
		System.out.println("15 - for 15 minutes of studying");
		System.out.println("30 - for 30 minutes of studying");
		System.out.println("60 - for 1 hour of studying");
		System.out.println("========================================");
		inputSt = scan.nextInt();
		
		//Break time:
		System.out.println("========================================");
		System.out.println("Now, how long would you like to break for?");
		System.out.println("Type: ");
		System.out.println("5  - for 5 minutes of break time");
		System.out.println("10 - for 10 minutes of break time");
		System.out.println("15 - for 15 minutes of break time");
		System.out.println("========================================");
		inputBr = scan.nextInt();
		
		//Output before timer starts...
		System.out.println("Great! Let's study for " + inputSt + " minutes");
		System.out.println("and break for for " + inputBr + " minutes!");

		//Let's get down to business:
		while (inputSt != -1 || inputBr != -1) {
			//Study Choices:
			if(inputSt == 15) {
				System.out.println("Let's start!");
				pomoTimer time = new pomoTimer();
				time.printTime();
				for(int i = 0; i < 15; i++) {
						time.tick(); // Each tick = 1 second
						time.printTime();
				}
				System.out.println("========================================");
			}else if(inputSt == 30) {
				System.out.println("Let's start!");
				pomoTimer time = new pomoTimer();
				time.printTime();
				for(int i = 0; i < 30; i++) {
						time.tick();
						time.printTime();
				}
				System.out.println("========================================");		
			}else if(inputSt == 60) {
				System.out.println("Let's start!");
				pomoTimer time = new pomoTimer();
				time.printTime();
				for(int i = 0; i < 60; i++) {
						time.tick();
						time.printTime();
				}
				System.out.println("========================================");
			}else {
				System.out.println("Invalid input. Try again.");
				System.out.println("========================================");
				System.out.println("How long would you like to break for?");
				System.out.println("Type: ");
				System.out.println("5  - for 5 minutes of break time");
				System.out.println("10 - for 10 minutes of break time");
				System.out.println("15 - for 15 minutes of break time");
				System.out.println("========================================");
				inputSt = scan.nextInt();
			}
			//Break Choices:
			if(inputBr == 5) {
				System.out.println("Break time!");
				pomoTimer time = new pomoTimer();
				time.printTime();
				for(int i = 0; i < 5; i++) {
						time.tick();
						time.printTime();
				}
				System.out.println("========================================");
			}else if(inputBr == 10) {
				System.out.println("Break time!");
				pomoTimer time = new pomoTimer();
				time.printTime();
				for(int i = 0; i < 10; i++) {
						time.tick();
						time.printTime();
				}
				System.out.println("========================================");
			}else if(inputBr == 15) {
				System.out.println("Break time!");
				pomoTimer time = new pomoTimer();
				time.printTime();
				for(int i = 0; i < 15; i++) {
						time.tick();
						time.printTime();
				}
				System.out.println("========================================");
			}else {
				System.out.println("Invalid input. Try again.");
				System.out.println("========================================");
				System.out.println(" How long would you like to study for?  ");
				System.out.println("Type: ");
				System.out.println("15 - for 15 minutes of studying");
				System.out.println("30 - for 30 minutes of studying");
				System.out.println("60 - for 1 hour of studying");
				System.out.println("========================================");
				inputBr = scan.nextInt();
			}
			//Exit:
			if(inputSt == -1 || inputBr == -1) {
				System.out.println("Good bye!");
			}
			System.out.println("Good bye!");
			break;
		}			
	}
}