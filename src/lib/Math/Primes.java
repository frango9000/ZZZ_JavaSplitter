/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.Math;

import java.util.Arrays;

/**
 * @author NarF
 */
public class Primes {

    public static boolean debug = false;
    public static long calcsDone = 0L;

    public static boolean isPrime(long number) {
        if (number == 2) return true;
        if (number > 2 && isEven(number)) return false;
        if (number > 3 && isDivisible3(number)) return false;
        if (number > 5 && isDivisible5(number)) return false;
        return countDivisors(number) == 0;
    }

    public static int countDivisors(long bNum) {
        int count = 0;
        for (int f = 3; f <= bNum / 3; f += 2) {
            calcsDone++;
            if (bNum % f == 0) {
                return ++count;
            }
        }
        return count;
    }

    public static boolean hasDivisors(long bNum) {
        for (int f = 3; f <= bNum / 3; f += 2) {
            if (bNum % f == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEven(long n) {
        return (n % 2 == 0);
    }

    public static boolean isDivisible3(long n) {
        return (n % 3 == 0);
    }

    public static boolean isDivisible5(long n) {
        return (n % 5 == 0);
    }

    public static int[] listOfPrimesUntil(int n) {
        int[] pr = new int[n / 2];
        int count = 1;

        pr[0] = 2;
        for (int i = 3, j = 1; i <= n; i += 2) {
            if (isPrime(i)) {
                pr[j++] = i;
                count++;
            }
        }
        int[] primes = Arrays.copyOf(pr, count);
        return primes;
    }

    public static int[] getPrimeFactors(int number) {
        if (Primes.isPrime(number))
            return new int[]{number};

        int[] array = new int[(int) Math.round(Math.sqrt(number))];
        int[] primes = listOfPrimesUntil((number));
        int count = 0, tempValue = number;

        for (int i = 0; tempValue != 1; i++)
            for (int j = 0; j < primes.length; j++)
                if (tempValue % primes[j] == 0) {
                    tempValue /= primes[j];
                    array[i] = primes[j];
                    count++;
                    break;
                }

        //System.out.println(number+":"+Arrays.toString(Arrays.copyOf(array, count)));
        return Arrays.copyOf(array, count);
    }
}
