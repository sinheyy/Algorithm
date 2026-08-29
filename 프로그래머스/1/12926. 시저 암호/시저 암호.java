class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0;i < s.length();i++) {
            char now = s.charAt(i);
            
            if (now == ' ') {
                answer.append(now);
                continue;
            }
            
            // 소문자면
            if(now >= 'a') {
                if ((int)(now + n) > 'z') {
                    answer.append((char)(97 + now + n - 123));
                    continue;
                }
                
                answer.append((char)(now + n));
                continue;
            }
            
            // 대문자면
            if ((int)(now + n) > 90) {
                answer.append((char)(65 + now + n - 91));
                continue;
            }
            
            answer.append((char)(now + n));
        }
        
        return answer.toString();
    }
}