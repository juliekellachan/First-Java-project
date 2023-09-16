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
//
//
//        System.out.println("Enter a traffic light colour: " );
//        String colour = scanner.nextLine();
//        switch (colour) {
//            case "red":
//                System.out.println("Red means stop");
//                break;
//            case "amber":
//                System.out.println("Amber means get ready");
//                break;
//            case "green":
//                System.out.println("Green means go!!!");
//                break;
//            default:
//                System.out.println("Not a traffic light colour");
//                break;
//
//        }
//    }
//
//        System.out.println("Enter a number between 1 to 12");
//        int num4 = scanner.nextInt();
//        switch (num4) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("Your number was not between 1 and 12");
//        }
//    }
 System.out.println("Enter a number: ");
    int num5 = scanner.nextInt();
        System.out.println("Enter a second number: ");
    int num6 = scanner.nextInt();
        System.out.println("Enter an operator ( + , - , * or / )");
    String calc = scanner.next();
        switch(calc){
        case "+":
            System.out.println("The result is "+ (num5+num6));
            break;
        case "-":
            System.out.println("The result is "+ (num5-num6));
            break;
        case "*":
            System.out.println("The result is "+ (num5*num6));
            break;
        case "/":
            System.out.println("The result is "+ (num5/num6));
            break;
        default:
            System.out.println("That was not a valid operator");
    }
}
}




