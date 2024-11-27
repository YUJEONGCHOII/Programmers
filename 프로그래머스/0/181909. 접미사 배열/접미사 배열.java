import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String str = "";
        int a = 0;
        
        for(int i=my_string.length()-1; i>=0; i--){
            str = (my_string.charAt(i) + "") + str;
            answer[a++] = str;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}