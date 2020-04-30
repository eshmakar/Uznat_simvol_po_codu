package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите код символа");

            int s = scanner.nextInt();
            char[] c = Character.toChars(s);


            System.out.print(s + " -> ");
            System.out.println(c);
            System.out.println();
        }
    }
}