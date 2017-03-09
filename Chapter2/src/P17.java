import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		String name, age, city, college, profession, animal, petName;
		
		//get inputs for each field
		System.out.println("Enter your name: ");
		name = keyboard.nextLine();
		System.out.println("Enter your age: ");
		age = keyboard.nextLine();
		System.out.println("Enter a name of a city: ");
		city = keyboard.nextLine();
		System.out.println("Enter the name of a college: ");
		college = keyboard.nextLine();
		System.out.println("Enter a profession: ");
		profession = keyboard.nextLine();
		System.out.println("Enter a type of animal: ");
		animal = keyboard.nextLine();
		System.out.println("Enter a name of your pet: ");
		petName = keyboard.nextLine();
		
		//display results to user
		System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ",\n " + name + " went to college at " + college + ". " + name + " graduated and went to work as a\n " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived\n happily ever after!");
		
		//close keyboard input
		keyboard.close();

	}

}
