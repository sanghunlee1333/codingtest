class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(char alpha = 'a'; alpha <= 'z'; alpha++) {
            int count = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == alpha) {
                    count++;
                }
            }
            if(count == 1) {
                answer += alpha;
            }
        }
        return answer;
    }
}