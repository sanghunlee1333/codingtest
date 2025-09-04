class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        int length = my_str.length();
        int size = length % n == 0 ? length / n : length / n + 1;
        
        answer = new String[size];
        
        for(int i = 0; i < size; i++) {
            int start = i * n;
            int end = Math.min(start + n, length); //length -> 문자열 길이 인덱스 부분까지만 최대 허용
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}