package com.matthew;

public class Main {

    public static void main(String[] args) {
        long answer = LargestPrimeFactor(600851475143L);
        System.out.println(answer);
    }

    public static long LargestPrimeFactor(long number) {
        long factor = 0;

        for(int i = 2; i <= number; i++) {
            if(number % i == 0) {
                number = number / i;
                factor = i;
            }
        }

        return factor;
    }
}
