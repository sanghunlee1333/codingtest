class Solution {
    public int solution(int order) {
        int answer = 0;
        String word = String.valueOf(order);
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)=='3'||word.charAt(i)=='6'||word.charAt(i)== '9'){
                answer++;
            }
        }
        return answer;
    }
}