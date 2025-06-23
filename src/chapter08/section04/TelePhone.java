package chapter08.section04;

public class TelePhone implements Phone {


    @Override
    public void callPhone(String PhoneNumber) {
        System.out.println("TelePhone calling " + PhoneNumber);
    }

    @Override
    public void receivePhone(String PhoneNumber) {
        System.out.println("TelePhone recieving " + PhoneNumber);
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



    public void answeringMachine(String message){
        System.out.println(message);
    }






}
