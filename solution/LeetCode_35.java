public class LeetCode_35 {

    static public int searchInsert(int[] nums, int target) {
        return binarySearch(0,nums.length-1,nums,target);
    }

    static public int binarySearch(int low,int high,int[] nums,int target){
        if (low > high)return low;
        else {
            int mid = (low + high) / 2;
            if (nums[mid] == target)return mid;
            else if (nums[mid] > target) return binarySearch(low,mid - 1,nums,target);
            else return binarySearch(mid + 1,high,nums,target);
        }
    }

    public static void main(String[] args){
        int [] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums,target));
    }

}
/*
输入: [1,3,5,6], 5
输出: 2

输入: [1,3,5,6], 2
输出: 1

输入: [1,3,5,6], 7
输出: 4

输入: [1,3,5,6], 0
输出: 0
 */