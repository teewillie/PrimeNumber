/**
 * @class: PrimeNumber
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            int divisor = 2;
            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
