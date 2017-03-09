import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		double miles, gallons, mpg;
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//get input
		System.out.println("How many miles did you drive? ");
		miles = keyboard.nextDouble();
		System.out.println("How many gallons of gas used? ");
		gallons = keyboard.nextDouble();
		
		//calculate mpg
		mpg = miles / gallons;
		
		//display results to user
		System.out.println("Your car has an MPG of " + mpg);
		
		
		
		
		//close keyboard input
		keyboard.close();

	}

}
