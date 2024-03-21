class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String str[] = new String[my_string.length()];
        
        for(int i=0; i<my_string.length(); i++){
            str[i] = my_string.charAt(i) + "";
        }
        
        String a = "";
        a = str[num1];
        str[num1] = str[num2];
        str[num2] = a;
        
        for(int j=0; j<str.length; j++){
            answer += str[j];
        }
        
        return answer;
    }
}