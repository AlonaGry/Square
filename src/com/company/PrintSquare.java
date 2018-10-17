package com.company;

public class PrintSquare {

    public static StringBuffer Print_N_OfSquareFromA(int a, int n){

        StringBuffer nOfSquare = new StringBuffer(n);

        for (int i = (int)a + 1; i <= (int) a + n; i++) {

            int squareI = (int) Math.pow(i, 2);
            nOfSquare.append(squareI + ", ");
        }
        return nOfSquare;
    }
}
