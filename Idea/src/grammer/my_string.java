package grammer;

import java.util.ArrayList;
import java.util.List;

public class my_string {
    public static void main(String[] args) {


        String mStr = new String("www.runoob.com");

        char[] aaa = mStr.toCharArray();
        for (char item :  aaa){
            System.out.println(item );

        }
        //set



//        List names=new ArrayList<String>();
//        names.add("1");
//        names.add("2");
//        names.add("3");
//        System.out.println(String.join("-", names));

        String str = new String("Welcome-to-Runoob");

        for (String retval: str.split("-")){
            System.out.println(retval);
        }


        String[] arrStr=new String[]{"a","b","c"};
        System.out.println(String.join("-", arrStr));
    }

}
