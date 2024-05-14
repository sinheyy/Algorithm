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
        	System.out.println("#"+t);
        	int count = 0;
        	
        	for (int n = 0;n < N;n++) {
        		String[] s = br.readLine().split(" ");
        		String alphabet = s[0];
        		int num = Integer.parseInt(s[1]);
        		
        		for(int i=0;i<num;i++) {
        			System.out.print(alphabet);
        			count++;
        			
        			if(count == 10) {
        				count = 0;
        				System.out.println();
            			
        			}
        		}
        	}
 
        	System.out.println();   
        }
         
    }
 
}