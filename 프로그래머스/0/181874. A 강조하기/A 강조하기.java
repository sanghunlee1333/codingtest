class Solution {
    public String solution(String myString) {
        String answer = "";
        
        answer = myString.toLowerCase();
        
        String word = "";
        for(int i = 0; i < answer.length(); i++) {
            char spel = answer.charAt(i);
            if(spel == 'a') {
                word += 'A';
            }
            else {
                word += spel;
            }
        }
        answer = word;
        
        return answer;
    }
}