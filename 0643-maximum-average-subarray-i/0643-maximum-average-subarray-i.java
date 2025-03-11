class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k==1){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                max=Math.max(max,nums[i]);
            }
            return (double)max;
        }
       double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; 
            max = Math.max(max, sum);
        }
        
        return max / k;
    }
}