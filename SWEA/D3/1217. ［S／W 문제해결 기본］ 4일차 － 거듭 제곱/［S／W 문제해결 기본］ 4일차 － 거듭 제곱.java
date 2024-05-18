import java.util.Scanner;

public class Solution {
	public static int pow(int num1, int num2) {
		if (num2 == 0) {
			return 1;
		}
		else if (num2 == 1) {
			return num1;
		}
		else {
			return num1 * pow(num1, num2 - 1);
		}
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        for (int t = 1;t <= 10;t++) {
			int T = sc.nextInt();
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();

        	System.out.println("#"+T+" "+pow(num1, num2));
        }
         
    }
 
}