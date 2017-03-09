import java.util.Scanner;
import javax.swing.JOptionPane;
public class DialogExample {

	public static void main(String[] args) {
		String name;
		String name1 = "Brad";
		Scanner keyboard = new Scanner(System.in);
		
		/*System.out.println("What is your name?");
		name = keyboard.nextLine();

		if(name.equals(name1)){
			System.out.println("Welcome, " + name1 + "you are authorized to be here");
		}else{ System.out.println("You are not authorized to be here, please leave");
		
		keyboard.close();*/
		
		name = JOptionPane.showInputDialog("What is your name?");
		if(name.equals(name1)){
			JOptionPane.showMessageDialog(null, "Welcome, " + name1 + " you are authorized to be here");
			
		}else{JOptionPane.showMessageDialog(null, "You are not authorized to be here, please leave");
		}
		}
	}