class Solution {
    public int waysToSplitArray(int[] nums) {
        long total=0;
        for(int num : nums){
            total+=num;
        }
        long ls=0;
        int count =0;
        for(int i=0;i<nums.length-1;i++){
            ls+=nums[i];
            long rs=total-ls;
            if(ls>=rs){
                count++;
            }       }
        return count;
    }
}