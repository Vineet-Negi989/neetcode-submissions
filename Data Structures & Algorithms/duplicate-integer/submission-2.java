class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> set=new HashSet<>();//Hashset is basically used only to store the numbers
        for(int num:nums){
            if(!set.contains(num))
            set.add(num);
            else
            return true;
        }
        return false;
    }
}