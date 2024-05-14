import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= T;t++) {
        	String[] s = br.readLine().split(" ");
            int P = Integer.parseInt(s[0]);
            int Q = Integer.parseInt(s[1]);
            int R = Integer.parseInt(s[2]);
            int S = Integer.parseInt(s[3]);
            int W = Integer.parseInt(s[4]);
            
            int feeA;
            int feeB;
            
            // A사 요금
            feeA = W * P;
            
            // B사 요금
            if(W <= R)
            	feeB = Q;
            else
            	feeB = Q + (W - R) * S;
            
        	int min_fee = (feeA < feeB)?feeA:feeB;
        	
            System.out.println("#"+t+" "+min_fee);
             
        }
         
    }
 
}
