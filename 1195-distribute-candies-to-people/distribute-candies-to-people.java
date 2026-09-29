class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int give=1;
        int index=0;
        while(candies>0){
            int current=Math.min(give,candies);
            result[index] += current;
            candies -= current;
            give++;
            index++;
            if(index == num_people){
                index=0;
            }
        }
        return result;
    }
}