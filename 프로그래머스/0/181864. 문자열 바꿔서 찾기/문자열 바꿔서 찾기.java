import java.util.Arrays;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        char[] myStringChar = myString.toCharArray();
        String str = "";
        for(int i=0; i<myStringChar.length; i++){
            if(myStringChar[i] == 'A'){
                str += "B";
            } else {
                str += "A";
            }
        }
        
        if(str.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}