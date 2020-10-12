package com.test;

import com.game.Tictactoe;

public class Test {

    public static void main(String[] args) {

        //User1 Win in Main Cross
        int[][] moves1  = {
                {0, 0}, //user1
                {2, 0}, //user2
                {2, 2}, //user1
                {2, 1}, //user2
                {1, 1}, //user1
        };
        System.out.println( Tictactoe.execute(moves1) );


        //User2 Win in Reverse Cross
        int[][] moves2  = {
                {0, 1}, //user1
                {0, 2}, //user2
                {1, 3}, //user1
                {1, 1}, //user2
                {2, 2}, //user1
                {2, 0}, //user2
        };
        System.out.println( Tictactoe.execute(moves2) );

        //User1 Win in same Col
        int[][] moves3  = {
                {0, 1}, //user1
                {0, 2}, //user2
                {1, 1}, //user1
                {1, 0}, //user2
                {2, 1}, //user1
        };
        System.out.println( Tictactoe.execute(moves3) );


        //Game is not over
        int[][] moves4  = {
                {0, 1}, //user1
                {0, 2}, //user2
                {1, 1}, //user1
                {1, 0}, //user2
                {2, 2}, //user1
        };
        System.out.println( Tictactoe.execute(moves4) );


        //Draw
        int[][] moves5  = {
                {0, 0}, //user1
                {0, 1}, //user2
                {0, 2}, //user1
                {1, 0}, //user2
                {1, 1}, //user1
                {1, 2}, //user2
                {2, 0}, //user1
                {2, 2}, //user2
                {2, 1}, //user1
        };
        System.out.println( Tictactoe.execute(moves5) );



    }






}
