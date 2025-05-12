package chapter04;

public class Lab04_1 {
    public static void main(String[] args) {
//        String str1 = "블랙핑크";
//        System.out.println("원본 문자열" + str1);

//        System.out.println("거꾸로 문자열: ");
//        for (int i = str1.length()-1; i >= 0; i--) {
//            System.out.println(str1.charAt(i));
//        }

//        for (int i = 0; i < str1.length(); i++) {
//            System.out.println(str1.charAt(i));
//        }

        String str2 = "Java";
        String str3= str2.replaceAll("J", "j");
        System.out.println(str3);

        String str4 = str2.substring(0, 1).toLowerCase();
        str4 += str2.substring(1,2).toUpperCase();
        str4 += str2.substring(2,3).toUpperCase();
        str4 += str2.substring(3,4).toUpperCase();

        System.out.println("str2의 원본 문자열: " + str2);
        System.out.println("str2의 원본 문자열: " + str4);
    }
}