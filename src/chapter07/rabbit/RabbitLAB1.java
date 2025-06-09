package chapter07.rabbit;

import java.util.Scanner;

public class RabbitLAB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rabbit rabbit1 = new Rabbit();
        int x = 0, y = 0;

        while (true){
            System.out.print("토끼가 이동할 X좌표: ");
            x = sc.nextInt();
            System.out.print("토끼가 이동할 Y좌표: ");
            y = sc.nextInt();

            rabbit1.setPosition(x,y);
            rabbit1.move();
        }
    }
}
