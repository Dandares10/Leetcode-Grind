class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        while(x!=0){
         int rev= x%10;
         temp/=10;
         rev = (rev*10)+temp;
         if(rev==x)
            System.out.println(x);
        }
            return false;        
    }
}


/*I made some mistakes in the previous method and got looping errors as it runs forever as they are not declared and initialised prperly, here 
 is the revised version*/


class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;      //inittialsing temp as we are about to perform using it without copying it
        int a = x;               // it is to ensure that the actual variable that we are comparing to doesn't get changed
        while(x>0){                  // nagatives and empty palindromes are not considered
         int rev= x%10;           //getting the last digit
         temp = (temp*10)+rev;         //getting it as the first digit
         x/=10;                    // making the rest changed to help in getting the last digit and reversing it
        }
        if(temp==a){             // can be seen here that we are using a copied object to compare the result and check if it's a palindrome
                return true;
                }
        else{
            return false;
        }
                    
    }
}
