package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите целое число \"а\":");
            int a = scanner.nextInt();

            System.out.println("Введите целое число \"b\":");
            int b = scanner.nextInt();

            if (a > b) System.out.println("a > b");
            else if (a < b) System.out.println("a < b");
            else System.out.println("a = b");

            try {
                System.out.println("Сложение: " + Math.addExact(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Переполнение целого числа при сложении");
            }

            try {
                System.out.println("Вычитание: " + Math.subtractExact(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Переполнение целого числа при вычитании");
            }

            try {
                System.out.println("Умножение: " + Math.multiplyExact(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Переполнение целого числа при умножении");
            }

            if (b != 0) System.out.println("Деление: " + ((float) a / b));
            else System.out.println("Деление на ноль недопустимо!");

        } catch (InputMismatchException e) {
            System.out.println("Введите целое число от -2147483648 до 2147483647!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
