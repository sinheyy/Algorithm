import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static boolean check_pd(int num) {
		boolean flag = false;
		
		String str = Integer.toString(num);
		String str2 = "";
		for (int i = str.length() - 1;i >= 0;i--) {
			str2 += str.charAt(i);
		}
		
		if (str.equals(str2)) {
			flag = true;
		}
		
		return flag;
	}
	
	public static boolean isInteger(double num) {
		return num == (int) num;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= T;t++) {
        	String[] s = br.readLine().split(" ");
        	int A = Integer.parseInt(s[0]);
        	int B = Integer.parseInt(s[1]);
        	
        	int count = 0;
        	for (int i = A;i <= B;i++) {
        		if (isInteger(Math.sqrt(i)) == false)
        			continue;
        		
        		if (check_pd(i) && check_pd((int)Math.sqrt(i))) {
        			count++;
        		}
        	}

        	System.out.println("#"+t+" "+count);
        }
         
    }
 
}