class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(char x : arr){
            if(!answer.contains(String.valueOf(x))) answer += x;
        }
        return answer;
    }
}