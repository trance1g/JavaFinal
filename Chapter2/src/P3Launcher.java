import java.util.Scanner;

public class P3Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		String name, address, city, state, zip, phone, major;
		
		//initialize keyboard method from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = keyboard.nextLine();
		System.out.println("Enter your address: ");
		address = keyboard.nextLine();
		System.out.println("Enter your city: ");
		city = keyboard.nextLine();
		System.out.println("Enter your state: ");
		state = keyboard.nextLine();
		System.out.println("Enter your zip: ");
		zip = keyboard.nextLine();
		System.out.println("Enter your phone number: ");
		phone = keyboard.nextLine();
		System.out.println("Enter your major: ");
		major = keyboard.nextLine();
		
		
		//display results to screen
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Zip: " + zip);
		System.out.println("Phone: " + phone);
		System.out.println("Major: " + major);
		
		//close keyboard method
		keyboard.close();

	}

}
