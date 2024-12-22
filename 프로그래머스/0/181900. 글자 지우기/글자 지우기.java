class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        
        for(int i=0; i<indices.length; i++){
            str[indices[i]] = "";
        }
        
        String answer = "";
        
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("")){
                answer += str[i];
            }
        }
        return answer;
    }
}