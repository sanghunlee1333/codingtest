class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] str_arr = s.split(" ");
        
        for(int i = 0; i < str_arr.length; i++) {
            if(!str_arr[i].equals("Z")) {
                answer += Integer.parseInt(str_arr[i]);
            }
            else {
                answer -= Integer.parseInt(str_arr[i - 1]);
            }
        }
        
        return answer;
    }
}