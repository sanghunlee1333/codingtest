class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
	        
        int count = 1;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == ' ') {
                count++;
            }
        }
        answer = new String[count];
        for(int i = 0; i < count; i++) {
        	answer[i] = "";
        }
        
        String word = "";
        int len = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) != ' ') {
                word += my_string.charAt(i);
            }
            else if(my_string.charAt(i) == ' ') {
                answer[len] += word;
                word = "";
                len++;
            }
        }
        answer[answer.length - 1] += word;
        
        return answer;
    }
}