class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            StringBuilder sb = new StringBuilder(my_string);
                
            // 인덱스 s전
            String left = sb.substring(0, s);
            
            // 인덱스 s부터 e까지
            String mid = sb.substring(s, e + 1);
            StringBuilder new_sb = new StringBuilder(mid);
            mid = new_sb.reverse().toString();
            
            // 인덱스 e 다음부터 끝까지
            String right = sb.substring(e + 1);
            
            my_string = left + mid + right;
        }
        answer = my_string;
        
        return answer;
    }
}