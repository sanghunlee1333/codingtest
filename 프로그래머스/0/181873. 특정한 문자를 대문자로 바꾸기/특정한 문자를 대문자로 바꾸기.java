class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char spel = my_string.charAt(i);
            if(spel == alp.charAt(0)) {
                answer += alp.toUpperCase();
            }
            else {
                answer += spel;
            }
        }
        
        return answer;
    }
}