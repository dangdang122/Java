package chapter06;

public class LAB_99 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){         //세로 구구단
            for (int j = 2; j <= 9; j++) {
                int u = j * i;
                System.out.printf("%d * %d = %d     ", j, i, u);
            }
            System.out.println(" ");
//            for (int i = 2; i <= 9; i++){       //가로 구구단
//                for (int j = 1; j <= 9; j++) {
//                    int k = i * j;
//                    System.out.printf("%d * %d = %d     ", i, j, k);
//                }
//                System.out.println(" ");
        }
    }
}