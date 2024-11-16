class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                count++;
            }
        }
        
        int index = 0;
        String[] answer = new String[count];
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;
    }
}