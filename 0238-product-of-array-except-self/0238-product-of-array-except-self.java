class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] a=new int [nums.length];
        int b=1;
        a[0]=1;
        for(int i=1;i<nums.length;i++){
            b*=nums[i-1];
            a[i]=b;
        }
        int c=1;
        for(int i=nums.length-2;i>=0;i--){
            c*=nums[i+1];
            a[i]*=c;
        }
        return a;

    }
}