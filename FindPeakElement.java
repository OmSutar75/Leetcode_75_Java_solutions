class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int n = nums.length;

        if(n== 1)
            return 0;
        
        if(n>1 && nums[0] > nums[1])
            return 0;
        
        if(n>1 && nums[n-1] > nums[n-2])
            return n-1;
        low++;
        high--;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1])
                return mid;
            
            if(nums[mid+1]>nums[mid])
                low = mid+1;
            else
                high = mid-1;
        }

        return -1;
    }
}
