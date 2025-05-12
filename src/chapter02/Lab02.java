package chapter02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 정수 값 : ");
        int num1 = s.nextInt();

        System.out.print("두번째 정수 값 : ");
        int num2 = s.nextInt();

//        System.out.println("더하기 : " + (num1 + num2));
//        System.out.println("빼기 : " + (num1 - num2));
//        System.out.println("곱하기 : " + (num1 * num2));
//        System.out.println("나누기 : " + (num1 / num2));
//        System.out.println("나머지 값 : " + (num1 % num2));

        int add = num1 + num2;
        int sub = num1 - num2;
        int sum = num1 * num2;
        int mul = num1 / num2;
        int ing = num1 % num2;

//        System.out.println(add);
//        System.out.println(sub);
//        System.out.println(sum);
//        System.out.println(mul);
//        System.out.println(ing);
        System.out.printf("%d + %d = %d\n", num1, num2, add);
        System.out.printf("%d - %d = %d\n", num1, num2, sub);
        System.out.printf("%d * %d = %d\n", num1, num2, sum);
        System.out.printf("%d / %d = %d\n", num1, num2, mul);
        System.out.printf("%d %% %d = %d\n", num1, num2, ing);

    }
}

