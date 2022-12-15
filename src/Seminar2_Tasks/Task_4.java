package Seminar2_Tasks;

import java.util.*;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя. (try быть не должно)
*/


public class Task_4 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        str = str.trim();
        if (str.isEmpty()) {
            scr.close();
            throw new IllegalArgumentException("Пустую строку вводить нельзя.");
        }
        System.out.println(str);
    }
}
