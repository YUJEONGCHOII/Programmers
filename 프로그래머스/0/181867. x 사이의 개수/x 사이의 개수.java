class Solution {
    public int[] solution(String myString) {
        int length = 1;
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                length++;
            }
        }
        
        int[] answer = new int[length];
        int a = 0;
        int count = 0;
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                answer[a++] = count;
                count = 0;
            } else {
                count++;
            }
        }
        answer[length-1] = count;
        
        return answer;
    }
}