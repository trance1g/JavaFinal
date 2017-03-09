import java.util.Scanner;

public class P1Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String testName;
		String testId;
		String testDept;
		String testPosition;
		int ID;
		
		System.out.println("Enter your name: ");
		testName = keyboard.nextLine();
		
		System.out.println("Enter your ID Number: ");
		testId = keyboard.nextLine();
		
		System.out.println("Enter your department: ");
		testDept = keyboard.nextLine();
		
		System.out.println("Enter your position: ");
		testPosition = keyboard.nextLine();
		
		ID = Integer.parseInt(testId);
		P1 employee = new P1(testName, ID, testDept, testPosition);
		P1 employee2 = new P1("Susan Meyers", 47899, "Accounting", "Vice President");
		P1 employee3 = new P1("Mark Jones", 39119, "IT", "Programmer");
		P1 employee4 = new P1("Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		System.out.println();
		System.out.println("Name: " + employee.getName());
		System.out.println("ID Number: " + employee.getIdNumber());
		System.out.println("Department: " + employee.getDepartment());
		System.out.println("Position: " + employee.getPosition());
		
		System.out.println();
		System.out.println("Name: " + employee2.getName());
		System.out.println("ID Number: " + employee2.getIdNumber());
		System.out.println("Department: " + employee2.getDepartment());
		System.out.println("Position: " + employee2.getPosition());
		
		System.out.println();
		System.out.println("Name: " + employee3.getName());
		System.out.println("ID Number: " + employee3.getIdNumber());
		System.out.println("Department: " + employee3.getDepartment());
		System.out.println("Position: " + employee3.getPosition());
		
		System.out.println();
		System.out.println("Name: " + employee4.getName());
		System.out.println("ID Number: " + employee4.getIdNumber());
		System.out.println("Department: " + employee4.getDepartment());
		System.out.println("Position: " + employee4.getPosition());
		
	}

}
