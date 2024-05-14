import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= T;t++) {
        	int money = Integer.parseInt(br.readLine());
        	int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        	int[] change = {0, 0, 0, 0, 0, 0, 0, 0};
        	
        	int rest_money = money;
        	for (int i = 0;i < 8;i++) {
        		change[i] = rest_money / unit[i];
        		rest_money = rest_money - (change[i] * unit[i]);
        	}
 	
            System.out.println("#"+t);
            for (int c:change)
            	System.out.print(c + " ");
            System.out.println();
             
        }
         
    }
 
}