package Array;
/*
* Given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).



Example 1:

Input: num = 9669
Output: 9969
Explanation:
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
Example 2:

Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.
Example 3:

Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.


Constraints:

1 <= num <= 10^4
num's digits are 6 or 9.*/
public class A006_Maximum_69_Number {
    public static void main(String args[]) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }
    public static int maximum69Number (int num) {
        //化为数组 替换
        char[] ch = String.valueOf(num).toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                break;
            }
        }
        int a = Integer.parseInt(String.valueOf(ch));
        return a;
                            //方法二   化为字符串直接替换
//        String S = Integer.toString(num);
//        S = S.replaceFirst("6","9");
//        int a = Integer.parseInt(S);
//        return a;
    }
}
