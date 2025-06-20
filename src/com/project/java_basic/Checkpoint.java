package com.project.java_basic;

import java.util.Scanner;

public class Checkpoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score;

        System.out.print("กรุณากรอกคะแนน (0 - 100): ");

        // ตรวจสอบว่าผู้ใช้กรอกเลขหรือไม่
        if (scanner.hasNextDouble()) {
            score = scanner.nextDouble();

            // ตรวจสอบว่าคะแนนอยู่ในช่วงที่กำหนดหรือไม่
            if (score >= 0 && score <= 100) {
                if (score > 76) {
                    System.out.println("เกรด: H");
                } else if (score > 60 && score <= 75) {
                    System.out.println("เกรด: S");
                } else {
                    System.out.println("เกรด: U");
                }
            } else {
                System.out.println("กรุณากรอกคะแนนระหว่าง 0 ถึง 100 เท่านั้น");
            }
        } else {
            System.out.println("กรุณากรอกเฉพาะตัวเลขเท่านั้น");
        }

        scanner.close();
    }
}