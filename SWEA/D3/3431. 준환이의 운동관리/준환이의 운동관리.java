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
        	int L = Integer.parseInt(s[0]);
        	int U = Integer.parseInt(s[1]);
        	int X = Integer.parseInt(s[2]);
        	
        	int result = 0;
        	
        	if (X  > U) {
        		result = -1;
        	}
        	else {
        		if (X > L) {
        			result = 0;
        		}
        		else {
        			result = L - X;
        		}
        	}

        	System.out.println("#"+t+" "+result);
        }
         
    }
 
}