import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        String tmp = Long.toString(n);
        
        String reversed = new StringBuilder(tmp).reverse().toString();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0;i < reversed.length();i++) {
            answer.add(reversed.charAt(i) - '0');
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}