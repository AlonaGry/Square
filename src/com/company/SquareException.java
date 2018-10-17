package com.company;

public class SquareException extends Exception {
    private int number;
    public int getNumber(){return number;}
    public SquareException(String message, int n){

        super(message);
        number=n;
    }
}
