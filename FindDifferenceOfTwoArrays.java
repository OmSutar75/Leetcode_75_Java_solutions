class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();

        List<List<Integer>> result = new ArrayList<>();
        for(int i : nums1)
            num1.add(i);
        
        for(int i : nums2)
            num2.add(i);
            
       List<Integer> l1 = new ArrayList<>();
       List<Integer> l2 = new ArrayList<>();


       for(int item : num1)
       {
       }
    
        for(int item : num2)
        
        result.add(l1);
        result.add(l2);

        return result;
    }
}
