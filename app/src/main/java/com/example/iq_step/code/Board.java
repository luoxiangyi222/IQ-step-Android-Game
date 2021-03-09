package com.example.iq_step.code;

public class Board {

    private static final int HIGHT_NUM = 2;
    private static final int ROW_NUM = 5;
    private static final int COLUMN_NUM = 10;
    private boolean[][][] board  = new boolean[HIGHT_NUM][ROW_NUM][COLUMN_NUM];

    public Board(){
        // set all valid position to True

        // low layer
        for (int h = 0; h < HIGHT_NUM; h++) {
            for (int r = 0; r < ROW_NUM; r++) {
                for (int c = 0; c < COLUMN_NUM; c++) {

                    board[0][r][c] = (isOdd(r) && isEven(c)) || (isOdd(r) && isEven(c));

                }
            }
        }
    }

    private boolean isEven(int num){
        return num % 2 == 0;
    }

    private boolean isOdd(int num){
        return num % 2 == 1;
    }



}
