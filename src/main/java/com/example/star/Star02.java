package com.example.star;

public class Star02 {
    public static void main(String[] args) {
        int n = 5;
        /*
        *  *****
        *   ****
        *    ***
        *     **
        *      *
        * */
        //행 : i / 열 : j
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //조건
                if (i > j){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
