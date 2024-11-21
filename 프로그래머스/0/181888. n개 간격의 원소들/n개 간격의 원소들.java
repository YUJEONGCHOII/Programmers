class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = 0;
        if(num_list.length%n==0){
            length = num_list.length/n;
        } else {
            length = num_list.length/n+1;
        }
        int[] answer = new int[length];
        
        int a = 0;
        for(int i=0; i<num_list.length; i++){
            if(i%n==0){
                answer[a++] = num_list[i];
            }
        }
        return answer;
    }
}