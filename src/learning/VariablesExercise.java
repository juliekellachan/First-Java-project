package learning;

import java.util.Scanner;

public class VariablesExercise {
    public static void main(String[] args) {
//        String firstName, lastName;
//         */
//        firstName = "Julie";
//        lastName = "Kellachan";
//        String name;
//        name = firstName + " " + lastName;
//        System.out.println(name);
//        float num1, num2, num3;
//        float result;
//        num1 = 5;
//        num2 = 2;
//        num3 = 8;
//        System.out.println(num1 + num2);
//        result = num1 / num2;
//        System.out.println(result);
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.next();
        System.out.println("Hello " + firstName + " " + lastName);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1+num2);
    }
}
