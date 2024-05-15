package com.example.power;

public class Power01 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int result = 1;

        for (int i = 0; i < m; i++) {
            result = n * result;
        }
        System.out.println(result);
    }
}
