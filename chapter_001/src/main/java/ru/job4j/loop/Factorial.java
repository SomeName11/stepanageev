package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        if (n == 0) {
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
}
