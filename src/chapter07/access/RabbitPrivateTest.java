package chapter07.access;

public class RabbitPrivateTest {
    public static void main(String[] args) {
        RabbitPraivate r1 = new RabbitPraivate();
        r1.setShape("Rectangle");
        r1.setPosition(50,100);
        System.out.println("토끼모양: "+r1.getShape());
        System.out.println("토끼 현재 위치("+r1.getX()+","+r1.getY()+")");

        System.out.printf("토끼 모양은 [%s]입니다.\n", r1.getShape());
        System.out.printf("토끼 위치는( %d, %d)입니다.\n" ,r1.getX(),r1.getY());
    }
}