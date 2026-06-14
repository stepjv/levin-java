package com;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку \"а\":");
            String a = scanner.nextLine();

            System.out.println("Введите строку \"b\":");
            String b = scanner.nextLine();

            if (b.equals(a)) System.out.println("Строки идентичны");
            else System.out.println("Строки неидентичны");
        }
    }
}
