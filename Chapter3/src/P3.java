
public class P3 {
	//variables
	private String name;
	private String address;
	private int age;
	private String phone;
	
	//constructor
	public P3(String name, String address, int age, String phone) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
	
	}
	//getters and setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getPhone(){
		return phone;
	}
}
