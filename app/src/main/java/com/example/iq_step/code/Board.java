package com.example.iq_step.code;

import java.util.Arrays;

public class Board {

    private static final int HIGHT_NUM = 2;
    private static final int ROW_NUM = 5;
    private static final int COLUMN_NUM = 10;
    private boolean[][][] boardState  = new boolean[HIGHT_NUM][ROW_NUM][COLUMN_NUM];

    public Board(){
        // set all valid position to True

        // first layer + second layer
        // true means we can put a chess
        for (int h = 0; h < HIGHT_NUM; h++) {
            for (int r = 0; r < ROW_NUM; r++) {
                for (int c = 0; c < COLUMN_NUM; c++) {
                    boardState[0][r][c] = (isEven(r) && isEven(c)) || (isOdd(r) && isOdd(c));
                    boardState[1][r][c] = (isEven(r) && isOdd(c)) || (isOdd(r) && isEven(c));
                }
            }
        }
        System.out.println(Arrays.deepToString(boardState));
    }


    private boolean isEven(int num){
        return num % 2 == 0;
    }

    private boolean isOdd(int num){
        return num % 2 == 1;
    }


}
