package learning;

import java.sql.SQLOutput;

public class WrongWith {
    public static void main(String[] args) {


        int x = 3, y = 5;
        if (x >= 0) {
            if (y <= x) {
                System.out.println("y is less thank x");
            } else {
                System.out.println("y is more than x");
            };
        } else {
                System.out.println("x is negative");
            };

        int z = 7;
        if (z ==0) {
            System.out.println("z is 0");
        } else {
            System.out.println("z is not 0");
        };

        int a =14, b =24;
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("a and b are even numbers");
        }else {
            System.out.println("a and b are not even numbers");
        }

    }

}
