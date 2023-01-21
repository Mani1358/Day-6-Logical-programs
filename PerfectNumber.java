package com.blz.day_6_assignment;
import java.util.Scanner;

public class PerfectNumber {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int sum = 0;
    int i = 1;
    public void findPerfectNumber() {
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        if (sum == n)
            System.out.println(n + " Is a perfect number");
        else
            System.out.println(n + " Is not a perfect number");
    }

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        n = sc.nextInt();
        PerfectNumber p = new PerfectNumber();
        p.findPerfectNumber();
    }
}
