public class LeetCode_4 {

    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 判断数组长度是奇数还是偶数
        int flag = (nums1.length + nums2.length) % 2;
        //中位数位置
        int k = (nums1.length + nums2.length) / 2;
        int m = 0,n = 0;
        int count = 0;
        int n1 = 0,n2 = 0;
        while (m < nums1.length || n < nums2.length) {
            if (count == k+1) break;
            if (flag == 0 && count == k) n2 = n1;
            if (m == nums1.length){
                n1 = nums2[n];
                n++;
                count++;
                continue;
            }
            if (n == nums2.length){
                n1 = nums1[m];
                m++;
                count++;
                continue;
            }
            if (nums1[m] <= nums2[n]) {
                n1 = nums1[m];
                m++;
                count++;
            }
            else {
                n1 = nums2[n];
                n++;
                count++;
            }
        }
        if (flag == 1)return n1;
        else return (n1 + n2)/2.0;
    }

    public static void main(String[] args){
        int []num1 = {1, 3};
        int []num2 = {2};
        double result;
        result = findMedianSortedArrays(num1,num2);
        System.out.println(result);
    }

}
/*
nums1 = [1, 3]
nums2 = [2]
中位数是 2.0

nums1 = [1, 2]
nums2 = [3, 4]
中位数是 (2 + 3)/2 = 2.5
 */
/*
问题等价于求两个array的第k=(m+n)/2（假设m和n分别是两个数组的元素个数）大的数是多少。
基本思路是每次通过查看两个数组的第k/2大的数(假设是A[k/2],B[k/2])，
如果两个A[k/2]=B[k/2]，说明当前这个数即为两个数组剩余元素的第k大的数，
如果A[k/2]>B[k/2], 那么说明B的前k/2个元素都不是我们要的第k大的数，反之则排除A的前k/2个，
如此每次可以排除k/2个元素，最终k=1时即为结果。总的时间复杂度为O(logk),空间复杂度也是O(logk)，即为递归栈大小。
在这个题目中因为k=(m+n)/2,所以复杂度是O(log(m+n))。
public double findMedianSortedArrays(int A[], int B[]) {
    if((A.length+B.length)%2==1)
        return helper(A,B,0,A.length-1,0,B.length-1,(A.length+B.length)/2+1);
    else
        return (helper(A,B,0,A.length-1,0,B.length-1,(A.length+B.length)/2)
               +helper(A,B,0,A.length-1,0,B.length-1,(A.length+B.length)/2+1))/2.0;
}
private int helper(int A[], int B[], int i, int i2, int j, int j2, int k){
    int m = i2-i+1;
    int n = j2-j+1;
    if(m>n)
        return helper(B,A,j,j2,i,i2,k);
    if(m==0)
        return B[j+k-1];
    if(k==1)
        return Math.min(A[i],B[j]);
    int posA = Math.min(k/2,m);
    int posB = k-posA;
    if(A[i+posA-1]==B[j+posB-1])
        return A[i+posA-1];
    else if(A[i+posA-1]<B[j+posB-1])
        return helper(A,B,i+posA,i2,j,j+posB-1,k-posA);
    else
        return helper(A,B,i,i+posA-1,j+posB,j2,k-posB);
}
 */
