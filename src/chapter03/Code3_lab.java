package chapter03;

public class Code3_lab {
    public static void main(String[] args) {
        int buy = 0;
        int sell = 0;

        buy +=(900*10)+(3500*5);
        sell +=(1800 * 2)+(4000*4)+1500+(2000*4)+(1800*5);

        int qwer = sell - buy;
        System.out.printf("오늘 판매금액 %d (원)이고 구매 금액 %d (원)입니다\n", sell,buy);
        System.out.printf("오늘 일일 매출은 %d 입니다\n", qwer);



    }
}
