class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        int count = 0;
        for(int i = 0; i < myString.length(); i++) {
            char spel = myString.charAt(i);
            if(spel == 'x') count++;
        }
        
        answer = new int[count + 1];
        
        String word = "";
        for(int j = 0; j < count; ) {
            for(int i = 0; i < myString.length(); i++) {
                char spel = myString.charAt(i);
                if(spel != 'x') {
                    word += spel;
                    if(i == myString.length() - 1) {
                        answer[j] = word.length();
                        word = "";
                        j++;
                    }
                }
                else {
                    answer[j] = word.length();
                    word = "";
                    j++;
                }
            }
        }
            
        return answer;
    }
}