import java.util.Scanner;

public class P4Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		double inputTemp;
		
		System.out.println("Enter a Fahrenheit Temperature: ");
		inputTemp = keyboard.nextDouble();
		
		P4 temp1 = new P4(inputTemp);
		
		System.out.println("The temperature you entered is: " + inputTemp);
		System.out.println("Which in Celcius is: " + temp1.getCelsius());
		System.out.println("Which in Kelvin is: " + temp1.getKelvin());
		
	}

}
