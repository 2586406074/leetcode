package Array;

import java.util.Arrays;

/*
* Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.



Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000*/
public class A011_Sort_Array_By_Parity {
    public static void main(String args[]) {
        int[] A = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
        System.out.println(Arrays.toString(sortArrayByParity2(A)));
    }
    public static int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(A[i] % 2 == 0)
                arr[j++] = A[i];
        }
        for(int a = 0; a < arr.length; a++){
            if(A[a] % 2 == 1)
                arr[j++] = A[a];
        }
        return arr;
    }
    public static int[] sortArrayByParity2(int[] A) {
        for(int i = 0, j = 0; j < A.length; j++){
            if(A[j] % 2 == 0){
                int temp = A[i];
                A[i++] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
}