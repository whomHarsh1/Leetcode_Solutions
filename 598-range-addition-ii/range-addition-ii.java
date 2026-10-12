class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int ma=m;
        int mb=n;
        for(int op[]:ops){
            ma=Math.min(ma,op[0]);
            mb=Math.min(mb,op[1]);
        }
        return ma*mb;
    }
}