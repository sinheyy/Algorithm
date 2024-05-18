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
        	int count = 0;
        	boolean[] arr = new boolean[10];
        	
        	for (int i = 0;i < s.length();i++) {
        		arr[s.charAt(i)-'0'] = true;
        	}
        	
        	for (int i = 0;i < 10;i++) {
        		if (arr[i] == true)
        			count++;
        	}

        	System.out.println("#"+t+" "+count);
        }
         
    }
 
}