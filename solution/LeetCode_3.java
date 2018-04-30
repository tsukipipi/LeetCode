import java.util.ArrayList;
import java.util.List;

public class LeetCode_3 {
    static public int lengthOfLongestSubstring(String s) {
        List list = new ArrayList();
        int maxLength = 0;
        char currentChar;
        int lastindexofChar;
        for (int i = 0; i < s.length();i++) {
            currentChar = s.charAt(i);
            if (list.contains(currentChar)) {
                if(list.size() > maxLength) maxLength = list.size();
                lastindexofChar = list.lastIndexOf(currentChar);
                for (int j = 0; j <= lastindexofChar; j++)
                    list.remove(0);
            }
            list.add(currentChar);
        }
        if(list.size() > maxLength) maxLength = list.size();
        return maxLength;
    }

    public static void main(String[] args){
        String s = "c";
        int length;
        length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}
/*
testdata :
pwwkew  3
bbbbbb  1
abcabcbb 3
 */