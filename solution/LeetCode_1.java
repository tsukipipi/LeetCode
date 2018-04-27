import java.util.ArrayList;
import java.util.List;

public class LeetCode_1 {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        List list = new ArrayList();
        for (int i = 0; i<nums.length; i++){
            int temp = target - nums[i];
            if(list.contains(temp)){
                result[0] = list.indexOf(temp);
                result[1] = i;
                return result;
            }
            list.add(nums[i]);
        }
        return result;
    }

    public static void main(String[] args){
        int nums[] = {2,7,11,15};
        int target = 9;
        int result[] = new int[2];
        LeetCode_1 lt = new LeetCode_1();
        result = lt.twoSum(nums,target);
        System.out.println(result[0] + " " +result[1]);
    }

}
