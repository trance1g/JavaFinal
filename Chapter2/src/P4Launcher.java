
public class P4Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create for loop to make 7 lines of content
		for(int x = 1; x <= 7; x++){
			//if the loop is 1 or 7
			if(x == 1 || x == 7){
				//print a star in the middle
				System.out.println("   *   ");
			}
		else if(x == 2 || x == 6){
			//if the count is 2 or 6 print three in the middle
			System.out.println("  ***  ");
		}else if(x == 3 || x == 5){
			//if the count is 3 or 5 print 5 in the middle
			System.out.println(" ***** ");
		}else {
			//everything else, print all 7 stars
			System.out.println("*******");
		}
	
	}

	}
}


