class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = new int[52];        
        
        for(int i = 0; i < my_string.length(); i++) {
            char word = my_string.charAt(i);
            for(char j = 'A'; j <= 'z'; j++) {
                if(word == j) {
                    if(j >= 'a' && j <= 'z') {
                        answer[j - 'A' - 6]++;
                    }
                    else answer[j - 'A']++;
                }
            }
            
        }
        
        return answer;
    }
}