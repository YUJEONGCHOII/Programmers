import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        int count = 1;
        
        for(int i=0; i<sArr.length; i++){
            for(int j=i+1; j<sArr.length; j++){
                if(sArr[i].equals(sArr[j])){
                    count++;
                    sArr[j] = "";
                }
            }
            if(count == 1){
                answer += sArr[i];
            }
            count = 1;
        }
        
        char[] sArr2 = answer.toCharArray();
        Arrays.sort(sArr2);
        
        answer = "";
        
        for(int k=0; k<sArr2.length; k++){
            answer += sArr2[k] + "";
        }
        
        return answer;
    }
}