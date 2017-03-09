
public class P2 {
	private int yearModel;
	private String make;
	private int speed;
	
	public P2(int yearModel, String make, int speed) {
		// TODO Auto-generated constructor stub
		this.yearModel = yearModel;
		this.make = make;
		this.speed = speed;
		
		
	}
	
	public void accelerate(){
		speed += 5;
	}
	
	public void brake(){
		speed -= 5;
	}

	public void setYear(int yearModel){
		this.yearModel = yearModel;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}

	public int getYear(){
		return yearModel;
	}
	
	public String getMake(){
		return make;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	}
