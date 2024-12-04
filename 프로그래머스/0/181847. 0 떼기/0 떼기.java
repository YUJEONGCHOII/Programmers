class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        int count = 0;
        if(n_str.charAt(0) == '0'){
            for(int i=0; i<n_str.length(); i++){
                if(n_str.charAt(i) != '0') break;
                count++;
            }
            
            for(int i=count; i<n_str.length(); i++){
                answer += n_str.charAt(i) + "";
            }
        } else {
            answer = n_str;
        }
        
        return answer;
    }
}