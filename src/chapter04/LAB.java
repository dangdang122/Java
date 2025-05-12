package chapter04;

import java.util.Scanner;

public class LAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 과목을 입력해주세요 : ");
        String str1 = sc.nextLine();
        System.out.print("두 번째 과목을 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.print("세 번째 과목을 입력해주세요 : ");
        String str3 = sc.nextLine();

        System.out.printf("%s 과목의 이수학점을 입력해주세요 : ",str1);
        int int1 = sc.nextInt();
        System.out.printf("%s 과목의 이수학점을 입력해주세요 : ",str2);
        int int2 = sc.nextInt();
        System.out.printf("%s 과목의 이수학점을 입력해주세요 : ",str3);
        int int3 = sc.nextInt();

        System.out.printf("%s 과목의 성적을 입력해주세요 : ", str1);
        float float1 = sc.nextFloat();
        System.out.printf("%s 과목의 성적을 입력해주세요 : ", str2);
        float float2 = sc.nextFloat();
        System.out.printf("%s 과목의 성적을 입력해주세요 : ", str3);
        float float3 = sc.nextFloat();

        float num = ((int1*float1)+(int2*float2)+(int3*float3))/(int1+int2+int3);

        System.out.printf("평균 학점은 %.2f", num);
    }
}