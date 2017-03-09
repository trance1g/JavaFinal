import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		double sugar, butter, flour, input;
		
		//get input
		System.out.println("How many cookies would you like to make? ");
		input = keyboard.nextDouble();
		
		//calculate amounts for each ingredient
		sugar = input * (1.5 / 48);
		butter = input * (1.0 / 48);
		flour = input * (2.75 / 48);
		
		//display results to user
		System.out.println("To make " + input + " cookies you will need " + sugar + " cups of sugar, " + butter + " cups of butter, and " + flour + " cups of flour");
		
		
		
		//close keyboard input
		keyboard.close();

	}

}
