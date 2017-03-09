
public class P1 {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public P1(String name, int idNumber, String department, String position) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position; 
		
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setIdNumber(int idNumber){
		this.idNumber = idNumber;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public void setPosition(String position){
		this.position = position;
	}
	
	public String getName(){
		return name;
	}
	public int getIdNumber(){
		return idNumber;
	}
	public String getDepartment(){
		return department;
	}
	public String getPosition(){
		return position;
	}

}
