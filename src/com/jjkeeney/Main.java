package com.jjkeeney;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        byte myByte = 10;
        short myShort = 100;
        long myLong = (long) 50000 + (10* (myShort+myByte+myValue));
        System.out.println(myLong);
    }
}
