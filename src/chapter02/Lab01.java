package chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("받는사람 : ");
        String name = s.nextLine();

        System.out.print("주소 : ");
        String wnth = s.nextLine();

        System.out.print("무게 (g) : ");
        double num = s.nextDouble();

        System.out.println("** 받는사람 ==>" + name + "님");
        System.out.println("** 주소 ==>" + wnth);
        System.out.println("** 배송비 ==>:" + num * 5 + "원");

    }
}
