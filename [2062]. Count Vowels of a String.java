class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            String sub = "";              //it's just a placeholder
            for(int j = i; j<word.length(); j++){
                char ch = word.charAt(j);               //it's to get char at j
                if("aeiou".indexOf(ch) == -1)
                    break;             //this.. is probably if all char are not present
                sub +=ch;                                         // this is to contain or add element within ""
                if(sub.contains("a")&&sub.contains("e")&&sub.contains("i")&&sub.contains("o")&&sub.contains("u")){count++;}
            }                    // to increase count if the string countains additional vowels
        }
        return count;
    }
}
