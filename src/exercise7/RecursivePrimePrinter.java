package exercise7;

import java.util.Scanner;
import java.lang.Math;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        /* iterativen podhod
        for (int i = n; i > 0; i--) {
            if(isPrime(i)) System.out.println(i);
        }*/
        if(n == 1) System.out.println(n);
        else {
            if(isPrime(n)) {
                System.out.println(n);
            }
                printPrimes(n-1);
        }
    }



    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) prime = false;

        }
        return prime;

    }
}