class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String newS = s.toLowerCase();

        long pCount = newS.chars().filter(c -> c == 'p').count();
        long yCount = newS.chars().filter(c -> c == 'y').count();
        
        if (pCount == yCount) {
            return true;
        }

        return false;
    }
}