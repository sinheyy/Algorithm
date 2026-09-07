class Solution {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // n과 m 중 큰 값이 앞으로
        int result = 0;
        if (n > m) {
            result = gcd(n, m);
        }
        else {
            result = gcd(m, n);
        }
        
        answer[0] = result;
        answer[1] = (n * m) / result;
        
        return answer;
    }
}