import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		//declare variables
		double meal, tax, tip, total;
		
		
		//getinput
		System.out.println("Enter the amount of meal cost: ");
		meal = keyboard.nextDouble();
		
		//calculate tax and tip
		tax = meal * 0.075;
		tip = meal * 0.18;
		
		total = meal + tax + tip;
		
		//display results to user
		System.out.println("The meal charge was $" + meal + " , tip was $" + tip + ", tax was $" + tax + " with a grand total of $" + total );
		
		
		
		
		//close keyboard input
		keyboard.close();

	}

}
