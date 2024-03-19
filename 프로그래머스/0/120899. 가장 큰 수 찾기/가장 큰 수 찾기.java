import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] a = array.clone();
        
        Arrays.sort(a);
        
        for(int i=0; i<a.length; i++){
            if(i == a.length-1){
                answer[0] = a[i];
            }
        }
        
        for(int j=0; j<array.length; j++){
            if(array[j] == answer[0]){
                answer[1] = j;
            }
        }
        
        return answer;
    }
}