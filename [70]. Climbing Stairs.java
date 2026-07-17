/* it's getting harder for me to keep up with others, even though I am able to understand them, so I made up my mind
and am continuing to level up my foundations in java. The mindset I developed right now is whenever the compilations is 
running I hope I get errors and get to correct them. So, having this mindset, even though I am lagging now I am building my 
pattern recognition skills*/

class Solution {
    public int climbStairs(int n) {
        
        if(n==1||n==0||n==2){
           return n;
        }
        int c = 2; int p =1;
        for(int i=3; i<=n; i++ ){
           int t = c;  // gets the value of c, the main misconception I always had is forgetting that the right var is the source                          
           c=c+p;           // adds c to p
           p = t;       // assigns p to t

        }    
        return c;
    }
}
