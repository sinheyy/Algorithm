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
        	int N = Integer.parseInt(br.readLine());
        	int now_speed = 0;
        	int distance = 0;
        	
        	for (int n = 0;n < N;n++) {
        		String[] s = br.readLine().split(" ");
            	int command = Integer.parseInt(s[0]);
            	int speed = 0;
            	if (s.length > 1)
            		speed = Integer.parseInt(s[1]);
            	
            	if (command == 1) {
            		now_speed = now_speed + speed;
            		distance = distance + now_speed;
            	}
            	else if (command == 2) {
            		if (now_speed < speed) {
            			
            		}
            		else {
            			now_speed = now_speed - speed;
            		}
            		distance = distance + now_speed;
            	}
            	else if (command == 0) {
            		distance = distance + now_speed;
            	}
        	}
        	
        	 	
            System.out.print("#"+t+" "+distance);
            System.out.println();
             
        }
         
    }
 
}