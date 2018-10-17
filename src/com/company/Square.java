package com.company;

public class Square {
    private int n;
    private int m;

    public Square (int n, int m) throws SquareException {
        this.n = n;
        this.m = m;
        if(n < 0) throw new SquareException("The n is less than 0", n);
    }
    public void nOfSquareFromM() {

       if(m < 0){
        PrintSquare.Print_N_OfSquareFromA(0, n);
        System.out.println(PrintSquare.Print_N_OfSquareFromA(0, n));
        }

        //double a = Math.sqrt(m);

        //if (a == (int) a) {

        if (IsSquare.isSquare(m)){
           PrintSquare.Print_N_OfSquareFromA((int)Math.sqrt(m), n);
            System.out.println(PrintSquare.Print_N_OfSquareFromA((int)Math.sqrt(m), n));

        } else {
            PrintSquare.Print_N_OfSquareFromA((int)Math.sqrt(m) +1, n );
            System.out.println(PrintSquare.Print_N_OfSquareFromA((int)Math.sqrt(m) +1, n ));

        }
    }
}

