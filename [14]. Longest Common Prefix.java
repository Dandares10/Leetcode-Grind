class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null|| strs.length ==0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            while(strs[i].indexOf(prefix)!=0){                       // compares if the value is not equal to 0 as the indexof gives   
                prefix = prefix.substring(0, prefix.length() - 1);   //-1 if partially correct, 0 if totally different and 1 if same
            }                                           //for creating a prefix substring by iterating
        }
        return prefix;
    }
}
