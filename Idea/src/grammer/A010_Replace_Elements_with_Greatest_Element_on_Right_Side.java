package grammer;

import java.util.Arrays;

/*
* Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.



Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]


Constraints:

1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5*/
public class A010_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static void main(String args[]) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static int[] replaceElements(int[] arr) {
//        int Max = -1;
//        for (int i = 0; i < arr.length; i++) {
//            int rightMax = -1;
//            for (int j = i+1; j < arr.length; j++) {
//                if(rightMax < arr[j])
//                    rightMax = arr[j];
//            }
//            arr[i] = rightMax;
//        }
//        arr[arr.length - 1] = -1;
//        return arr;
        for (int i = arr.length - 1, mx = -1; i >= 0; --i)
            mx = Math.max(arr[i],arr[i] = mx);
        return arr;
    }
}
