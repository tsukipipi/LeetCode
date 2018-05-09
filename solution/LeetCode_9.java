public class LeetCode_9 {

    static public boolean isPalindrome(int x) {
        if(x < 0)return false;
        String num = x + "";
        int low = 0 ,high = num.length() - 1;
        boolean flag = true;
        while (low < high){
            if(num.charAt(low) != num.charAt(high)){
                flag = false;
                break;
            }
            low++;
            high--;
        }
        if (flag)return true;
        else return false;
    }

    public static void main(String[] args){
        int x = 1;
        System.out.println(isPalindrome(x));
    }

}
