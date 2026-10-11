class Solution {
    public int minCostClimbingStairs(int[] cost) {
      int n=cost.length;
      int f=0;
      int s=0;
      for(int i=2;i<=n;i++){
       int c= Math.min(s+cost[i-1],f+cost[i-2]);
        f=s;
        s=c;
      } 
      return s; 
    }
}