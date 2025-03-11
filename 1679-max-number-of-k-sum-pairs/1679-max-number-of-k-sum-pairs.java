class Solution {
    public int maxOperations(int[] nums, int k) {
        int s=0;
        int left=0;
        int right=nums.length-1;
        Arrays.sort(nums);
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                left++;
                right--;
                s++;
            }
            else if(sum<k){
                left++;
            }
            else{
                right--;
            }
        }
        return s;
    }
}