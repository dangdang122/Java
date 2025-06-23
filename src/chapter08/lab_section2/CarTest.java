package chapter08.lab_section2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int axcelSpeed = 0;

        SchoolBus schoolBus = new SchoolBus();
        SportsCar sportsCar = new SportsCar();

        while(true) {
            System.out.println("Enter axcel speed(-1:quit) : ");
            axcelSpeed = s.nextInt();
            if (axcelSpeed == -1){
                System.out.println("자동차가 멈춥니다.");
                break;
            }
            schoolBus.upSpeed(axcelSpeed);
            sportsCar.upSpeed(axcelSpeed);

            System.out.println("** 스쿨버스의 현재 속도 : "+schoolBus.getSpeed());
            System.out.println("** 스쿨버스의 현재 속도 : "+ sportsCar.getSpeed());
        }
    }
}
