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
        	int N = Integer.parseInt(br.readLine());
        	String answer = br.readLine();
        	String write = br.readLine();
        	int count = 0;
        	
        	for (int i = 0;i < N;i++) {
        		if (answer.charAt(i) == write.charAt(i)) {
        			count++;
        		}
        	}

        	System.out.println("#"+t+" "+count);
        }
         
    }
 
}