class Solution {
    public static long comb(long n, long m) {
        long result = 1;
        
        for (int i = 0;i < m;i++) {
            result = result * (n - i) / (i + 1);
        }
        
        return result;
    }
    
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = (int)comb(Long.valueOf(balls), Long.valueOf(share));
        
        return answer;
    }
}