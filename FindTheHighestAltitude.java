class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;

        int sum = 0;
        int i =0;
        while(i<gain.length)
        {
            sum+=gain[i];

            max = Math.max(sum,max);
            i++;
        }

        return max;
    }
}
