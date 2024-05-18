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
        	
        	int[] arr = new int[N];
        	String[] s = br.readLine().split(" ");
        	int up = 0;
        	int down = 0;
        	
        	for (int n = 0;n < N;n++) {
        		arr[n] = Integer.parseInt(s[n]);
        	}
        	
        	for (int n = 0;n < N-1;n++) {
        		if (arr[n] > arr[n+1]) {
        			if (arr[n] - arr[n+1] > down)
        				down = arr[n] - arr[n+1];
        		}
        		else {
        			if (arr[n+1] - arr[n] > up)
        				up = arr[n+1] - arr[n];
        		}
        	}

        	System.out.println("#"+t+" "+up+" "+down);
        }
         
    }
 
}