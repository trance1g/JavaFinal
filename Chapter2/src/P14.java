import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		double input, comission, total;
		
		//getting input and calculating commissions and totals
		System.out.println("Enter the number of stocks: ");
		input = keyboard.nextDouble();
		input = input * 25.5;
		comission = input * 0.02;
		total = input + comission;
		
		//display results to user
		System.out.println("The purchase price for the stock was $" + input + ", comission was $" + comission + ", with a grand total of $" + total);
		
		//close keyboard input
		keyboard.close();

	}

}
