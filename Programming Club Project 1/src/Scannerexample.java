import java.util.Scanner;


public class Scannerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How many licks does it take to get to the tootsie roll center of a tootsie pop?");
		String number = scan.nextLine();
		if (number.equals("3")) 
				System.out.println("You're right!");
		else{
			
			System.out.println("NO, not " + number + ". It takes 3!");
			try {
		    Thread.sleep(4000);               
			} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
			}
			System.out.println("YOU'RE A DUMMY");
			try {
		    Thread.sleep(5000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
			}
			System.out.println("FRESHMENS RULZ. GRAMMERZ R GUUD");
		}
		
	}

}
