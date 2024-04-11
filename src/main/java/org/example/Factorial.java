package org.example;

import java.util.Scanner;
// Problem: Given a non-negative integer N, write a program to output N factorial (N!)
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        System.out.println(fac(n));
    }
    public static long fac (long n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else {
            return fac(n-1) * n;
        }
    }
}

// If you directly take an int parameter, it will exceed the value when n=20.
// Therefore, you should use long instead of int.
