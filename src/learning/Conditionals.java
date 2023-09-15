package learning;

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter another number :");
//        int num2 = scanner.nextInt();
//        if (num1 > num2) {
//            System.out.println("The highest number is:" + (num1));
//        } else {
//            System.out.println("The highest number is:" + (num2));
//        }
//        ;
//        System.out.println("Enter a 3rd number :");
//        int num3 = scanner.nextInt();
//        if (num3 % 2 == 0) {
//            System.out.println("The number is even");
//        } else System.out.println("The number is odd");


        System.out.println("Enter a traffic light colour: " );
        String colour = scanner.nextLine();
        switch (colour) {
            case "red":
                System.out.println("Red means stop");
                break;
            case "amber":
                System.out.println("Amber means get ready");
                break;
            case "green":
                System.out.println("Green means go!!!");
                break;
            default:
                System.out.println("Not a traffic light colour");
                break;

        }
    }
}





