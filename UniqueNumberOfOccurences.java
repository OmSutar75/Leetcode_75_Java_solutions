class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     Map<Integer,Integer> map = new HashMap<>();
     Set<Integer> set = new HashSet<>();
    
    for(int item : arr)
        map.put(item,map.getOrDefault(item,0)+1);
    
    for(int count : map.values())
    {
        if(set.contains(count)) return false;

        set.add(count);
    }

    return true;

    }
}
