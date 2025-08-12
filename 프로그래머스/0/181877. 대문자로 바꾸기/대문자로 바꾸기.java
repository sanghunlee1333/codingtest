class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            char spel = myString.charAt(i);
            if(spel >= 'a' && spel <= 'z') {
                spel = (char)(spel - 32);
                answer += spel;
            }
            else answer += spel;
        }
        
        return answer;
    }
}