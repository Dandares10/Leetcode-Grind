/* This problem is the easiest and I humbly agree, but, for some reason whenever I compiled it I saw the function 
removeDuplicates, then, not being able to break the bottleneck for over 2 hours and modifying the code in various other approaches,
I finally googled it and saw the same solution I wrote earlier and upon a follow up, it reminded me that I was giving the correct solution for 
the different problem. Oops! Gotta keep it to mind to re-check the question matches with the function*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
