class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        for(int i =0;i<fb.length&& n>0;i++){
                if(fb[i]==0){
                    boolean le=(i==0||fb[i-1]==0);
                    boolean re=(i==fb.length-1||fb[i+1]==0);
                    if(le && re){
                        fb[i]=1;
                        n--;
                    }
                }
        }
        return n==0;
    }
}