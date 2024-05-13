import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
	public static int[][] rotate(int[][] array, int N) {
		int[][] new_array = new int[N][N];
		
		for(int r = 0;r < N;r++) {
    		for(int c = 0;c < N;c++) {
    			new_array[r][c] = array[N-c-1][r];
    		}
    	}
		
		return new_array;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int T = Integer.parseInt(test[0]); // test case
         
        for (int t = 1;t <= T;t++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]); // 배열 길이 N
            
        	int[][] array = new int[N][N];
        	
        	for(int r = 0;r < N;r++) {
        		String[] s2 = br.readLine().split(" ");
        		for(int c = 0;c < N;c++) {
        			array[r][c] = Integer.parseInt(s2[c]); // 배열 길이 N
        		}
        	}
        	
        	int[][] array90 = new int[N][N];
        	int[][] array180 = new int[N][N];
        	int[][] array270 = new int[N][N];
        	
        	array90 = rotate(array, N);
        	array180 = rotate(array90, N);
        	array270 = rotate(array180, N);
        	
            System.out.println("#"+t);
            for(int r = 0;r < N;r++) {
        		for(int c = 0;c < N;c++) {
        			System.out.print(array90[r][c]);
        		}
        		System.out.print(" ");
        		for(int c = 0;c < N;c++) {
        			System.out.print(array180[r][c]);
        		}
        		System.out.print(" ");
        		for(int c = 0;c < N;c++) {
        			System.out.print(array270[r][c]);
        		}
        		System.out.println("");
        	}
             
        }
         
    }
 
}
