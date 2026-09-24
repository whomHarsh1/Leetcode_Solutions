class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int t = 0;
        for(int i =0;i<timeSeries.length-1;i++){
            int gap=timeSeries[i+1]-timeSeries[i];
            t += Math.min(gap,duration);
        }
        t += duration;
        return t;
    }
}