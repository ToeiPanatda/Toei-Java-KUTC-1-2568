package com.project.java_basic;

import java.util.Scanner;

public class ScannerBasic {
    public static void main(String[] args) {
        Scanner Mc = new Scanner(System.in);
        System.out.println("Input your number");

        int number = Mc.nextInt();
        System.out.println("yournumber" + number);
    }
}
