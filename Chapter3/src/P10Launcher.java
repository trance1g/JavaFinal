import java.util.Scanner;

public class P10Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//variables
		String inputName;
		String inputType;
		int inputAge;
		//get input
		System.out.println("Pet's name: ");
		inputName = keyboard.nextLine();
		System.out.println("Type of pet: ");
		inputType = keyboard.nextLine();
		System.out.println("Age of pet: ");
		inputAge = keyboard.nextInt();
		
		//instantiate object
		P10 pet1 = new P10();
		pet1.setName(inputName);
		pet1.setType(inputType);
		pet1.setAge(inputAge);
		//show output
		System.out.println("Name: " + pet1.getName());
		System.out.println("Type: " + pet1.getType());
		System.out.println("Age: " + pet1.getAge());
		
		
	}

}
