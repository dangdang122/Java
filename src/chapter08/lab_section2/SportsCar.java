package chapter08.lab_section2;

public class SportsCar  extends Car{
    public void upSpeed(int speed){
        super.upSpeed(speed);
        if (getSpeed() > 200) {
            setSpeed(200);
        }
    }
}
