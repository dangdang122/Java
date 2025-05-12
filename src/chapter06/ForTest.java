package chapter06;

import java.util.ArrayList;

public class ForTest {

    public static void main(String[] args) {
        String[] names = {"짱구", "맹구", "철수", "유리", "훈이"};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i < names.length; i++) {
            System.out.println(names[i] + " : 서울정수캠퍼스 인공지능소프트웨어과");
        }

        for(String name: names){
            System.out.println(name);
        }
    }
}
