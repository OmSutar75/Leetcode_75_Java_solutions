class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prefix [] = new int [nums.length];
        int suffix [] = new int [nums.length];
        int res [] = new int [nums.length];
        suffix[0] = nums[0];
        for(int i = 1 ;i<nums.length;i++)
        {
            suffix[i] = suffix[i-1]*nums[i];   
        }

        prefix[prefix.length-1] = nums[nums.length-1];

        if(prefix.length > 1)
        {
        for(int i = prefix.length-1;i>0;i--)
        {
            prefix[i-1] = prefix[i]*nums[i-1];
        } 

        }
        if(prefix.length >1)
            res[0] = prefix[1];
        else
            res[0] = 0;
        for(int i = 1 ;i<nums.length-1;i++)
        {
            res[i] = prefix[i+1]*suffix[i-1];
        }
        if(suffix.length>1)
            res[nums.length-1] = suffix[suffix.length-2];
        else
            res[res.length-1] = 0;
        return res;
    }
}


