import java.util.Scanner;

public class WhileLoop {
    static Scanner scan = new Scanner(System.in);
    public static String fromHereToThere(int x, int y) {
        String num = "";
        while (x<y) {
            num +=x+" ";
            x++;
        }
        return num;

    }
    public static String factors(int a) {

    }

}
