package com.company.BDDTest.unit;

public class Elevator {

    private final static int fullWeight = 1380;

    public static boolean isFull(int weight) {
        return weight > fullWeight;
    }
}
