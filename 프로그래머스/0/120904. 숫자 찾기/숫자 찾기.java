class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str_num = String.valueOf(num);
        for(int i = 0; i < str_num.length(); i++) {
            int int_num = str_num.charAt(i) - '0'; 
            if(int_num == k) {
                answer = i + 1;
                break;
            } 
        }
        if (answer == 0) answer = -1;
        
        return answer;
    }
}