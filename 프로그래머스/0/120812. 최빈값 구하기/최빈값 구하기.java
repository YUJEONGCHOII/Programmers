import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        int max = array[array.length-1];
        int[] count = new int[max+1];
        
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }
        
        int mmax = count[0];
        
        for(int i=1; i<count.length; i++){
            if(mmax < count[i]){
                mmax = count[i];
                answer = i;
            } else if(mmax == count[i]){
                answer = -1;
            }
        }
        return answer;
    }
}