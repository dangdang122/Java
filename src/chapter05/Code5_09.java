package chapter05;

import java.util.Calendar;

public class Code5_09 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK); //0~6

        System.out.println("현재 요일 번호:"+day);
        char daych = 0;

        switch (day) {
//            case 1: daych ='일';
//            break;
//            case 2: daych ='월';
//            break;
//            case 3: daych ='화';
//            break;
//            case 4: daych ='수';
//            break;
//            case 5: daych ='목';
//            break;
//            case 6: daych ='금';
//            break;
//            case 7: daych ='토';
//            break;
            case Calendar.SUNDAY:daych ='일';
                break;
            case Calendar.MONDAY:daych ='월';
                break;
            case Calendar.TUESDAY:daych ='화';
                break;
            case Calendar.WEDNESDAY:daych ='수';
                break;
            case Calendar.THURSDAY:daych ='목';
                break;
            case Calendar.FRIDAY:daych ='금';
                break;
            case Calendar.SATURDAY:daych ='토';
                break;
        }
        System.out.println("오늘은" +daych+ "요일입니다.");
    }
}
