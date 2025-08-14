class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> dict=new HashMap<>(); //creating an hashmap -> Character, Integer
        for(char ch:magazine.toCharArray()){
            dict.put(ch, dict.getOrDefault(ch, 0)+1);
            /*if(dict.containsKey(ch)){
                dict.put(ch, dict.get(ch)+1); //if existing
            }else{
                dict.put(ch, 1); //if not existing 
            }*/
        }
        for(char c:ransomNote.toCharArray()){
            if(!dict.containsKey(c) || dict.get(c) ==0){ //non-existence of c in hashmap
                return false;
            }
            /*else{
                if(dict.get(c) == 0){
                    return false;
                }*/
            else{
                dict.put(c, dict.get(c)-1);
            }

        }
        return true;
    }
}
