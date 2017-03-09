import java.util.Scanner;

public class PC2Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		//declare variables
		String firstName, middleName, lastName, input;
		char fInit, mInit, lInit;
		
		//initialize keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		//get input
		System.out.println("Enter your first name: ");
		firstName = keyboard.nextLine();
		System.out.println("Enter your middle name: ");
		middleName = keyboard.nextLine();
		System.out.println("Enter your last name: ");
		lastName = keyboard.nextLine();
		
		//get input
		System.out.println("Enter your first initial: ");
		input = keyboard.nextLine();
		fInit = input.charAt(0);
		System.out.println("Enter your middle initial: ");
		input = keyboard.nextLine();
		mInit = input.charAt(0);
		System.out.println("Enter your last initial: ");
		input = keyboard.nextLine();
		lInit = input.charAt(0);
		
		
		//display results to screen
		System.out.println("First name: " + firstName + " Middle Name: " + middleName + " Last name: " + lastName);
		System.out.println("First Initial: " + fInit + " Middle Initial: " + mInit + " Last Initial: " + lInit);
		
		//close keyboard scanner
		keyboard.close();
		
	}

}
