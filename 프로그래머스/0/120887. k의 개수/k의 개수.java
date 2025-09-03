class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int l = i; l <= j; l++) {
            String str_num = String.valueOf(l);
            for(int m = 0; m < str_num.length(); m++) {
                char spel_num = str_num.charAt(m);
                if(spel_num == (char)(k + '0')) {
                    answer++;
                }
            }
        }
        return answer;
    }
}