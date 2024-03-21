import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        
        String[] arr = new String[my_string.length()];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = answer.charAt(i) + "";
        }
        
        Arrays.sort(arr);
        answer = "";
        
        for(int j=0; j<arr.length; j++){
            answer += arr[j];
        }
        
        return answer;
    }
}