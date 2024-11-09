import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        float[] avgScore = new float[score.length];
        for(int i=0; i<score.length; i++){
            avgScore[i] = (float)((score[i][0] + score[i][1])/2.0);
        }
        
        int[] answer = new int[score.length];
        
        for(int i=0; i<score.length; i++){
            int count = 1;
            
            for(int j=0; j<score.length; j++){
                if(avgScore[i] < avgScore[j]){
                    count++;
                }
                answer[i] = count;
            }
        }
        
        return answer;
    }
}