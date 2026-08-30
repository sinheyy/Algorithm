import java.util.List;
import java.util.ArrayList;

class Solution {
    private int groupLength(int count, int tokenLen) {
        if (count == 1) {
            return tokenLen;
        }
        
        return String.valueOf(count).length() + tokenLen;
    }
    
    public int solution(String s) {
        int len = s.length();
        int answer = len;

        for (int size = 1;size <= len / 2;size++) {
            List<String> tokens = new ArrayList<>();
            
            for (int i = 0;i < len;i += size) {
                int end = Math.min(i + size, len);
                tokens.add(s.substring(i, end));
            }
            
            int compressedLen = 0;
            String prev = tokens.get(0);
            int count = 1;
            
            for (int k = 1;k < tokens.size();k++) {
                if (tokens.get(k).equals(prev)) {
                    count++;
                }
                else {
                    compressedLen += groupLength(count, prev.length());
                    prev = tokens.get(k);
                    count = 1;
                }
            }
            
            compressedLen += groupLength(count, prev.length());
            answer = Math.min(answer, compressedLen);
        }
        
        return answer;
    }
}