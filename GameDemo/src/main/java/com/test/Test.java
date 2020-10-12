package com.test;

public class Test {

    public static void main(String[] args) {

        int[][] moves  = {
                {0, 0},
                {2, 0},
                {2, 2},
                {2, 1},
                {1, 1},
        };

        // 同一行
        int rowCounter = 0;
        // 同一列
        int colCounter = 0;
        // 主对角线
        int mainCounter = 0;
        // 副对角线
        int subCounter = 0;
        int key = (moves.length - 1) % 2;
        int[] last = moves[moves.length - 1];
        int he = last[0] + last[1];
        int cha = last[0] - last[1];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == key) {
                int[] move = moves[i];
                if (move[0] == last[0]) {
                    rowCounter++;
                }
                if (move[1] == last[1]) {
                    colCounter++;
                }
                if (move[0] + move[1] == he) {
                    subCounter++;
                }
                if (move[0] - move[1] == cha) {
                    mainCounter++;
                }
            }
        }
        if (rowCounter >= 3 || colCounter >= 3 || mainCounter >= 3 || subCounter >= 3) {
            System.out.println(  key == 0 ? "A" : "B" );
        }
        // 格子未填满并且未分出胜负的情况
        if (moves.length < 9) {
            System.out.println("Pending");
        }
        System.out.println("Draw");


    }






}
