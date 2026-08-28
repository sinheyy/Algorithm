class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for (int i = 0;i < s.length();i++) {
            if ((s.length() != 4) && (s.length() != 6)){
                answer = false;
                break;
            }
            
            if((s.charAt(i) - '0') > 9 || (s.charAt(i) - '0') < 0) {
               answer = false;
               break;
           }
        }
        
        return answer;
    }
}