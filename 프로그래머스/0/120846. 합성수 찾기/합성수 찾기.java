class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count = 0;
        for(int i = 1; i <= n; i++) {
            int rest_count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    rest_count++;
                }
            }
            if(rest_count >= 3) {
                count++;         
            }
        }
        answer = count;
        
        return answer;
    }
}