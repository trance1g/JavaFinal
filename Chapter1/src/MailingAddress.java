
public class MailingAddress {
	int age;
	String name;
	boolean seniorCitizen;
	

	public MailingAddress(String n1, int n2) {
		// TODO Auto-generated constructor stub
		this.name = n1;
		this.age = n2;
		
		if(age >= 60){
			seniorCitizen = true;
		}else {
			seniorCitizen = false;
		}
		
		
		 if(seniorCitizen){
			 System.out.println("Hello " + n1 + " you are " + n2 + " years old which makes you a senior citizen!");
		 }else{
			 System.out.println("Hello " + n1 + " you are " + n2 + " years old which does not make you a senior citizen!");
		 }
		
		
	}

}
