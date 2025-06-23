package chapter08.section03;
//추상 클래스는 new 연산자를 사용한 객체 생성이 불가능
//추상 클래스가 객체화(메모리에 할당)돼서 필드와 메소드를 사용하려면
//sub(자식)클래스를 통해서 객체화해서 사용한다.
//추상 클래스의 용도: 자식클래스들에게 특정기능들을 표준화(약속) 시키기 위해 사용한다.
//약속을 지킨 sub클래스는 부모의 필드와 메소드를 사용할 수 있다.
//약속을 정하는 메소드 : 추상메소드(abstract)
abstract public class Rabbit {
    String shape;
    int x, y;

    abstract public void move(int x, int y);

    public void eat(String food) {
        System.out.println("rabbit eat " +shape+ "eats" +food);
    }
}
