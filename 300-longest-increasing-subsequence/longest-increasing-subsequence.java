class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] d = new int[n];
        int ans = 0;
        for(int i = 0;i<n;i++){
            d[i]=1;
        for(int j=0;j<i;j++){
            if(nums[j]<nums[i]){
                d[i]=Math.max(d[i],d[j]+1);
            }}
        ans = Math.max(ans,d[i]);
    }
    return ans;
  }
}