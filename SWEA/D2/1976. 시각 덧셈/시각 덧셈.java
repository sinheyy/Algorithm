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
        	int first_hour = Integer.parseInt(s[0]);
        	int first_min = Integer.parseInt(s[1]);
        	int second_hour = Integer.parseInt(s[2]);
        	int second_min = Integer.parseInt(s[3]);
        	
        	int hour = 0;
        	int min = 0;
        	
        	if(first_hour + second_hour > 12) {
        		hour = first_hour + second_hour - 12;
        	}
        	else {
        		hour = first_hour + second_hour;
        	}
        	
        	if(first_min + second_min > 60) {
        		min = first_min + second_min - 60;
        		hour++;
        	}
        	else {
        		min = first_min + second_min;
        	}
 	
            System.out.print("#"+t+" "+hour+" "+min);
            System.out.println();
             
        }
         
    }
 
}