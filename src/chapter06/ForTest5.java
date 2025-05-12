package chapter06;

public class ForTest5 {
    public static void main(String[] args) {
        //500~ 1000 사이의 짝수의 합계를 구하시오.
        int n = 1000;
        int sum = 0;
        String oddEven = "짝수";
//        for(int i = 500; i <= n; i+=2){
//            sum += 1;
//            oddEven = "짝수";
//        }
        for (int i =500; i <= n; i++){
            if (i %2 == 0){
                sum += i;
            }
        }
        System.out.println("1 ~ " + n+ "까지의 " +oddEven + "의 합계는"+sum+"이다.");
    }
}
