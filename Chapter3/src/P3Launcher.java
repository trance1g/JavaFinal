import java.util.Scanner;

public class P3Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner initialization
		Scanner keyboard = new Scanner(System.in);
		//input variables
		String inputName;
		String inputAddress;
		int inputAge;
		String inputPhone;
		
		//get input
		System.out.println("What is your name: ");
		inputName = keyboard.nextLine();
		
		System.out.println("What is your address: ");
		inputAddress = keyboard.nextLine();
		
		System.out.println("What is your age: ");
		inputAge = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("What's your phone number: ");
		inputPhone = keyboard.nextLine();
		
		//instantiate object
		P3 person1 = new P3(inputName, inputAddress, inputAge, inputPhone);
		
		System.out.println("What is your name: ");
		inputName = keyboard.nextLine();
		
		System.out.println("What is your address: ");
		inputAddress = keyboard.nextLine();
		
		System.out.println("What is your age: ");
		inputAge = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("What's your phone number: ");
		inputPhone = keyboard.nextLine();
		
		P3 person2 = new P3(inputName, inputAddress, inputAge, inputPhone);
		
		System.out.println("What is your name: ");
		inputName = keyboard.nextLine();
		
		System.out.println("What is your address: ");
		inputAddress = keyboard.nextLine();
		
		System.out.println("What is your age: ");
		inputAge = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("What's your phone number: ");
		inputPhone = keyboard.nextLine();
		
		P3 person3 = new P3(inputName, inputAddress, inputAge, inputPhone);
		
		//show output
		System.out.println();
		System.out.println("Name: " + person1.getName());
		System.out.println("Address: " + person1.getAddress());
		System.out.println("Age: " + person1.getAge());
		System.out.println("Phone Number: " + person1.getPhone());
		
		System.out.println();
		System.out.println("Name: " + person2.getName());
		System.out.println("Address: " + person2.getAddress());
		System.out.println("Age: " + person2.getAge());
		System.out.println("Phone Number: " + person2.getPhone());
		
		System.out.println();
		System.out.println("Name: " + person3.getName());
		System.out.println("Address: " + person3.getAddress());
		System.out.println("Age: " + person3.getAge());
		System.out.println("Phone Number: " + person3.getPhone());
	}

}
