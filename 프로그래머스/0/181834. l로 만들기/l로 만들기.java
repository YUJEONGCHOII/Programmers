import java.util.Arrays;

class Solution {
    public String solution(String myString) {
        char[] charArr = myString.toCharArray();
        
        for(int i=0; i<charArr.length; i++){
            if(charArr[i] < 'l'){
                charArr[i] = 'l';
            }
        }
        
        String answer = "";
        
        for(int i=0; i<charArr.length; i++){
            answer += charArr[i] + "";
        }
        
        return answer;
    }
}