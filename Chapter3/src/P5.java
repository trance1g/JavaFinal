
public class P5 {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public P5(String description, int unitsOnHand, double price) {
		// TODO Auto-generated constructor stub
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
		
	}
	
	public void setDesc(String description){
		this.description = description;
	}
	
	public void setUnits(int unitsOnHand){
		this.unitsOnHand = unitsOnHand;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getDesc(){
		return description;
	}
	
	public int getUnits(){
		return unitsOnHand;
	}
	
	public double getPrice(){
		return price;
	}

}
