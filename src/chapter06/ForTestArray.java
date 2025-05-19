package chapter06;

public class ForTestArray {
    public static void main(String[] args) {
        String[][] teamName = {{"김","김","김","김"}, {}, {}};

        for(int i =0; i< teamName.length; i++) {
            System.out.printf(i+ 1 +"팀: ");
            for(int j= 0; j< teamName[i].length; j++) {
                System.out.printf("%s\t", teamName[i][j]);
            }
        }
    }
}