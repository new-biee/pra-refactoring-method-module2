package com.prarefactoringmethod;

public class Main {

    public static void main(String[] args) {
        CylinderTest cylinderTest = new CylinderTest();
        double result = cylinderTest.getVolume(2, 3);
        System.out.println(result);
    }
}
