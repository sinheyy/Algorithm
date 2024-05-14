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
            
            boolean[] visited = new boolean[10];	// 숫자 보면 true, 못 보면 false
            int count = 1;		//최소 몇 번 양
          
            while (true) {
            	// 0~9 모든 숫자 보면 종료
            	boolean flag = true;
            	
            	for (int i = 0;i < 10;i++) {
            		if (visited[i] == false)
            			flag = false;
            	}
            	if (flag)
            		break;
            
            	int sheep = N * count;
            	while (true) {
                	visited[sheep % 10] = true;
                	sheep = sheep / 10;
                	
                	if(sheep == 0)
                		break;
            	}
            	count++;
  

            }
            
            count--;
        	
            System.out.println("#"+t+" "+count*N);    // count * N 을 출력해야함
             
        }
         
    }
 
}
