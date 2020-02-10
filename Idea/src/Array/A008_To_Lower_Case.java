package Array;
/*
* Implement function ToLowerCase() that has a string parameter str, and returns
the same string in lowercase.



Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"*/
public class A008_To_Lower_Case {
    public static void main(String args[]) {
        String str = "Hello";
        System.out.println(toLowerCase(str));
        System.out.println(toLowerCase2(str));

    }
    public static String toLowerCase(String str) {
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            if(a >= 'A' && a <= 'Z'){
                a = (char)(a + 32);
            }
            ans += a;
        }
        return ans;

    }
        public static String toLowerCase2(String str) {
        //将字符串变为小写
        return str.toLowerCase();
    }

}
