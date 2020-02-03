package Array;


import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"*/

public class A002_Defanging_an_IPA_ddres {

    public static void main(String args[]) {
       String Address = "1.1.1.1";

//    System.out.println(defangIPaddr(Address) );
    System.out.println(defangIPaddr2222(Address) );
}
    public static  String defangIPaddr(String address) {
//        String aaa = address.replace(".","[.]");
        return address.replace(".","[.]");
    }

    public static  String defangIPaddr2222(String address) {

        String[] arr = address.split("\\.");
      //  System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(array));

//         address.join("[.]");
       // System.out.println(String.join("[.]", arr));
        String arr2 = String.join("[.]", arr);
        return arr2;
    }
}