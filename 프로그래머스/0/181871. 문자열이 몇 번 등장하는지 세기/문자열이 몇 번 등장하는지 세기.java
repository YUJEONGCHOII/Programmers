class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        
        for(int i=0; i<=myString.length()-pat.length(); i++){
            for(int j=i; j<i + pat.length(); j++){
                str += myString.charAt(j) + "";
            }
            
            if(str.equals(pat)){
                answer++;
            }
            
            str = "";
        }
        
        return answer;
    }
}