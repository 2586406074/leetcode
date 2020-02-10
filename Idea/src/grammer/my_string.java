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
        /*
        * 把int转化为String,以下三种方式把整形地i转化为字符串s，当然把Double、Float、Long转化为字符串操作一样。
1.String s=""+i;
2.String s=Integer.toString(i);
3.String s=String.valueOf(i);

把String转化为int型。
1.int i=Integer.parsenInt(s);
2.int i=Integer.valueOf(s).intValue();


把Integer转化为String
Integer integer=String()

把String转化为Integer
Integer integer=Integer.valueOf(i)
把int转化为Integer
Integer integer=new Integer()
把Integer转化为int
int num=Integer.intValue()
把String转化为BigDecimal
BigDecimal bd=new BigDecimal(str)
————————————————
版权声明：本文为CSDN博主「eacxzm」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/eacxzm/article/details/80064752*/
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
