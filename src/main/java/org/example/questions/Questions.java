package org.example.questions;

import java.util.Arrays;

public class Questions {

    public void Questions01 () {
        // Swap x,y values without using 3rd variable.
        int x = 10;
        int y = 20;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    public void Questions02 () {
        // Swap s1,s2 values without using 3rd (String) variable.

        String s1 = "tree";
        String s2 = "flower";

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }
}
