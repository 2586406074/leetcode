package Array;

import java.util.Arrays;

/*
* In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.



Example 1:

Input: [1,2,3,3]
Output: 3
Example 2:

Input: [2,1,2,5,3,2]
Output: 2
Example 3:

Input: [5,1,5,2,5,3,5,4]
Output: 5


Note:

4 <= A.length <= 10000
0 <= A[i] < 10000
A.length is even*/
public class A012_N_Repeated_Element_in_Size_2N_Array {
    public static void main(String args[]) {
        int[] A = {1,2,3,3};
        System.out.println(repeatedNTimes(A));
        System.out.println(repeatedNTimes2(A));
    }
    public static int repeatedNTimes(int[] A) {
        for(int i = 0; i < A.length-2; i++){
            if(A[i] == A[i+1]|| A[i] == A[i+2]){
                return A[i];
            }
        }
        return A[A.length - 1];
    }
    public static int repeatedNTimes2(int[] A) {
        int[] count = new int[10000];
        for (int a : A)
            if (count[a]++ == 1)
                return a;
        return -1;
    }
}
