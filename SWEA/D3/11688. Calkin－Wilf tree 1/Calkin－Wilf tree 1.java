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
        	String s = br.readLine();

        	int a = 1;
        	int b = 1;
        	
        	for (int i = 0;i < s.length();i++) {
        		if (s.charAt(i) == 'L') {
        			b = a + b;
        		}
        		else if (s.charAt(i) == 'R') {
        			a = a + b;
        		}
        		
        	}

        	System.out.println("#"+t+" "+a+" "+b);
        }
         
    }
 
}