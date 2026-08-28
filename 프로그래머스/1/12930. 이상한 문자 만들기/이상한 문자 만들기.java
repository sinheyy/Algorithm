class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        
        for (int i = 0;i < s.length();i++) {
            // 공백이면 추가
            if (s.charAt(i) == ' ') {
                answer.append(s.charAt(i));
                index = 0;
                continue;
            }
            
            // 단어이면 대소문자 처리
            if (index % 2 == 0) {
                answer.append(Character.toUpperCase(s.charAt(i)));
            } else {
                answer.append(Character.toLowerCase(s.charAt(i)));
            }
            index++;
        }
        
        return answer.toString();
    }
}