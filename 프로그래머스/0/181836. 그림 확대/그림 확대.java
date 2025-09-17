class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        
        answer = new String[picture.length * k];
        
        for(int i = 0; i < answer.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < picture[i / k].length(); j++) {
                for(int m = 0; m < k; m++) {
                    char spel = picture[i / k].charAt(j);
                    sb.append(spel);
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}