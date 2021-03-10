package com.example.iq_step.code;

public class ChessBox {

    // first layer + second layer
    Chess AA =  new Chess( new boolean[][][]{
            {
                    {true, false, false},
                    {false, true, false},
                    {true, false, false}

            },

            {
                    {false, true, false},
                    {true, false, true},
                    {false, false, false}
            }
    });

//    static final int[][] AB = rotateRight(AA);
//    static final int[][] AC = rotateRight(AB);
//    static final int[][] AD = rotateRight(AC);
//    static final int[][] AE = flipPieces(AA);
//    static final int[][] AF = rotateRight(AE);
//    static final int[][] AG = rotateRight(AF);
//    static final int[][] AH = rotateRight(AG);
}
