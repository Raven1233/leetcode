class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val nNums = nums.size
        
        var lo = 0
        var hi = nNums - 1
        
        while(lo < hi){
            val mid = lo + (hi - lo) / 2
            
            if(nums[mid] == target) return mid
            
            if(nums[lo] <= nums[mid]){
                if(target in nums[lo]..nums[mid]){
                    hi = mid - 1
                }else lo = mid + 1
            }else if(nums[mid] < nums[hi]){
                if(target in nums[mid]..nums[hi]){
                    lo = mid + 1
                }else hi = mid - 1
            }
        }
        
        return -1
    }
}