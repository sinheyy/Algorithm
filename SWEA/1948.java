import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
        
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         
        for (int t = 1;t <= T;t++) {
        	String[] s = br.readLine().split(" ");
        	int first_month = Integer.parseInt(s[0]);
        	int first_day = Integer.parseInt(s[1]);
        	int second_month = Integer.parseInt(s[2]);
        	int second_day = Integer.parseInt(s[3]);
        	
        	int sum1 = 0;
        	for(int i = 0;i < first_month;i++) {
        		sum1 = sum1 + days[i];
        	}
        	sum1 = sum1 + first_day;
        	
        	int sum2 = 0;
        	for(int i = 0;i < second_month;i++) {
        		sum2 = sum2 + days[i];
        	}
        	sum2 = sum2 + second_day;
        	
        	int sum = sum2 - sum1 + 1;
        	
            System.out.print("#"+t+" "+sum);
            System.out.println();
             
        }
         
    }
 
}
