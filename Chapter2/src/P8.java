import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//declaring variables
		double input, state, county, taxtotal, total;
		
		//get input
		System.out.println("Enter the cost: ");
		input = keyboard.nextDouble();
		
		//calculate taxes
		state = input * 0.055;
		county = input * 0.02;
		
		taxtotal = state + county;
		
		total = input + taxtotal;
		
		//show results to display on screen
		System.out.println("When spending $" + input + " on a purchase, the state tax would be $" + state + " , county tax would be $" + county + " which combines to be $" + taxtotal + " , and the total cost would be $" + total);
		
		
		//close keyboard input
		keyboard.close();
		

	}

}
