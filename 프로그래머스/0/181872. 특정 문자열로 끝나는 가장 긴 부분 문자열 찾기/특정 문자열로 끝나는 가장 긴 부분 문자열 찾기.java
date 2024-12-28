class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String str = "";
        int index = 0;
        
        for(int i=0; i<=myString.length()-pat.length(); i++){
            for(int j=i; j<i+pat.length(); j++){
                str += myString.charAt(j) + "";
            }
            if(str.equals(pat)){
                index = i;
            }
            str = "";
        }
        
        for(int i=0; i<index+pat.length(); i++){
            answer += myString.charAt(i) + "";
        }
        
        return answer;
    }
}