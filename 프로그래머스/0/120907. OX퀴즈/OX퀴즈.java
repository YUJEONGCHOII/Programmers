import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            ArrayList<String> array = new ArrayList<>(Arrays.asList(arr));
            
            if(array.get(1).equals("+")){
                if(Integer.parseInt(array.get(0)) + Integer.parseInt(array.get(2)) == Integer.parseInt(array.get(4))){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if(Integer.parseInt(array.get(0)) - Integer.parseInt(array.get(2)) == Integer.parseInt(array.get(4))){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            
            array.clear();
        }
        
        return answer;
    }
}