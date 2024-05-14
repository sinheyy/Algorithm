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
        	
            int[] array = new int[N];
        	String[] s = br.readLine().split(" ");
        	for (int i = 0;i < N;i++) {
        		array[i] = Integer.parseInt(s[i]);
        	}
        	
        	Arrays.sort(array);
        	
            System.out.print("#"+t+" ");
            for (int a : array) 
                System.out.print(a + " ");
            System.out.println();
             
        }
         
    }
 
}
