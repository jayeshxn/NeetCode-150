class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i = 0;
        for(int num: nums){
            i = i^num;
            if(i == 0)
                return true;
        }
        return false;
    }
}