public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        boolean[] flag = new boolean[256];
        int start = 0;
        int result = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(flag[c]){
                result = Math.max(result, i-start);
                for(int k = start; k < i; k++){
                    if(s.charAt(k) == c){
                        start = k+1;
                        break;
                    }
                }
            } else{
                flag[c] = true;
            }
        }
        return Math.max(result, s.length()-start);
    }
}