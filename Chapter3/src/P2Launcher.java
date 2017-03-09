import java.util.Scanner;

public class P2Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int testYear;
		String testMake;
		int testSpeed;
		
		System.out.println("Enter the year of the car: ");
		testYear = keyboard.nextInt();
		
		
		System.out.println("Enter the make of the car: ");
		testMake = keyboard.nextLine();
		keyboard.nextLine();
		System.out.println("Enter the speed you traveled: ");
		testSpeed = keyboard.nextInt();
		
		P2 car1 = new P2(testYear, testMake, testSpeed);
		
		car1.accelerate();
		System.out.println("The current speed is: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("The current speed is: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("The current speed is: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("The current speed is: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("The current speed is: " + car1.getSpeed());
		
		System.out.println("You braked, the current speed is: " + car1.getSpeed());
		car1.brake();
		System.out.println("You braked, the current speed is: " + car1.getSpeed());
		car1.brake();
		System.out.println("You braked, the current speed is: " + car1.getSpeed());
		car1.brake();
		System.out.println("You braked, the current speed is: " + car1.getSpeed());
		car1.brake();
		System.out.println("You braked, the current speed is: " + car1.getSpeed());
		car1.brake();
	}

}
