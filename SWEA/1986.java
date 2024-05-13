import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= T;t++) {
            int N = Integer.parseInt(br.readLine());
            
            int sum = 0;
            
        	for(int i = 1;i <= N;i++) {
        		if(i % 2 == 0) {
        			sum = sum - i;
        		}
        		else {
        			sum = sum + i;
        		}
        	}
        	
            System.out.println("#"+t+" "+sum);
             
        }
         
    }
 
}
