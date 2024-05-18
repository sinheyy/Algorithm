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
        	double sum = 0;
        	int count = 0;
        	
        	for (int n = 0;n < N;n++) {
        		arr[n] = Integer.parseInt(s[n]);
        		sum = sum + arr[n];
        	}
        	
        	double average = sum / N;
        	
        	for (int n = 0;n < N;n++) {
        		if (arr[n] <= average)
        			count++;
        	}

        	System.out.println("#"+t+" "+count);
        }
         
    }
 
}