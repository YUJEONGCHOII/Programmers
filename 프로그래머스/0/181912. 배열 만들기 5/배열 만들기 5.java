class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] numList = new int[intStrs.length];
        String str = "";
        int num = 0;
        int a = 0;
        int count = 0;
        
        for(int i=0; i<intStrs.length; i++){
            for(int j=s; j<s+l; j++){
                str += intStrs[i].charAt(j) + "";
            }
            num = Integer.parseInt(str);
            
            if(num > k){
                numList[a++] = num;
                count++;
            } else {
                numList[a++] = 0;
            }
            str = "";
            num = 0;
        }
        
        int[] answer = new int[count];
        int b = 0;
        
        for(int i=0; i<numList.length; i++){
            if(numList[i] != 0){
                answer[b++] = numList[i];
            }
        }
        
        return answer;
    }
}