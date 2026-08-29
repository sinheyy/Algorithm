import java.util.Arrays;

class Solution {
    public int solution(String s) {
        String[] dictionary = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder answer = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        for (int i = 0;i < s.length();i++) {
            char now = s.charAt(i);
            
            if ('0' <= now && now <= '9') {
                answer.append(now);
                continue;
            }

            word.append(now);
            int index = Arrays.asList(dictionary).indexOf(word.toString());
            if (index != -1) {
                answer.append(index);
                word.setLength(0);
            }
            
        }
        
        return Integer.parseInt(answer.toString());
    }
}