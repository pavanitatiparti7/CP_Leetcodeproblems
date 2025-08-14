class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!Character.isDigit(ch)){ // if character is not a digit push the element into stack
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){ // if it is a digit then check whether stack is empty are not 
                    stack.pop(); // if stack is empty pop the element
                }
            }
        }
        String res="";
        for(char c:stack){ //fetch one-one char from stack
            res+=c;

        }
        return res;
    }
}
