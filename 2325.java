class Solution{
    public String decodeMessage(String key, String message){
        HashMap<Character, Character> dict=new HashMap<>();
        char curr_ch='a';
        for(char ch:key.toCharArray()){
            if(Character.isLetter(ch)){
                if(!dict.containsKey(ch)){
                    dict.put(ch, curr_ch);
                    curr_ch++;
                }
            }
        }
        dict.put(' ', ' ');
        String res="";
        for(char c:message.toCharArray()){
            res+=dict.get(c);
        }
        return res;
    }
}

/*class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> dict=new HashMap<>();
        char current_ch='a';
        for(char ch : key.toCharArray()){
            if(Character.isLetter(ch)){
                if(!dict.containsKey(ch)){
                    dict.put(ch, current_ch);
                    current_ch++;
                }
            }
        }
        dict.put(' ', ' ');
        String res=""; //initializing res
        for(char c: message.toCharArray()){
            res+=dict.get(c);

        }
        return res;
    }
}*/

//Step 1: create a hashmap mapping from character to character
        //    Initialize curr_ch='a'
        // Step 2: traverse through one-one character of key
        //a) check whether ch is an alphabet or not -- ch is an alphabet -> true -> check ch existing in hashmap
        //  not existing => new key - value(curr_ch)
        // curr_ch+1(Increment) -- mapping hashmap is done
        //mapping of space 
        //create an o/p var res
        //traverse through msg (and fetch one one character from msg)
        //for each character of msg fetch the value of ch in hashmap
        //add to res
        //return res

// key = "the quick brown fox jumps over the lazy dog",
// message = "vkbs bs t suepuv"
// Output: "this is a secret"
