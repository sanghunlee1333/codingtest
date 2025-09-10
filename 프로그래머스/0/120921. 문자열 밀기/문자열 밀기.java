class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        int count = 0;
        for(int i = 0; i < A.length(); i++) {
            if(A.equals(B)) {
                answer = 0;
                break;
            }
            char spel = A.charAt(A.length() - 1);
            String str = spel + A.substring(0, A.length() - 1);
            count++;
            if(str.equals(B)) {
                answer = count;
                break;
            }
            else {
                answer = -1;
            }
            A = str;
        }
        
        return answer;
    }
}