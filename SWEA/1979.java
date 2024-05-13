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
            int N = Integer.parseInt(s[0]); // 퍼즐 길이 N
            int K = Integer.parseInt(s[1]); // 단어 길이 K
            
        	int[][] puzzle = new int[N+1][N+1];
        	
        	
        	for (int i = 1;i < N + 1;i++) {
        		String[] s2 = br.readLine().split(" ");
        		for (int j = 1;j < N + 1;j++) {
        			puzzle[i][j] = Integer.parseInt(s2[j-1]);		// 흰색 - 1, 검은색 0
        		}
        	}
        	
        	for (int i = 0;i < N+1;i++) {
        		puzzle[0][i] = 0;
        		puzzle[i][0] = 0;
        	}
        	
        	int count = 0;
        	
        	for (int i = 1;i < N + 1;i++) {
        		for (int j = 1;j < N + 1;j++) {
        			// 검은색이면 넘어감
        			if(puzzle[i][j] == 0) {
        				continue;
        			}
        			
        			// 흰 색일 경우
        			// 전이 0 일 경우만
        			if (puzzle[i][j-1] == 0) {
        				int tmp = 0;
            			
            			// 가로 체크
            			for(int k = j;k < N+1;k++) {
            				if(puzzle[i][k] == 0) {
            					break;
            				}
            				else {
            					 tmp++;
            				}
            			}
            			
            			if(tmp == K) {
            				count++;
            			}
        			}
        			
        			if (puzzle[i-1][j] == 0) {
        				int tmp = 0;
            			
            			// 세로 체크
            			for(int k = i;k < N+1;k++) {
            				if(puzzle[k][j] == 0) {
            					break;
            				}
            				else {
            					 tmp++;
            				}
            			}
            			
            			if(tmp == K) {
            				count++;
            			}
        			}
        			
        		}
        	}
        	
            System.out.println("#"+t+" "+count);
             
        }
         
    }
 
}
