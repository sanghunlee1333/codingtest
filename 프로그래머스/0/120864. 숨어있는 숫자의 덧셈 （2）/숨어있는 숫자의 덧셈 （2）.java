class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        int num = 0;
        String str_num = "";
        for(int i = 0; i < my_string.length(); i++) {
            char spel = my_string.charAt(i); //알파벳이나 숫자 한 개 선택
            if(Character.isDigit(spel)) { //그게 숫자라면
                str_num += spel; //문자열에 더함
            }
            else if(!Character.isDigit(spel) && str_num.length() != 0) {
                num += Integer.parseInt(str_num); //문자열을 숫자로 변환해서
                answer += num; //총 합계 누적
                num = 0; //숫자는 다시 초기화
                str_num = "";
            }
        }
        if(!str_num.isEmpty()) {
            num += Integer.parseInt(str_num); //문자열을 숫자로 변환해서
            answer += num; //총 합계 누적
        }
        
        return answer;
    }
}