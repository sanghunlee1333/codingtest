class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int size = names.length / 5 + (names.length % 5 != 0 ? 1 : 0);
        answer = new String[size];
        
        for(int j = 0; j < size; ) {
            for(int i = 0; i < names.length; i++) {
                if(i % 5 == 0) {
                    answer[j] = names[i];
                    j++;
                }
            }
        }
        return answer;
    }
}