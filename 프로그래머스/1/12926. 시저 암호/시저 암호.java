class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0;i < s.length();i++) {
            char now = s.charAt(i);
            
            if (now == ' ') {
                answer.append(now);
                continue;
            }
            
            if('a' <= now && now <= 'z') {
                answer.append((char)('a' + (now + n - 'a') % 26));
                continue;
            }
            
            answer.append((char)('A' + (now + n - 'A') % 26));
        }
        
        return answer.toString();
    }
}