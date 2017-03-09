import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		 double t1, t2, t3, average;
		 
		 //get input
		 System.out.println("Enter test 1 score: ");
		 t1 = keyboard.nextDouble();
		 System.out.println("Enter test 2 score: ");
		 t2 = keyboard.nextDouble();
		 System.out.println("enter test 3 score: ");
		 t3 = keyboard.nextDouble();
		 
		 //calculate average
		 average = (t1 + t2 + t3) / 3;
		 
		 //show results to user
		 System.out.println("The average of " + t1 + " , " + t2 + " , and " + t3 + " is a " + average);
		
		
		
		//close keyboard input
		keyboard.close();

	}

}
