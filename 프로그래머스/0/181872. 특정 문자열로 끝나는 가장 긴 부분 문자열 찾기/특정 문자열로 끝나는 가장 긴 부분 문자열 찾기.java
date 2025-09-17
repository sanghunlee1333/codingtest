class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(myString);
        sb.reverse();
        StringBuilder sb_pat = new StringBuilder(pat);
        sb_pat.reverse();
        
        int count = sb.length() - 1;
        for(int i = 0; i < sb.length() - 1; i++) {
            if(sb_pat.toString().equals(sb.substring(i, i + sb_pat.length()))) {
                break;
            }
            count--;
        }
        answer = myString.substring(0, count + 1);
        
        return answer;
    }
}