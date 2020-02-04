package grammer;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {

        Set mset = new HashSet();
        mset.add(1);
        System.out.println(mset);
        mset.add(2);
        mset.add(3);
        System.out.println(mset);
        mset.add(1);
        System.out.println(mset);

        if(mset.contains(3)){
            System.out.println("有3");

        }
        if(mset.contains(4)){
            System.out.println("有4");

        }else {
            System.out.println("没有4");

        }
    }
}
