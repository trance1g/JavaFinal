import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		//declare variables
		String favCity;
		
		//get input
		System.out.println("Name your favorite city: ");
		favCity = keyboard.nextLine();
		
		//display results to user
		System.out.println("The number of characters: " + favCity.length());
		System.out.println("Name of the city capitalized: " + favCity.toUpperCase());
		System.out.println("Name of city in lower case: " + favCity.toLowerCase());
		System.out.println("The first letter is: " + favCity.charAt(0));
		
		//close keyboard input
		keyboard.close();

	}

}
