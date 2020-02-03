package Array;

import grammer.For_Each;

/*
* Given an array nums of integers, return how many of them contain an even number of digits.


Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.


Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 10^5
* */
public class A001_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String args[]) {
        System.out.println("CumulativeSum:");
        int[] ss = {555,901,482,1771};


        System.out.println("CumulativeSum:"+  findNumbers22(ss));

    }
    public static  int findNumbers(int[] nums) {
        // 1、遍历数组
        int res = 0;
        for(int i : nums){
            if(String.valueOf(i).length() % 2 == 0){
                res++;
            }
        }
        return res;
//        for(int i : nums){
//            String str = String.valueOf(i);
//            int len = str.length();
//            if(len % 2 == 0){
//                res++;
//            }
//        }
    }
    // 数字最大值为一万最小为1在这之间的数字长度为偶数的有固定的区间
    public static  int findNumbers22(int[] nums) {

        int res = 0;
        for(int i : nums){
            if((i >= 10 && i<=99) || (i >= 1000 && i <= 9999) || i == 100000){
                res++;
            }
        }
        return res;
    }

}