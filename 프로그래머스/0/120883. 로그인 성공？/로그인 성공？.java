class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "wrong pw";
        int count = 0;
        
        for(int i=0; i<db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                if(id_pw[1].equals(db[i][1])){
                    answer = "login";
                }
            } else {
                count++;
            }
        }
        
        if(count==db.length){
            answer = "fail";
        }
        
        return answer;
    }
}