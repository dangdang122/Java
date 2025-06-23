package chapter08.section04;

public class PhoneTest {
    public static void main(String[] args) {
        TelePhone telephone = new TelePhone();
        FeaturePhone featurePhone = new FeaturePhone();
        SmartPhone smartPhone = new SmartPhone();

        telephone.answeringMachine("지금은 전화를 받을 수 없습니다");
        telephone.callPhone("010-1111-1234");
        telephone.receivePhone("010-2222-1234");


    }
}
