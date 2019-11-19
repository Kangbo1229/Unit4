import java.util.Scanner;

public class forLoop {
    Scanner scan = new Scanner(System.in);

    public static String printingHashTags(int num) {
        String blank = "";
        for (int i = 0; i < num; i++) {
            blank += "#";
        }
        return blank;
    }

        public static String countdown(int num, int num2) {
            String count = "";
            for (int x = 10; x >= num; x -= 1) {
                count += x+" ";
            }
            return count;
        }

        public static String countdown2(int num, int num2) {
            String count2 = "";
            for (int x = 10; x <= num; x -= 1) {
                count2 += x+" ";
            }
            return count2;

        }
        public static void main(String[] args) {
            //System.out.println(printingHashTags(20));
            //System.out.print(countdown(0, 10));
            System.out.print(countdown2(10,0));


        }
}

