package chapter03;

import java.util.Scanner;

public class Code3_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("당신의 점수를 입력해주세요");
        int num = s.nextInt();

        if (num < 70){
            System.out.println("아쉽게도 탈락입니다");
        }
        else System.out.println("축하합니다! 합격입니다");
    }
}