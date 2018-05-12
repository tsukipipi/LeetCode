public class LeetCode_27 {

    static public int removeElement(int[] nums, int val) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            if (nums[low] == val) {
                if (nums[high] == val) high--;
                else {
                    nums[low] = nums[high];
                    low++;
                    high--;
                }
            }
            else low++;
        }
        return low;
    }

    public static void main(String[] args){
        int [] nums = {3,3};
        int var = 3;
        System.out.println(removeElement(nums,var));
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }

}
/*
nums = [0,1,2,2,3,0,4,2], val = 2
5

nums = [3,2,2,3], val = 3
2

nums = [3,3], val = 3
0

nums = [1], val = 1
0

nums = [4,5],val = 5
1
 */