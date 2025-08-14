class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    arr[i]='*'; // here we can assign anything , no need to take null
                }
            }else if(arr[i]=='('){
                stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            int j=stack.pop();
            arr[j]='*';
        }
        String res="";
        for(char ch:arr){
            if(ch!='*'){
                res+=ch;
            }
        }
        return res;
    }
}
