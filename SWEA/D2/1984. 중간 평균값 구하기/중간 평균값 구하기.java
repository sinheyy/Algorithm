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
        	int[] array = new int[10];
        	
        	String[] s = br.readLine().split(" ");
        	for (int i = 0;i < 10;i++) {
        		array[i] = Integer.parseInt(s[i]);
        	}
        	
        	Arrays.sort(array);
        	
        	double sum = 0;
        	for (int i = 1;i < 9;i++) {
        		sum = sum + array[i];
        	}

        	double remain = Math.round(sum / 8);
        	
        	System.out.println("#"+t+" "+String.format("%.0f", remain));
        }
         
    }
 
}