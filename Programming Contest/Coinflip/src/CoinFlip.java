import java.util.Scanner;

public class CoinFlip {
	
	/* Given an array of coin positions & instructions on which range of
	 * coins to flip each time, calculate the resulting coin positions
	 * as an array.
	 * 
	 * For instance, given coins = [HHH], flip = [1 1][1 3],
	 * first flip coins from positions 1 to 1, yielding [THH],
	 * then flip coins from positions 1 to 3, yielding [HTT].
	 * 
	 * Return the sequence of results [ [THH], [HTT] ]
	 */
    private static char[][] flipCoins(char coins[], int flip[][]) {

    	int numFlips = flip.length; /* number of flips */
    	
    	/* allocate storage for solution */
    	char result[][] = new char[numFlips][];
    	for (int i=0; i<numFlips; i++)
    		result[i] = coins.clone();  /* new char[coins.length] */
    		
        Scanner scan = new Scanner("test/my.in");
       while(scan.hasNext("\n"))
        {
    	   while(scan.hasNext(""))
           {
           	
           }
        }
        
        return result;

    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();

		for (int testCase=0; testCase < numOfTestCases; testCase++) {
			String board = sc.next();
			char coins[] = board.toCharArray();

			int numFlips = sc.nextInt();
			int flip[][] = new int[numFlips][2];
			
			for (int i=0; i < numFlips; i++) {
				flip[i][0] = sc.nextInt();
				flip[i][1] = sc.nextInt();
			}

			char result[][] = flipCoins(coins, flip);
		
			System.out.printf("%s ", board);
			for (int i=0; i<numFlips; i++) {
				System.out.printf("%s ", new String(result[i]));		}
			System.out.println();

		}
		
		sc.close();
	}
}

