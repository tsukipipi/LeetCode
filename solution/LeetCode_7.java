public class LeetCode_7 {

    static public int reverse(int x) {
        int reverseNum = 0;
        while(x != 0){
            if(reverseNum > Integer.MAX_VALUE/10 || reverseNum < Integer.MIN_VALUE/10)return 0;
            reverseNum = reverseNum * 10 + (x % 10);
            x = x / 10;
        }
        return reverseNum;
    }

    public static void main(String[] args){
        int x = -123;
        System.out.println(reverse(x));
    }

}
/*
1534236469: 0
123: 321
120: 21
-123: -321
 */