class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){ //새로운 원소에 진입할 때마다
            String word = strArr[i];  
            String new_word = "";
            if(i % 2 == 0) { //짝수번째 원소일 때
                for(int j = 0; j < word.length(); j++) { //해당 원소의 길이만큼
                    if(word.charAt(j) >= 'A' && word.charAt(j) <= 'Z') { //각 원소 글자
                        new_word += (char)(word.charAt(j) + 32);
                    }
                    else {
                        new_word += word.charAt(j);
                    }
                }
                answer[i] = new_word;
            }
            else {
                for(int j = 0; j < word.length(); j++) {
                    if(word.charAt(j) >= 'a' && word.charAt(j) <= 'z') {
                        new_word += (char)(word.charAt(j) - 32);
                    }
                    else {
                        new_word += word.charAt(j);
                    }
                }
                answer[i] = new_word;
            }
        }
        return answer;
    }
}