import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= T;t++) {
        	String s = br.readLine();
            
        	int madiLen = 10;
        	
            for (int i = 1;i < s.length();i++) {
            	String madi = s.substring(0, i+1);
            	
            	if (i+1+madi.length() > s.length())
            		continue;
            	
            	if(madi.equals(s.substring(i+1, i+1+madi.length()))){
            		madiLen = madi.length()<madiLen?madi.length():madiLen;
            	}
            }
        	
            System.out.println("#"+t+" "+madiLen);
             
        }
         
    }
 
}
