class Solution {
    public int smallestNumber(int n) {
        int x = 1;
        while(x<n){
            x = x*2 + 1;        // it is checking which is the greatest bit or equal to and giving the result
        }
        return x;
    }
}
