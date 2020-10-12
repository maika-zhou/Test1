package com.game;

public class Tictactoe {

    public static String execute(int[][] moves) {
        // Same Row
        int rowCounter = 0;
        // Same Col
        int colCounter = 0;
        // Main Cross
        int mainCounter = 0;
        // Reverse Cross
        int subCounter = 0;
        int key = (moves.length - 1) % 2;
        int[] last = moves[moves.length - 1];
        int reverseCross = last[0] + last[1];
        int mainCross = last[0] - last[1];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == key) {
                int[] move = moves[i];
                if (move[0] == last[0]) {
                    rowCounter++;
                }
                if (move[1] == last[1]) {
                    colCounter++;
                }
                if (move[0] + move[1] == reverseCross) {
                    subCounter++;
                }
                if (move[0] - move[1] == mainCross) {
                    mainCounter++;
                }
            }
        }
        if (rowCounter >= 3 || colCounter >= 3 || mainCounter >= 3 || subCounter >= 3) {
            return key == 0 ? "User1 win" : "User2 win";
        }
        // Not all the grid is filled.
        if (moves.length < 9) {
            return "Game is not over";
        }
        return "Draw";
    }






}
