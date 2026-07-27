class Solution {
    public long removeZeros(long n) {
        long num=n;
        long ans=0;
        while(num>0){
            long last=num%10;
            if(last!=0){
                ans=ans*10+last;
            }
            num=num/10;
        }

        long rev=0;
        while(ans>0){
            long last=ans%10;
            rev=rev*10+last;
            ans=ans/10;
        }
        return rev;
    }
}
