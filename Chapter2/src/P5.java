import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring variables
		double cookies, calories;
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//get input
		System.out.println("Enter the number of cookies you actually ate: ");
		cookies = keyboard.nextDouble();
		
		//calculate for calories
		calories = cookies * (300 / 4);
		
		//show results to console
		System.out.println("You have consumed " + cookies + " cookies which equals " + calories + " calories");
		
		
		//close keyboard method
		keyboard.close();
		

	}

}
