	import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enable keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		double input, initialStockTotal, laterStockTotal, initialComission, laterComission, total;
		
		//get input
		System.out.println("Enter the amount of stocks: ");
		input = keyboard.nextDouble();
		
		//math
		initialStockTotal = input * 32.87;
		initialComission = initialStockTotal * 0.02;
		
		//math
		laterStockTotal = input * 33.92;
		laterComission = laterStockTotal * 0.02;
		
		total = (laterStockTotal - laterComission ) - (initialStockTotal - initialComission );
		
		//print results to screen
		System.out.println("Paid amount is $ " + initialStockTotal);
		System.out.println("Amoutn paid to broker when buying stocks was $ " + initialComission);
		System.out.println("The amount stocks were sold for was $ " + laterStockTotal);
		System.out.println("The comission for selling the stocks was $ " + laterComission);
		System.out.println("The total profit for the transaction was $ " + total);
		
		//close keyboard scanner
		keyboard.close();

	}

}
