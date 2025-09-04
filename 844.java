class Solution {
    public boolean backspaceCompare(String s, String t) {
        int idx_s=s.length()-1;
        int idx_t=t.length()-1;
        int skip_s=0;
        int skip_t=0;
        while(idx_s>=0 || idx_t>=0){
            while(idx_s>=0){
                if(s.charAt(idx_s)=='#'){
                    skip_s++;
                    idx_s--;
                }
                else if(skip_s>0){
                    idx_s--;
                    skip_s--;
                }
                else{
                    break;

                }
            }
            while(idx_t>=0){
                if(t.charAt(idx_t)=='#'){
                    skip_t++;
                    idx_t--;
                }
                else if(skip_t>0){
                    idx_t--;
                    skip_t--;
                }
                else{
                    break;
                }
            }
            if(idx_s>=0 && idx_t>=0){
                if(s.charAt(idx_s) != t.charAt(idx_t)){
                    return false;
                }
            }
            else if(idx_s>=0 || idx_t>=0){
                return false;
            }
            idx_s--;
            idx_t--;
        }
        return true;
    }
}
