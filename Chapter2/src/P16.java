import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		//declare variables
		double input, buyers, citrus;
		
		//get input
		System.out.println("How many people are surveyed about the energy drinks? ");
		input = keyboard.nextDouble();
		
		//calculate precentages
		buyers = input * 0.18;
		
		citrus = buyers * 0.58;
		
		//display results to user
		System.out.println("Of the people who took part in the survey, " + buyers + " people buy one or more energy drinks per week and of those people, " + citrus + " prefer to buy citrus flavored drinks");
		
		
		
		//close keyboard ipnut
		keyboard.close();

	}

}
