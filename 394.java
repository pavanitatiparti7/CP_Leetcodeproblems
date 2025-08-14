class Solution {
    public String decodeString(String s) {
        Stack<String> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == ']'){
                String res="";
                while(!stack.isEmpty() && !stack.peek().equals("[")){   //repetiton ("[") becoz we have taken stack as string 
                    res = stack.pop() + res;   // popping elements from stack and re-constructing string
                } 
                if(!stack.isEmpty()){
                    stack.pop();
                }
                String repnum=""; //repetition number=repnum
                while((!stack.isEmpty()) && stack.peek().matches("\\d")){
                    repnum = stack.pop() + repnum;
                }
                int n=Integer.parseInt(repnum);
                String repStr="";
                for(int i=0;i<n;i++){
                    repStr += res;
                } 
                stack.push(repStr);    
            }
            else{
                stack.push(String.valueOf(ch));
            }
        }
        String decodeStr="";
        for(String r:stack){
            decodeStr += r;
        }

        return decodeStr;
    }
}
