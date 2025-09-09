class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) { //아이디가 같은 경우
                if(!db[i][1].equals(id_pw[1])) {
                    answer = "wrong pw";
                    break;
                }
                else if(db[i][1].equals(id_pw[1])) {
                    answer = "login"; //아이디와 비밀번호가 모두 동일한 경우
                    break;
                }

            }
            else {
                answer = "fail";
            }
        }
        
        return answer;
    }
}