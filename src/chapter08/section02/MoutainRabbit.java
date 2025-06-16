package chapter08.section02;

public class MoutainRabbit extends Rabbit{
    String moutainName;
    public MoutainRabbit(){
        super();
        System.out.println("2.MoutainRabbit의 생성자가 실행됨.");
    }
    void eatWildglass(){
        System.out.println("집토끼는 사료를 먹는다.");
    }
}

