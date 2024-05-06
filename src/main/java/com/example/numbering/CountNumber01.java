package com.example.numbering;

public class CountNumber01 {
    public static void main(String[] args) {
        int n = 421314218;
        /*
         * 421314218 -> 8
         * 42131421  -> 1
         * 4213142   -> 2
         * 몫, 나머지로 추출,다음 숫자로 투입
         * 0이 될 때까지
         * */

        int arr[] = new int[10]; // 0~9 입력된 수를 cnt(count) 위한 용도
        //int arr [0] = 0;
        //int arr [1] = 3;
        //int arr [4] = 2;

        while (n > 0) {
            arr[n % 10]++;
            n /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }

}

