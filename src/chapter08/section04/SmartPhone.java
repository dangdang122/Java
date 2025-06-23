package chapter08.section04;

public class SmartPhone implements Phone{


    @Override
    public void callPhone(String PhoneNumber) {
        System.out.println("SmartPhone calling " + PhoneNumber);
    }

    @Override
    public void receivePhone(String PhoneNumber) {
        System.out.println("SmartPhone recieving " + PhoneNumber);
    }

    public void sendSMS(String PhoneNumber, String message) {
        System.out.println("Sending SMS to " + PhoneNumber);
        System.out.println(message);
    }


    public void receiveSMS(String PhoneNumber, String message) {
        System.out.println("Sending SMS to " + PhoneNumber);
        System.out.println(message);
    }

    public void installApp(String appName){
        System.out.println("installing app" + appName);
    }



}
