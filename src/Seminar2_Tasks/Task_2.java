package Seminar2_Tasks;

// Если необходимо, исправьте данный код:
// * try {
// * int d = 0;
// * double catchedRes1 = intArray[8] / d;
// * System.out.println("catchedRes1 = " + catchedRes1);
// * } catch (ArithmeticException e) {
// * System.out.println("Catching exception: " + e);
// * }

public class Task_2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 0;
        if (d == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
