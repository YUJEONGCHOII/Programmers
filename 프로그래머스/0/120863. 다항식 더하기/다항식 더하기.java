class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num1 = 0;
        int num2 = 0;
        
        String[] arr = polynomial.split(" ");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x")){
                if(arr[i].equals("x")){
                    num1++;
                } else {
                    num1 += Integer.parseInt(arr[i].replaceAll("x", ""));
                }
            } else if(!arr[i].equals("+")){
                num2 += Integer.parseInt(arr[i]);
            }
        }
        
        if(num1!=0 && num2 ==0){
            answer = num1 == 1 ? "x" : num1 + "x";
        } else if(num1 !=0 && num2 !=0){
            answer = num1 == 1 ? "x + " + num2 : num1 + "x + " + num2;
        } else if(num1 ==0 && num2 !=0){
            answer = num2 + "";
        }
        
        return answer;
    }
}