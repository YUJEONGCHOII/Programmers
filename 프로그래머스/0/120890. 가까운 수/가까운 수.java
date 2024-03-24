import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int minus = n;
        
        for(int i=0; i<array.length; i++){
            if(array[i]<n){
                if(n-array[i]<minus){
                    minus = n-array[i];
                    answer = array[i];
                } else if(n-array[i] == minus){
                    if(array[i]<answer){
                        answer = array[i];
                    }
                }
            } else if(array[i]>n){
                if(array[i]-n<minus){
                    minus = array[i]-n;
                    answer = array[i];
                } else if(n-array[i] == minus){
                    if(array[i]<answer){
                        answer = array[i];
                    }
                }
            } else if(array[i] == n){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}