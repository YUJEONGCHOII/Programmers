class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(int i=0; i<control.length(); i++){
            if((control.charAt(i)+"").equals("w")) answer += 1;
            if((control.charAt(i)+"").equals("s")) answer -= 1;
            if((control.charAt(i)+"").equals("d")) answer += 10;
            if((control.charAt(i)+"").equals("a")) answer -= 10;
        }
        
        return answer;
    }
}