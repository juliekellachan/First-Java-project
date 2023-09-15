package learning;

public class Loops {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++)
//            System.out.println("i = " + i);
//
//        int i = 0;
//            do {
//                System.out.println(" i =" + i);
//                i++;
//
//            }while (i < 10)
//
//        ;

//        int i = 0;
//        int j = 10;
//        do {
//            System.out.println(" i = " + i);
//            System.out.println(" j = " + j);
//            i++;
//            j--;
//        } while (i < j);

        int sum = 0;
        int i = 0;
        do {
            sum += i;
            i++;
            System.out.println("The sum is " + sum);
        } while (i < 10);
    }

}
