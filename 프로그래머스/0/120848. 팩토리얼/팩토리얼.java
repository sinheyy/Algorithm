class Solution {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        
        return n * fact(n - 1);
    }
    
    public int solution(int n) {
        int answer = 0;
        
        int i = 1;
        while (true) {
            if (fact(i) > n) {
                answer = i - 1;
                break;
            }
            
            i++;
        }
        
        return answer;
    }
}