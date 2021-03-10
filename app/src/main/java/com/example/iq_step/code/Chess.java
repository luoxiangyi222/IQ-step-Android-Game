package com.example.iq_step.code;

public class Chess {

    private boolean[][][] chess;
    private boolean[][][] initialChess;
    private boolean is_used = false;
    private boolean is_up = true;

    public Chess(boolean[][][] chess){
        // check shape is correct
        if (chess.length == 2 && chess[0].length == 3 && chess[0][0].length == 3){
            this.chess = chess;

            // Save initial chess
            System.arraycopy(chess, 0, this.initialChess, 0, chess.length);
        }
    }

    public void rorateRight(){
        //FIXME
        return;
    }


    public void flip() {
        // FIXME

//        for (int i = 0; i < 3; i++) {
//            flip[i][0] = m[i][2];
//            flip[i][1] = m[i][1];
//            flip[i][2] = m[i][0];
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (flip[i][j] == 0) flip[i][j] = 1;
//                else if (flip[i][j] == 1) flip[i][j] = 0;
//            }
//        }

    }
}
