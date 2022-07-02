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

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= ceilingRoot; i += 2) {
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

        int primeNumberCount = 0;
        int number = 2;
        while (primeNumberCount < userInput) {
            boolean isPrime = isPrimeNumber(number);
            if (isPrime) {
                primeNumberCount++;
                System.out.printf("%d: %d%n", primeNumberCount, number);
            }
            number++;
        }
//        for (int i = 2; i <= userInput; i++) {
//            boolean isPrime = isPrimeNumber(i);
//            if (isPrime) {
//                System.out.println(i + " is a prime number.");
//            }
//        }

    }
}
