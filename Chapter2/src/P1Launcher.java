import java.util.Scanner;

public class P1Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring variables
		String name;
		int age;
		double annualPay;
		
		//enabling keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		//printing each field to the prompt and retrieving the input
		System.out.println("Enter your name: ");
		name = keyboard.nextLine();
		System.out.println("Enter your age: ");
		age = keyboard.nextInt();
		System.out.println("Enter your annual desired income: ");
		annualPay = keyboard.nextDouble();
		
		//print results to screen
		System.out.println("My name is " + name + ", my age is " + age + " and ");
		System.out.println("I hope to earn $" + annualPay + " per year.");
		//close keyboard scanner
		keyboard.close();

	}

}
