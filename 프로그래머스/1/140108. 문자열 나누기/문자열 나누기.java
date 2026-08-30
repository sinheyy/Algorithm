class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for (int i = 0;i < len;i++) {
            char c = s.charAt(i);
            int count1 = 0;
            int count2 = 0;
            int j;
            
            for (j = i;j < len;j++) {
                if (s.charAt(j) == c) {
                    count1++;
                }
                else {
                    count2++;
                }
                
                if (count1 == count2) {
                    break;
                }
            }
            
            answer++;
            i = j;
        }
       
        return answer;
    }
}