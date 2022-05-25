package com.company;

public class Second {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        double c = Math.sqrt((a*a) + (b*b));

        int pl = (a*b)/2;
        double pr = a + b + c;

        System.out.println("Area = " + pl);
        System.out.println("Perimeter = " + pr);
    }
}