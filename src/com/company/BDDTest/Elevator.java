package com.company.BDDTest;

public class Elevator {

    private final static int fullWeight = 1500;

    public static boolean isFull(int weight) {
        return weight > fullWeight;
    }
}
