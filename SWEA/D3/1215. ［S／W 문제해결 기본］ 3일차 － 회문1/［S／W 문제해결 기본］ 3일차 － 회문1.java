import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static boolean isPalindrome(String s) {
		boolean flag = false;
		
		String reverse = "";
		for (int i = s.length() - 1;i >= 0;i--) {
			reverse += s.charAt(i);
		}
		
		if (s.equals(reverse))
			flag = true;
		
		return flag;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] test = br.readLine().split(" ");
//        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= 10;t++) {
        	int n = Integer.parseInt(br.readLine());
        	char[][] board = new char[8][8];
        	
        	for (int i = 0;i < 8;i++) {
        		String s = br.readLine();
        		for (int j = 0;j < 8;j++) {
        			board[i][j] = s.charAt(j);
        		}
        	}
        	
        	int count = 0;
        	String s = "";
        	String s2 = "";
        	for (int i = 0;i < 8;i++) {
        		for (int j = 0;j <= 8 - n;j++) {
        			for (int k = j; k < j + n;k++) {
        				s += board[i][k];
        			}
        			if (isPalindrome(s)) {
        				count++;
        			}
        			s = "";
        		}
	
        	}
        	
        	for (int i = 0;i < 8;i++) {
        		for (int j = 0;j <= 8 - n;j++) {
        			for (int k = j; k < j + n;k++) {
        				s2 += board[k][i];
        			}
        			if (isPalindrome(s2)) {
        				count++;
        			}
        			s2 = "";
        		}
	
        	}

        	System.out.println("#"+t+" "+count);
        }
         
    }
 
}