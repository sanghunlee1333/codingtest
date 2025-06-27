class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String before = "";
        String after = "";
        int count = 0;
        char op = ' ';
        
        for(int i = 0; i < binomial.length(); i++) { //문자열을 돌면서
            char spel = binomial.charAt(i); 
            if(spel == '+' || spel == '-' || spel == '*') { //기호 중 하나라면
                op = spel; //기호를 문자로 저장
                count = i; //기호 순번 저장
                break; //반복문 탈출
            }
        }
        
        for(int j = 0; j < count; j++) { //기호 보다 작을 때 까지
            before += binomial.charAt(j); //문자열로 기호 이전 숫자 저장
        }
        for(int k = count + 1; k < binomial.length(); k++) { //기호 ~ 문자열 끝까지
            after += binomial.charAt(k); //문자열로 기호 이후 숫자 저장
        }
        
        before = before.trim();
        after = after.trim();
        
        int newBefore = Integer.parseInt(before);
        int newAfter = Integer.parseInt(after);
        
        if(op == '+') {
            answer = newBefore + newAfter;
        }
        else if(op == '-') {
            answer = newBefore - newAfter;
        }
        else {
            answer = newBefore * newAfter;
        }
        
        return answer;
    }
}