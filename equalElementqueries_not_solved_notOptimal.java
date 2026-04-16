class Solution {

    public int findNearstDistance(int [] nums,int val)
    {
        int n = nums.length;
        if(val >= n)
            return -1;

        int target = nums[val];
        int i = (val+1)%n;
        int j = (val-1 < 0)?n-1:val-1;
        int count = 1;
        while(i != val)
        {
            if(nums[i] == target)
                return count;
            
            if(nums[j] == target)
                return count;
            
            i = (i+1)%n;
            j = (j-1<0)?n-1:j-1;
            count++;
        }
        return -1;
    }
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0 ;i<queries.length;i++)
        {
            int val = findNearstDistance(nums,queries[i]);
            res.add(val);
        }

        return res;
    }
}
