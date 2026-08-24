import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = l;i <= r;i++) {            
            boolean isOnlyZeroFive = Integer.toString(i).matches("[05]+");
            if(isOnlyZeroFive) {
                answer.add(i);
            }
        }
        
        if (answer.size() > 0) {
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
        
        return new int[]{-1};
    }
}