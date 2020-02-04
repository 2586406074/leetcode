package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
* Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters.
* Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
*
*
*
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.*/
public class A005_Jewels_and_Stones {
    public static void main(String args[]) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
        System.out.println(numJewelsInStones2(J, S));

    }
    public static int numJewelsInStones(String J, String S) {
        int num = 0;
        for (int i = 0; i < J.length(); i++){
            char a = J.charAt(i);
            for(int j = 0; j < S.length(); j++){
                if(a == S.charAt(j)){
                    num++;
                }
            }
        }
        return num;
    }
    public static int numJewelsInStones2(String J, String S) {
        int nums = 0;
        Set mset = new HashSet();
        for(char j : J.toCharArray())
            mset.add(j);
        for(char s : S.toCharArray())
        if(mset.contains(s)) {
            nums++;
        }
        return nums;
    }
}
