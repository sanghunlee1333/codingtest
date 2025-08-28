class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String str_num = Long.toString(n);
        answer = new int[str_num.length()];
        
        for(int i = 0; i < str_num.length(); i++) {
            answer[i] = str_num.charAt(str_num.length() - 1 - i) - '0';
        }
        
        return answer;
    }
}