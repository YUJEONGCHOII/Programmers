import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        
        int count = 0;
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("")){
                count++;
            }
        }
        
        int a = 0;
        String[] answer = new String[count];
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("")){
                answer[a++] = str[i];
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}