package oop;

import java.util.*;

public class p2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a + b;
            System.out.println("the result is :" + res);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }


    

}
