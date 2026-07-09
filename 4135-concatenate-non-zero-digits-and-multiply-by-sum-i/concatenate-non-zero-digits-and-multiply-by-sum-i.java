class Solution {
    public long sumAndMultiply(int n) {
        long temp=0;
        int sum=0;
        while (n!=0){
            int digit=n%10;
            if (digit!=0){
            temp=temp*10+digit;
            sum+=digit;
          
            }
              n=n/10;
        }
        long x=reverse(temp);
        return x*sum;
    }
    private long reverse(long num) {
    long rev = 0;

    while (num != 0) {
        long digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;
    }

    return rev;
}
}