class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int total=0;
        for(int num : nums){
            total+=num;
        }
        int ls=0;
        for(int i=0;i<nums.length;i++){
            int rs=total-ls-nums[i];
            ans[i]=Math.abs(rs-ls);
            ls+=nums[i];
        }
        return ans;
    }
}