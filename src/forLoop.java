import java.util.Scanner;

public class forLoop {
    Scanner scan = new Scanner(System.in);

    public static String printingHashTags(int num) {
        String blank = " ";
        for (int i = 0; i < num; i++) {
            blank += "#";
        }
        return blank;
    }

    public static String countdown(int num, int num2) {
        String count = "";
        if (num > num2) {
            return "";
        }
        for (int x = 10; x >= num; x -= 1) {
            count += x + " ";
        }
        return count;
    }

    public static String countdown2(int num, int num2) {
        String count2 = "";
        int start;
        int end;
        if (num > num2) {
            start = num;
            end = num2;
        } else {
            start = num2;
            end = num;
        }

        for (int x = start; x >= end; x -= 1) {
            count2 += x + " ";
        }
        return count2;

    }

    public static int sumNumbers(int num, int num2) {
        int total = 0;
        int start;
        int end;
        if (num > num2) {
            start = num;
            end = num2;
        } else {
            start = num2;
            end = num;
        }
        for (int x = end; x <= start; x++) {
            total += x;

        }
        return total;

    }


    public static void main(String[] args) {
        System.out.println(printingHashTags(7));
        //System.out.print(countdown(10, 0));
        //System.out.print(countdown2(0,10));
        //System.out.print(sumNumbers(10,5));
    }
}
