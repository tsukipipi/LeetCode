public class LeetCode_5 {

    static public String longestPalindrome(String s) {

        boolean [][]palindrome = new boolean[s.length()][s.length()];
        int maxLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j <= i; j++){
                if((s.charAt(i) == s.charAt(j)) && ((i - j) <= 2))
                    palindrome[i][j] = true;
                else if((s.charAt(i) == s.charAt(j)) && (palindrome[i-1][j+1]))
                    palindrome[i][j] = true;
                else palindrome[i][j] = false;
                if(palindrome[i][j] && (i - j + 1) > maxLength){
                    maxLength = i - j + 1;
                    start = j;
                    end = i;
                }
            }
        }
        return s.substring(start,end+1);
    }

    public static void main(String[] args){
        String s = "c";
        String maxPalindrome;
        maxPalindrome = longestPalindrome(s);
        System.out.println(maxPalindrome);
    }

}
/*
输入: "babad"
输出: "bab"/"aba"

输入: "cbbd"
输出: "bb"
 */