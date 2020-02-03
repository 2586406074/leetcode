package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [a, b] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are a elements with value b in the decompressed list.

Return the decompressed list.



Example 1:

Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4,4] is [2,4,4,4].


Constraints:

2 <= nums.length <= 100
nums.length % 2 == 0
1 <= nums[i] <= 100
* */
class Solution {
    public static void main(String args[]) {
        int[] num = {1,2,3,4};

        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,4);
        System.out.println(list);

        System.out.println(Arrays.toString(decompressRLElist(num)));
}
    public static int[] decompressRLElist(int[] nums) {

        List<Integer>  mList = new ArrayList<Integer>();

        for (int i = 0; i < nums.length / 2; i++){
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];
            for (int j = 0; j < freq; j++){
                mList.add(val);
            }
        }
        System.out.println(mList);
        int[] arr = new int[mList.size()];
        for (int i = 0; i < mList.size(); i++){
            arr[i] = mList.get(i);
        }
        return arr;
    }
    public static int[] decompressRLElist2222(int[] nums) {
        List<Integer> mlist = new ArrayList<Integer>();
        for(int i = 0; i < nums.length / 2; i++){
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];
            for(int j = 0; j < freq; j++){
                mlist.add(val);
            }
        }
        int[] arr = new int[mlist.size()];
        for(int i = 0;i < mlist.size(); i++){
            arr[i] = mlist.get(i);
        }
        return arr;
    }

}
