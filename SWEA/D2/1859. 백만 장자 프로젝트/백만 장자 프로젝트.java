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
        	
        	String[] s = br.readLine().split(" ");
        	int[] price = new int[N];		// 매매가
        	long profit = 0;		// 기대 수익(구매하면 -, 팔면 +)
        	int num = 0;	// 총 물건 구매 수량
        	int max = 0;
        	
        	for (int n = 0;n < N;n++) {
        		price[n] = Integer.parseInt(s[n]);
        	}
        	
        	for (int i = N-1; i >= 0;i--) {
        		// max 보다 작으면 구매
        		if (price[i] < max) {
        			profit = profit - price[i];
        			//System.out.println("#i:"+i+" "+profit);
        			num++;
        			//System.out.println("구매 "+i);
        		}
        		// max 보다 크면 판매
        		else {
        			profit = profit + max * num;
        			//System.out.println("#i:"+i+" "+profit);
        			max = price[i];
        			num = 0;
        			//System.out.println("판매 "+i);
        		}
        	}
        	
        	profit = profit + max * num;
        	

        	System.out.println("#"+t+" "+profit);
        }
         
    }
 
}