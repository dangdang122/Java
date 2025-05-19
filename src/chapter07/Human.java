package chapter07;

public class Human {
    String name;
    int age;

    public void walk(String place){
        System.out.println(name + "(이)가" + place +"걷는다.");
    }
    public void eat(String food){
        System.out.println(name + "(이)가" + food + "을(를) 먹는다.");
    }
}
