package chapter08.section02;
//super class는 상속받는 sub  class가 모두 갖고있는 속성(필드)과 기능(메소드)으로 구현합니다.
public class Rabbit {
    String shape;
    int x,y;

    public Rabbit() {
        super();
        System.out.println("1.Rabbit의 생성자가 실행됨.");
    }
    void move(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("\n");
    }
}
