import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		char userChoice;
		
		do {
		// 1. prompt user to enter a number between 1 and 100. 
		// 2. get user input (scanner) / create object
		// 3. assign variable
		
		// prompt user to continue
		System.out.println("Do you want to continue using my cool program? Enter y for Yes, or n for No.");
		
		//get user input
		String choice = scan.nextLine();
		userChoice = choice.charAt(0);	
		
		// prompt user to enter a number between 1 and 100.
		System.out.println("Please enter a number between 1 and 100.");
		// get user input (scanner) / create object
		Scanner scnr = new Scanner(System.in);
		// assign variable
		int userNum;
		userNum = scnr.nextInt();
		// display result based on integer range entered.

		// if integer is odd print number and the word odd.
		if (userNum % 2 != 0) {
			System.out.println(userNum + " Odd");
		}
		// if integer is even and in the range of 2 to 25 print even and less than 25
		else if ((userNum % 2 == 0) && (userNum > 2) && (userNum < 25)) {
			System.out.println("Even and less than 25.");
		}
		// if integer is even and in the range of 26 to 60 print even
		else if ((userNum % 2 == 0) && (userNum > 26) && (userNum < 60)) {
			System.out.println("Even and less than 25.");
		}
		// if integer is odd and greater than 60 print print the number entered & odd
		// over 60
		else if ((userNum % 2 != 0) && (userNum > 60)) {
			System.out.println(userNum + " Odd and over 60.");
		}
		
		}while (userChoice == 'y'); 
		
		System.out.println("Thank you for using our program!");
	}
}