import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		//declare variables
		double male, female, total, mPerc, fPerc;
		//get input
		System.out.println("Enter the numberof males in the class: ");
		male = keyboard.nextDouble();
		System.out.println("Enter the number of females in the class: ");
		female = keyboard.nextDouble();
		
		//calculate precentages of male and female
		total = male + female;
		mPerc = (male / total) * 100;
		fPerc = (female / total) * 100;
		
		//display results to user
		System.out.println("The class is " + mPerc + " percent male, and " + fPerc + " percent female.");
		
		
		//close keyboard input
		keyboard.close();

	}

}
