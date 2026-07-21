class Solution {
    public char findTheDifference(String s, String t) {
       char[] top = t.toCharArray();
       char[] sop = s.toCharArray();
       long sum = 0, diff = 0;
       for(char c : top){          //getting the char in top to c
        sum +=c;
       } 
        for(char c : sop){             //getting the char in sop to c
        diff +=c;
       }
       return (char)(sum-diff);      //returning the ASCII difference to be returned as char 
    }
}
