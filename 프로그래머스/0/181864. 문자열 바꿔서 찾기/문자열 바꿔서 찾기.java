class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newString = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                newString += "B";
            }
            else {
                newString += "A";
            }
        }
        answer = newString.contains(pat) ? 1 : 0;
        
        return answer;
    }
}