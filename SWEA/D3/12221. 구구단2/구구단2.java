import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= T;t++) {
        	String[] s = br.readLine().split(" ");
        	int A = Integer.parseInt(s[0]);
        	int B = Integer.parseInt(s[1]);
        	int result = -1;
        	
        	if (A < 10 && B < 10) {
        		result = A * B;
        	}

        	System.out.println("#"+t+" "+result);
        }
         
    }
 
}