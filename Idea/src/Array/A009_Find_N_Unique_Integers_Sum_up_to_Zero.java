package Array;

import java.util.Arrays;

/*
* Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]


Constraints:

1 <= n <= 1000*/
public class A009_Find_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String args[]) {
        int n = 6;
        System.out.println(Arrays.toString(sumZero(n)));
        System.out.println(Arrays.toString(sumZero2(n)));
    }
    public static int[] sumZero(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n / 2; i++) {
            res[i * 2] = i + 1;
            res[i * 2 + 1] = -(i + 1);
        }
        return res;
    }
    public static int[] sumZero2(int n) {
        int[] res = new int[n];
        int left = 0, right = n -1, a = 1;
        while (left <right){
            res[left++] = -a;
            res[right--] = a;
            a++;
        }
        return res;
    }
}


