import java.util.Scanner;

public class WhileLoop {

    static Scanner scan = new Scanner(System.in);

    public static String fromHereToThere(int x, int y) {
        String num = "";
        while (x<=y) {
            if (x>y) {
                return "Invalid input";
        }
            num +=x+" ";
            x++;
        }

        return num;

    }

    public static int factors(int a) {
        int num = 12;
        System.out.println("factors(" + num + ")->The factors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        return num;
    }
    public static String CountPosAndNeg() {
        System.out.print("Enter a positive or negative number or 0 to quit: ");
        int num = scan.nextInt();
        int posCount = 0, negCount = 0;
        while( num != 0) {
            System.out.println(num);
            if (num>0) {
                posCount++;
            }
            else if (num<0) {
                negCount++;
            }
            num = scan.nextInt();
        }
        return "There were" + posCount + "positive and" + negCount + "negative numbers.";

    }
    public static int findMinAndMax(int num) {
        int max = num = 0;

    }
    public static void main(String [] args) {
        System.out.println(fromHereToThere(20,30));
        System.out.println(factors(12));
        CountPosAndNeg();
    }


}
