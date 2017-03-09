import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		double sales, input;
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//get input
		System.out.println("Enter the amount of sales: ");
		input = keyboard.nextDouble();
		//calculate sales
		sales = input * (0.65);
		//show results to console
		System.out.println("East Coast Company Division sales is: $" + sales);
		
		//close keyboard method
		keyboard.close();
		
		

	}

}
