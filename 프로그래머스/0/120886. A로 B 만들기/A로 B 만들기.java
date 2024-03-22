class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int count = 0;
        char[] before1 = before.toCharArray();
        char[] after1 = after.toCharArray();
        
        for(int i=0; i<after1.length; i++){
            for(int j=0; j<before1.length; j++){
                if(after1[i] == before1[j]){
                    before1[j] = '0';
                    count++;
                    break;
                }
            }
        }
        
        if(count == after.length()){
            answer = 1;
        }
        
        return answer;
    }
}