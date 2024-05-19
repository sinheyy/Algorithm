import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= T;t++) {
        	int n = Integer.parseInt(br.readLine());

        	System.out.print("#"+t+" ");
        	for (int i=0;i<n;i++) {
        		System.out.print("1/"+n+" ");
        	}
            System.out.println();
        }
         
    }
 
}