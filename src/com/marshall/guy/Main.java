package com.marshall.guy;

import java.util.Scanner;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

public class Main {

    static boolean isPrimeNumber(int number) {
        int ceilingRoot = (int)ceil(sqrt(number));
        if (ceilingRoot >= number) {
            ceilingRoot = number - 1;
        }

        for (int i = 2; i <= ceilingRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int userInput = scanner.nextInt();

        for (int i = 2; i <= userInput; i++) {
            boolean isPrime = isPrimeNumber(i);
            if (isPrime) {
                System.out.println(i + " is a prime number.");
            }
        }

    }
}