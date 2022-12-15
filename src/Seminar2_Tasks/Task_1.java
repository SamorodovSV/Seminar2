package Seminar2_Tasks;

import java.util.*;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных. В этом задании не используем try catch.

public class Task_1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Введите дробное число, используя запятую: ");
        while (!scr.hasNextFloat()) {
            System.out.print("Это не дробное число, попробуйте еще раз: ");
            scr.next();
        }
        System.out.printf("Вы ввели число: %f", scr.nextFloat());
        scr.close();
    }
}
