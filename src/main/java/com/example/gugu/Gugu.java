package com.example.gugu;

public class Gugu {
    public static void main(String[] args) {
        int s = 2;
        int f = 5;
        //2~5 출력

        for (int i = 1; i <= 9; i++){
            for (int dan = s; dan <= f; dan++) {
                System.out.printf("%2d * %2d = %3d", dan, i, dan * i);
            }
            System.out.println();
            }
        }

    }

