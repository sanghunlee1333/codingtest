class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        for(int i = 0; i < rny_string.length(); i++) {
            char spel = rny_string.charAt(i);
            if(spel == 'm') {
                answer += "rn";   
            }
            else {
                answer += spel;
            }    
        }
        return answer;
    }
}