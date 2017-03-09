
public class GoldTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_BARS = 567;
		
		final double PURCHASE_PRICE = 11562,
		SELLING_PRICE = 13243,
		BROKER_COMM_RATE = 0.03;
		
		double goldPurchase, 
		purchaseComm, 
		amountPaid, 
		goldSale, 
		sellingComm, 
		amountReceived, 
		profitOrLoss;
		 
	goldPurchase = NUM_BARS * PURCHASE_PRICE;
	purchaseComm = goldPurchase * BROKER_COMM_RATE;
	amountPaid = goldPurchase + purchaseComm;
	goldSale = NUM_BARS * SELLING_PRICE;
	sellingComm = goldSale * BROKER_COMM_RATE;
	amountReceived = goldSale - sellingComm;
	profitOrLoss = (goldSale - goldPurchase) - (purchaseComm + sellingComm);
	
	System.out.printf("Jack paid $%,1.2f for the gold.\n", + goldPurchase);
	System.out.printf("Jack paid his broker a commission of $%,1.2f on the purchase.\n", + purchaseComm);
	System.out.printf("So, Jack paid a total of $%,1.2f\n", + amountPaid);
	System.out.println("\n");
	System.out.printf("Jack sold the gold for $%,1.2f \n", + goldSale);
	System.out.printf("Jack paid his broker a commission of $%,1.2f on the sale\n", + sellingComm);
	System.out.printf("So, Jack received a total of $%,1.2f.\n", amountReceived);
	System.out.println("\n");
	System.out.printf("Jacks profit or loss: $%,1.2f.", + profitOrLoss);
	}

}
