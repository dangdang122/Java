package chapter03;

import java.util.Scanner;

public class Code3_06 {
    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter num1: ");
//        int num1 = s.nextInt();
//        System.out.println("Enter num2: ");
//        int num2 = s.nextInt();
//
//        double result = Math.pow(num1, num2);
//
//        System.out.printf("%d의 %d 제곱승은 %.0f 입니다. ", num1, num2, result);
//        s.close();

        Scanner s = new Scanner(System.in);
        System.out.println("파운드(Ib)를 입력하세요 : ");
        double num1 = s.nextInt();
        System.out.println("킬로그램(kg)를 입력하세요 : ");
        double num2 = s.nextInt();

        double result1 = num1 * 0.453592;
        double result2 = num2 * 2.204623;

        System.out.printf("%.1f\t파운드\t(Ib)는\t%.15f\t킬로그램(kg)\t입니다.\n", num1, result1);
        System.out.printf("%.1f\t킬로그램\t(kg)은\t%.15f\t파운드(Ib)\t입니다.\n", num2, result2);
        s.close();
    }
}
