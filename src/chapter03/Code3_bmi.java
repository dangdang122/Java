package chapter03;

import java.util.Scanner;

public class Code3_bmi {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("체중을 입력해주세요 : ");
        double kg = s.nextInt();
        System.out.println("당신의 키를 입력해주세요 : ");
        double cm = s.nextInt();

        double m = cm /100;
        double result = m*m;
        double bmi = kg / result;
        System.out.printf("체중 %.1f kg 키 %.1f cm 이므로 BMI 지수는 %.3f 입니다", kg, cm, bmi);
        s.close();

    }
}
