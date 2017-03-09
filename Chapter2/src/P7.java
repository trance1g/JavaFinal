import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate keyboard scanner from scanner class
		Scanner keyboard = new Scanner(System.in);
		//declare variables
		double sqft, acres;
		
		//get input
		System.out.println("How many Square feet of land? ");
		sqft = keyboard.nextDouble();
		
		//calculate acres
		acres = sqft / 43560;
		
		//show results to display in console
		System.out.println("Your " + sqft + " square feet of land is equivalent to " + acres + " acres of land");
		
		//close keyboard input
		keyboard.close();

	}

}
